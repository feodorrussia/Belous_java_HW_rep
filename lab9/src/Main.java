import MyClass.MyClass;

import java.lang.reflect.*;

public class Main {
    public static void main(String[] args) {
        try {
            String className = "MyClass.MyClass";
            System.out.println("Class name: " + className);

            Class<?> instance = Class.forName(className);
            Constructor<?> constructor = instance.getConstructor(int.class, String.class);
            Object copyOfObj = constructor.newInstance(10, "ten");

            String methodName1 = "setAge";
            String methodName2 = "setDescription";
            String methodName3 = "print";

            Method method = instance.getMethod(methodName1, int.class);
            method.invoke(copyOfObj, 5);

            method = instance.getMethod(methodName3);
            method.invoke(copyOfObj);

            method = instance.getMethod(methodName2, String.class);
            method.invoke(copyOfObj, "five");

            method = instance.getMethod(methodName3);
            method.invoke(copyOfObj);
        } catch (ClassNotFoundException e) {
            System.err.println("Класс не найден: " + e.getMessage());
        } catch (NoSuchMethodException e) {
            System.err.println("Метод не найден: " + e.getMessage());
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
            System.err.println("Ошибка при создании экземпляра класса или вызове метода: " + e.getMessage());
        }
    }
}