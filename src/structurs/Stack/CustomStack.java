package structurs.Stack;

import java.util.ArrayList;
import java.util.List;

public class CustomStack<T> {

    private final List<T> stackValues = new ArrayList<>();

    public void push(T item) {
        stackValues.add(0, item);
    }

    public T pop() {
        return stackValues.remove(0);
    }

    public boolean isEmpty() {
        return stackValues.isEmpty();
    }

}
