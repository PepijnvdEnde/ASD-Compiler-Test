package org.example;

import org.antlr.v4.runtime.*;
import org.example.listner.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        try {
            Path inputPath = Paths.get("src/main/resources/Input.txt");
            String input = Files.readString(inputPath);

            MyGrammarLexer lexer = new MyGrammarLexer(CharStreams.fromString(input));
            MyGrammarParser parser = new MyGrammarParser(new CommonTokenStream(lexer));
            MyGrammarParser.ProgramContext program = parser.program();

            MyGrammarInterpreter interpreter = new MyGrammarInterpreter();
            interpreter.visit(program);

            interpreter.GenerateBytecode();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
