package Wrappers;

public class SwapWrapper<Type> {
    private Type data;

    public SwapWrapper(Type a) {
        data = a;
    }

    public Type getData() {
        return data;
    }

    public void swap(SwapWrapper<Type> obj2) {
        Type tmp = data;
        data = obj2.data;
        obj2.data = tmp;
    }
}
