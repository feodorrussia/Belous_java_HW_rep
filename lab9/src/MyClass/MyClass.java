package MyClass;

public class MyClass {
    private int value = 10;
    private String description = "ten";

    public MyClass(int value, String description) {
        this.value = value;
        this.description = description;
    }

    public int getAge() {
        return value;
    }

    public String getDescription() {
        return description;
    }

    public void setAge(int value) {
        this.value = value;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void print() {
        System.out.println("Value: " + value);
        System.out.println("Description: " + description);
        System.out.println();
    }
}
