package org.example;

import org.antlr.v4.runtime.*;
import org.example.listner.*;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
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
            CustomClassLoader customClassLoader = new CustomClassLoader();

            interpreter.visit(program);

            interpreter.GenerateBytecode();


            Class<?> clazz = customClassLoader.findClass("output");
            customClassLoader.loadClass("output");
            Object instance = clazz.getDeclaredConstructor().newInstance();

            Method method = clazz.getMethod("main", String[].class);

            method.invoke(instance, new String[1]);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
}
