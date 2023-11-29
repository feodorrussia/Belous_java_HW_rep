public class Main {
    public static void main(String[] args) {
        // Логические операторы
        boolean isTrue = true;
        boolean isFalse = false;

        System.out.println("Логическое И: " + (isTrue && isFalse));  // Вывод: false
        System.out.println("Логическое ИЛИ: " + (isTrue || isFalse));  // Вывод: true
        System.out.println("Логическое НЕ: " + (!isTrue));  // Вывод: false

        // Тернарная операция
        int x = 5;
        int y = 10;
        int min = (x < y) ? x : y;
        System.out.println("Минимальное значение: " + min);  // Вывод: 5

        // Поразрядные логические операции
        int a = 6;  // Бинарное представление: 0110
        int b = 3;  // Бинарное представление: 0011

        int bitAnd = a & b;  // Поразрядное И: 0010 (2 в десятичной системе)
        int bitOr = a | b;  // Поразрядное ИЛИ: 0111 (7 в десятичной системе)
        int bitXor = a ^ b;  // Поразрядное исключающее ИЛИ: 0101 (5 в десятичной системе)
        int bitNot = ~a;  // Поразрядная инверсия: 1001 (-7 в десятичной системе)

        System.out.println("Поразрядное И: " + bitAnd);  // Вывод: 2
        System.out.println("Поразрядное ИЛИ: " + bitOr);  // Вывод: 7
        System.out.println("Поразрядное исключающее ИЛИ: " + bitXor);  // Вывод: 5
        System.out.println("Поразрядная инверсия: " + bitNot);  // Вывод: -7

        // Операции сдвига
        int number = -10;  // Бинарное представление: 10001010

        int leftShift = number << 2;  // Сдвиг влево на 2 бита: 10101000 (-40 в десятичной системе)
        int rightShift = number >> 2;  // Сдвиг вправо на 2 бита: 10000010 (-3 в десятичной системе)
        int zeroFillRightShift = number >>> 2;  // Сдвиг вправо с заполнением нулями: 01000010 (2 в десятичной системе)

        System.out.println("Сдвиг влево: " + leftShift);  // Вывод: -40
        System.out.println("Сдвиг вправо: " + rightShift);  // Вывод: -3
        System.out.println("Сдвиг вправо с заполнением нулями: " + zeroFillRightShift);  // Вывод: 1073741821
    }
}
