package MyStack;

import java.util.Arrays;

public class MyStack<Type> {
    private int length = 0;
    private Type[] values;

    public MyStack(int i) {
        length = i;
        values = (Type[]) new Object[i];
    }

    public void push(Type value) {
        if (length == values.length){
            values = Arrays.copyOf(values, 2 * values.length);
        }

        values[length] = value;
        length++;
    }

    public Type pop() {
        if (isEmpty()) {
            System.out.println("Стек пуст. Невозможно удалить элемент.");
            return null;
        }

        Type pop_value = values[--length];
        values[length] = null;
        return pop_value;
    }

    public boolean isEmpty() {
        return values.length == 0;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Стек пуст. Нет элементов для просмотра.");
        } else {
            for (int i = length - 1; i >=0; i--){
                System.out.println("" + (length - 1 - i) + ": " + values[i]);
            }
        }
    }

}
