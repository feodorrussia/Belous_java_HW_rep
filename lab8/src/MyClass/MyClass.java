package MyClass;

public class MyClass {
    private int value;
    private String description;

    public MyClass(int value, String description) {
        this.value = value;
        this.description = description;
    }

    public String getValue() {
        return description;
    }

    public int getDescription() {
        return value;
    }

    public void print() {
        System.out.println("Value: " + value);
        System.out.println("Description: " + description);
        System.out.println();
    }
}
