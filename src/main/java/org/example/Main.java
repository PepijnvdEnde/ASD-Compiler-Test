package org.example;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) {
        try {
            String outputFile = "Joostie";
            MyGrammarInterpreter interpreter = new MyGrammarInterpreter();

            interpreter.generateClass(outputFile, "input");

            CustomClassLoader customClassLoader = new CustomClassLoader();

            customClassLoader.getAction(outputFile,new Player(5, 120, 1000));

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
