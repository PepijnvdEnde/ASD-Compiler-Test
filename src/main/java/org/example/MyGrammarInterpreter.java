package org.example;


import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.example.listner.MyGrammarBaseVisitor;
import org.example.listner.MyGrammarLexer;
import org.example.listner.MyGrammarParser;

import javax.tools.*;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class MyGrammarInterpreter extends MyGrammarBaseVisitor<Void> {
    private StringBuilder javaCode = new StringBuilder();

    private String outputFilename;

    @Override
    public Void visitSpelerssituatie(MyGrammarParser.SpelerssituatieContext ctx) {
        int value = Integer.parseInt(ctx.INT().getText());
        String attribute = ctx.attribuut().getText();
        String operator = ctx.operator().getText();

        if (operator.equals("kleiner dan")) {
            operator = " < ";
        } else if (operator.equals("groter dan")) {
            operator = " > ";
        }

        javaCode.append("Field ").append(attribute).append("Field = character.getClass().getField(\"").append(attribute).append("\");\n");
        javaCode.append("int ").append(attribute).append(" = ").append(attribute).append("Field.getInt(character);\n");
        javaCode.append("if(").append(attribute).append(operator).append(value).append(") {\n");

        if (ctx.actie() != null) {
            visit(ctx.actie());
        }
        javaCode.append("}\n");

        return null;
    }


    @Override
    public Void visitLoop(MyGrammarParser.LoopContext ctx) {
        String direction = ctx.parameter().getText();

        javaCode.append("try {\n");
        javaCode.append("character.getClass().getMethod(\"doAction\", String.class).invoke(character, \"loop ").append(direction).append("\");\n");
        javaCode.append("return;} catch (Exception e) {\n");
        javaCode.append("throw new RuntimeException(e);\n");
        javaCode.append("}\n");

        return null;
    }

    public void GenerateBytecode() {
        javaCode.append("} catch (NoSuchFieldException | IllegalAccessException e) {\n");
        javaCode.append("throw new RuntimeException(e);\n");
        javaCode.append("}\n");
        javaCode.append("}\n");
        javaCode.append("}\n");

        compileCode();
    }

    private void compileCode() {
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        DiagnosticCollector<JavaFileObject> diagnostics = new DiagnosticCollector<>();
        JavaFileObject file = new SimpleJavaFileObject(
                URI.create("string:///" + outputFilename + ".java"), JavaFileObject.Kind.SOURCE) {
            public CharSequence getCharContent(boolean ignoreEncodingErrors) {
                return javaCode;
            }
        };

        Iterable<? extends JavaFileObject> compilationUnits = Arrays.asList(file);
        StandardJavaFileManager fileManager = compiler.getStandardFileManager(null, null, null);

        try {
            fileManager.setLocation(StandardLocation.CLASS_OUTPUT, Arrays.asList(new File("src/main/resources")));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        JavaCompiler.CompilationTask task = compiler.getTask(null, fileManager, diagnostics, null, null, compilationUnits);
        boolean success = task.call();

        for (Diagnostic diagnostic : diagnostics.getDiagnostics()) {
            System.out.println(diagnostic);
        }
    }

    public void generateClass(String outputFilename, String inputFilename) throws IOException {
        this.outputFilename = outputFilename;

        String basepath = "src/main/resources/";
        Path inputPath = Paths.get(basepath + inputFilename + ".txt");
        String input = Files.readString(inputPath);

        MyGrammarLexer lexer = new MyGrammarLexer(CharStreams.fromString(input));
        MyGrammarParser parser = new MyGrammarParser(new CommonTokenStream(lexer));
        MyGrammarParser.AgentContext program = parser.agent();

        generateStartCode();
        visit(program);
        GenerateBytecode();
    }

    private void generateStartCode() {
        javaCode.append("import java.lang.reflect.Field;\n");
        javaCode.append("public class ");
        javaCode.append(outputFilename);
        javaCode.append("{\n");
        javaCode.append("public static <T> void getAction(T character) {\n");
        javaCode.append("try {\n");
    }
}
