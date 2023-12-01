package MyClass;

public class MyClass {
    private int value;
    private String description;

    public MyClass(int value, String description) {
        this.value = value;
        this.description = description;
    }

    public int getValue() {
        return value;
    }

    public void print() {
        System.out.println("Value: " + value);
        System.out.println("Description: " + description);
        System.out.println();
    }
}
