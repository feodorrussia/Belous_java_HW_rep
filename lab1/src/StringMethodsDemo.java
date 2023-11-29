public class StringMethodsDemo {
    public static void main(String[] args) {
        String str = "Hello, World!";

        // Методы для получения информации о строке
        System.out.println("Длина строки: " + str.length());
        System.out.println("Символ по индексу 7: " + str.charAt(7));
        System.out.println("Индекс первого вхождения символа 'o': " + str.indexOf('o'));
        System.out.println("Индекс последнего вхождения символа 'o': " + str.lastIndexOf('o'));
        System.out.println("Субстрока от индекса 7 до 12: " + str.substring(7, 12));

        // Методы для изменения строки
        System.out.println("Строка в верхнем регистре: " + str.toUpperCase());
        System.out.println("Строка в нижнем регистре: " + str.toLowerCase());
        System.out.println("Строка без начальных и конечных пробелов: " + str.trim());
        System.out.println("Замена символа 'o' на символ 'e': " + str.replace('o', 'e'));

        // Методы для сравнения строк
        String str2 = "hello, world!";
        System.out.println(str + " | " + str2);
        System.out.println("Сравнение строк с учетом регистра: " + str.equals(str2));
        System.out.println("Сравнение строк без учета регистра: " + str.equalsIgnoreCase(str2));

        // Методы для проверки содержимого строки
        System.out.println("Строка начинается с символа 'H': " + str.startsWith("H"));
        System.out.println("Строка заканчивается на символ 'd': " + str.endsWith("d"));
        System.out.println("Строка содержит подстроку 'Wor': " + str.contains("Wor"));

        // Примеры сложения строк
        String firstName = "Fyodor";
        String lastName = "Belous";
        String fullName = firstName + " " + lastName;
        System.out.println("Полное имя: " + fullName);

        // Примеры сложения строки с другими типами данных
        int age = 20;
        String message = "I am " + age + " years old.";
        System.out.println(message);

        // Определение null
        String nullableString = null;
        System.out.println("Строка message является null: " + (message == null));
        System.out.println("Строка nullableString является null: " + (nullableString == null));

        // Операция join
        String[] words = {"Hello", "world", "!"};
        System.out.println("Соединенная строка: " + String.join(" ", words));
    }
}
