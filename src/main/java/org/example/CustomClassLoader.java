package org.example;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CustomClassLoader extends ClassLoader {
    @Override
    public Class findClass(String name) throws ClassNotFoundException {
        try {
            byte[] classData = loadClassFromFile(name);

            return defineClass(name, classData, 0, classData.length);
        } catch (IOException e) {
            throw new ClassNotFoundException("Could not load class " + name, e);
        }
    }


    private byte[] loadClassFromFile(String fileName) throws IOException {
        return Files.readAllBytes(
                Paths.get("src/main/resources/" + fileName.replace('.', File.separatorChar) + ".class")
        );
    }

    public String getAction(String filename, Object parameters) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> agent = findClass(filename);

        return (String) agent.getMethod("getAction", Object.class).invoke(agent.getDeclaredConstructor().newInstance(), parameters);
    }
}
