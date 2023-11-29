
public class Main {

    // switch с использованием переменной типа int
    public static void int_switch(int number) {
        switch (number) {
            case 1 -> System.out.println("Number is 1");
            case 2 -> System.out.println("Number is 2");
            default -> System.out.println("Number is not 1 or 2");
        }
    }

    // switch с использованием переменной типа char
    public static void char_switch(char letter) {
        switch (letter) {
            case 'A' -> System.out.println("The letter is A");
            case 'B' -> System.out.println("The letter is B");
            default -> System.out.println("The letter is not A or B");
        }
    }

    // switch с использованием переменной типа String
    public static void string_switch(String text) {
        switch (text) {
            case "hello" -> System.out.println("Text is hello");
            case "world" -> System.out.println("Text is world");
            default -> System.out.println("Text is neither hello nor world");
        }
    }

    public static void main(String[] args) {

        // test int switch
        int n1 = 2, n2 = 1, n3 = 10;
        int_switch(n1);
        int_switch(n2);
        int_switch(n3);

        // test char switch
        char l1 = 'A', l2 = 'B', l3 = 'C';
        char_switch(l1);
        char_switch(l2);
        char_switch(l3);

        // test String switch
        String str1 = "hello", str2 = "world", str3 = "Hello, world!";
        string_switch(str1);
        string_switch(str2);
        string_switch(str3);




    }
}