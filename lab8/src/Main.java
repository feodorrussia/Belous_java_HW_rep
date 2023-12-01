import MyClass.MyClass;

import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Main {
    public static void printClassInfo(Class<?> obj) {
        System.out.println("Имя класса: " + obj.getName());

        int modifiers = obj.getModifiers();
        System.out.print("Модификаторы доступа: ");
        if (Modifier.isPublic(modifiers)) {
            System.out.print("public ");
        }
        if (Modifier.isAbstract(modifiers)) {
            System.out.print("abstract ");
        }
        if (Modifier.isFinal(modifiers)) {
            System.out.print("final ");
        }
        if (Modifier.isInterface(modifiers)) {
            System.out.print("interface ");
        }
        if (Modifier.isStatic(modifiers)) {
            System.out.print("static ");
        }
        System.out.println();

        System.out.println("Унаследованный класс: " + obj.getSuperclass().getName());

        Class<?>[] interfaces = obj.getInterfaces();
        System.out.print("Интерфейсы: " + (interfaces.length == 0 ? "[]" : ""));
        for (Class<?> anInterface : interfaces) {
            System.out.print(anInterface.getName() + " ");
        }
        System.out.println();

        Field[] fields = obj.getDeclaredFields();
        System.out.println("Поля класса: " + (fields.length == 0 ? "[]" : ""));
        for (Field field : fields) {
            System.out.println("Имя: " + field.getName());
            System.out.println("Тип: " + field.getType().getName());
            System.out.print("Модификаторы доступа: ");
            int fieldModifiers = field.getModifiers();
            if (Modifier.isPublic(fieldModifiers)) {
                System.out.print("public ");
            }
            if (Modifier.isPrivate(fieldModifiers)) {
                System.out.print("private ");
            }
            if (Modifier.isProtected(fieldModifiers)) {
                System.out.print("protected ");
            }
            if (Modifier.isStatic(fieldModifiers)) {
                System.out.print("static ");
            }
            System.out.println();
        }

        Method[] methods = obj.getDeclaredMethods();
        System.out.println("Методы класса: " + (methods.length == 0 ? "[]" : ""));
        for (Method method : methods) {
            System.out.println("Имя: " + method.getName());
            System.out.println("Возвращаемый тип: " + method.getReturnType().getName());
            Class<?>[] methodParams = method.getParameterTypes();
            System.out.print("Параметры: " + (methodParams.length == 0 ? "[]" : ""));
            for (Class<?> param : methodParams) {
                System.out.print(param.getName() + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MyClass obj1 = new MyClass(19, "nineteen");
        Class<?> wrap = obj1.getClass();
        printClassInfo(wrap);
    }
}