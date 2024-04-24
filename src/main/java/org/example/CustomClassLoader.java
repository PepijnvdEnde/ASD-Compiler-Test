package org.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class CustomClassLoader extends ClassLoader {
    @Override
    public Class findClass(String name) throws ClassNotFoundException {
        byte[] b;
        try {
            b = loadClassFromFile(name);
        } catch (IOException e) {
            throw new ClassNotFoundException("Could not load class " + name, e);
        }
        return defineClass(name, b, 0, b.length);
    }

    private byte[] loadClassFromFile(String fileName) throws IOException {
            File file = new File("src/main/resources/" + fileName.replace('.', File.separatorChar) + ".class");
        int length = (int) file.length();
        byte[] buffer = new byte[length];
        try (InputStream inputStream = new FileInputStream(file)) {
            int read = inputStream.read(buffer, 0, length);
            if (read != length) {
                throw new IOException("Could not read the entire class file " + fileName);
            }
        }
        return buffer;
    }

    public String getAction(String filename,Object parameters) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Class<?> clazz = findClass(filename);
        Object instance = clazz.getDeclaredConstructor().newInstance();

        Method method = clazz.getMethod("getAction", Object.class);

       return (String) method.invoke(instance, parameters);
    }
}
