import MyClass.MyClass;
import Wrappers.SwapWrapper;

public class Main {
    public static void main(String[] args) {
        MyClass obj1 = new MyClass(10, "ten");
        MyClass obj2 = new MyClass(20, "twenty");

        System.out.println("До обмена:");
        System.out.println("obj1: "); obj1.print();
        System.out.println("obj2: "); obj2.print();

        SwapWrapper<MyClass> wrap1 = new SwapWrapper<>(obj1);
        SwapWrapper<MyClass> wrap2 = new SwapWrapper<>(obj2);

        wrap1.swap(wrap2);
        obj1 = wrap1.getData();
        obj2 = wrap2.getData();

        System.out.println("После обмена:");
        System.out.println("obj1: "); obj1.print();
        System.out.println("obj2: "); obj2.print();
    }
}
