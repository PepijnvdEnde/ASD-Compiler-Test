package org.example;

import org.antlr.v4.runtime.*;
import org.example.listner.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        String input = "loop 5 keer naar onder";

        MyGrammarLexer lexer = new MyGrammarLexer(CharStreams.fromString(input));
        MyGrammarParser parser = new MyGrammarParser(new CommonTokenStream(lexer));
        MyGrammarParser.ProgramContext program = parser.program();

        MyGrammarInterpreter interpreter = new MyGrammarInterpreter();
        interpreter.visit(program);

        String javaCode = interpreter.getJavaCode();

        try {
            Files.write(Paths.get("output.java"), javaCode.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}