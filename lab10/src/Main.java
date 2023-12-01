import Triple.Triple;

public class Main {
    public static void printTripleInfo(Triple<?> obj) {
        try {
            System.out.println("First: " + obj.getFirst());
            System.out.println("Second: " + obj.getSecond());
            System.out.println("Third: " + obj.getThird());
            System.out.println("Min: " + obj.min());
            System.out.println("Max: " + obj.max());
            System.out.println("Mean: " + obj.mean());
            System.out.println();
        } catch (RuntimeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Triple<Integer> triple1 = new Triple<>(10, 5, 7);
        triple1.setSecond(10);
        triple1.setThird(2);
        printTripleInfo(triple1);

        Triple<Character> triple2 = new Triple<>('A', 'b', 'L');
        triple2.setFirst('5');
        printTripleInfo(triple2);
    }
}