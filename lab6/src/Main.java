import MyStack.MyStack;

public class Main {
    public static void main(String[] args) {
        MyStack<Integer> example_stack = new MyStack<Integer>(1);
        System.out.println("Базовый стек длины 1:");
        example_stack.print();

        for (int index = 0; index < 10; index += 1){
            example_stack.push(index);
        }
        System.out.println("Заполненный стек:");
        example_stack.print();

        int b = example_stack.pop();
        System.out.println("Верхний элемент стека: " + b);
        System.out.println("Итоговый стек: ");
        example_stack.print();
    }
}