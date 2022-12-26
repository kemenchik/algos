package structurs.LinkedList;

import java.util.Iterator;

public class CustomLinkedList<T> implements Iterable<T> {

    private Item<T> first;
    private Item<T> last;

    public boolean isEmpty() {
        return first == null;
    }

    public Item<T> addToTheEnd(T itemValue) {
        Item<T> item = new Item<>(itemValue);
        if (isEmpty()) {
            first = item;
        } else {
            last.next = item;
        }
        last = item;
        return item;
    }

    public void reverse() {
        if (isEmpty() || first.next == null) {
            return;
        }

        last = first;
        Item<T> current = first.next;
        first.next = null;

        while (current != null) {
            Item<T> next = current.next;
            current.next = first;
            first = current;
            current = next;
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            Item<T> current = first;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                T data = current.value;
                current = current.next;
                return data;
            }
        };
    }

    private static class Item<T> {
        T value;
        Item<T> next;

        public Item(T value) {
            this.value = value;
        }
    }
}
