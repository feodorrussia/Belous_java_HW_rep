public class Main {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("Аргументы командной строки:");
            for (String arg : args) {
                System.out.println(arg);
            }
        } else {
            System.out.println("Аргументы командной строки отсутствуют.");
        }
    }
}