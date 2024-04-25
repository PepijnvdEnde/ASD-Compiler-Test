package org.example;


import org.example.listner.MyGrammarBaseVisitor;
import org.example.listner.MyGrammarParser;

import javax.tools.*;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.util.Arrays;
import java.util.List;

public class MyGrammarInterpreter extends MyGrammarBaseVisitor<Void> {
    private StringBuilder javaCode = new StringBuilder();
    public MyGrammarInterpreter() {
        javaCode.append("public class output {\npublic static void main(String[] args) {\nint hp = 5;\nint spd = 120;\n");
    }

    @Override
    public Void visitConditionalLoopStatement(MyGrammarParser.ConditionalLoopStatementContext ctx) {
        int value = Integer.parseInt(ctx.INT().getText());
        String attribuut = ctx.attribuut().getText();
        String operator = ctx.operator().getText();
        if (operator.equals("kleiner dan")) {
            operator = " < ";
        } else if (operator.equals("groter dan")) {
            operator = " > ";
        }

        javaCode.append("if (").append(attribuut).append(operator).append(value ).append(") {\n");

        if (ctx.loopStatement() != null) {
            visit(ctx.loopStatement());
        }
        javaCode.append("}\n");

        return null;
    }

    @Override
    public Void visitLoopStatement(MyGrammarParser.LoopStatementContext ctx) {
        if (ctx.meerdereLoopStatement() != null) {
            visit(ctx.meerdereLoopStatement());
        } else if (ctx.enkelLoopStatement() != null) {
            visit(ctx.enkelLoopStatement());
        }

        return null;
    }

    @Override
    public Void visitMeerdereLoopStatement(MyGrammarParser.MeerdereLoopStatementContext ctx) {
        int times = Integer.parseInt(ctx.INT().getText());
        String direction = ctx.direction().getText();

        javaCode.append("for (int i = 0; i < ").append(times).append("; i++) {\n");
        javaCode.append("System.out.println(\"loop naar ").append(direction).append("\");\n");
        javaCode.append("}\n");

        return null;
    }

    @Override
    public Void visitEnkelLoopStatement(MyGrammarParser.EnkelLoopStatementContext ctx) {
        String direction = ctx.direction().getText();

        javaCode.append("System.out.println(\"loop naar ").append(direction).append("\");\n");

        return null;
    }

    public void GenerateBytecode() {
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        DiagnosticCollector<JavaFileObject> diagnostics = new DiagnosticCollector<>();

        JavaFileObject file = new SimpleJavaFileObject(
                URI.create("string:///output.java"), JavaFileObject.Kind.SOURCE) {
            public CharSequence getCharContent(boolean ignoreEncodingErrors) {
                return javaCode.toString() + "}\n}";
            }
        };

        Iterable<? extends JavaFileObject> compilationUnits = Arrays.asList(file);

        StandardJavaFileManager fileManager = compiler.getStandardFileManager(null, null, null);
        try {
            fileManager.setLocation(StandardLocation.CLASS_OUTPUT, Arrays.asList(new File("src/main/resources")));
        } catch (IOException e) {
            e.printStackTrace();
        }

        JavaCompiler.CompilationTask task = compiler.getTask(null, fileManager, diagnostics, null, null, compilationUnits);
        boolean success = task.call();

        for (Diagnostic diagnostic : diagnostics.getDiagnostics()) {
            System.out.println(diagnostic);
        }
        System.out.println(success ? "Compilation was successful" : "Compilation failed");
        System.out.println(javaCode);
    }
}

