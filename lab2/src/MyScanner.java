import java.util.Scanner;

public class MyScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите произвольное число слов (разделенных пробелами):");

        while (scanner.hasNext()) {
            String word = scanner.next();
            System.out.println("Слово: " + word);
        }

        scanner.close();

    }
}