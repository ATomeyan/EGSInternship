package homework12;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * @author Artur Tomeyan.
 */
public class CustomStack<E> {

    private static final int MAX_SIZE = Integer.MAX_VALUE - 8;
    private static final int DEFAULT_SIZE = 10;
    private Object[] element;
    private int size;

    public CustomStack() {
        this.element = new Object[DEFAULT_SIZE];
    }

    private void ensureCapacity(int minCapacity) {
        if (minCapacity - element.length > 0) {
            grow(minCapacity);
        }
    }

    private int hugeCapacity(int minCapacity) {
        if (minCapacity < 0) {
            throw new OutOfMemoryError();
        }

        return (minCapacity > MAX_SIZE) ? Integer.MAX_VALUE : MAX_SIZE;
    }

    private void grow(int minCapacity) {
        int oldCapacity = element.length;
        int newCapacity = oldCapacity + (oldCapacity >> 1);

        if (newCapacity - minCapacity < 0) {
            newCapacity = minCapacity;
        }

        if (newCapacity - MAX_SIZE > 0) {
            newCapacity = hugeCapacity(minCapacity);
        }

        element = Arrays.copyOf(element, newCapacity);
    }

    public E push(E item) {

        ensureCapacity(size + 1);
        element[size++] = item;

        return item;
    }

    public E pop() {
        int length = size;
        E obj = peek();

        element[length - 1] = null;
        size--;

        return obj;
    }

    public E peek() {

        int length = size;

        if (length == 0)
            throw new EmptyStackException();

        return (E) element[length - 1];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int search(Object o) {
        int index = size - 1;

        if (index >= size) {
            throw new IndexOutOfBoundsException();
        }

        if (o == null) {
            for (int i = index; i >= 0; i--) {
                if (element[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = index; i >= 0; i--) {
                if (o.equals(element[i])) {
                    return i;
                }
            }
        }

        return -1;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append(element[i]);

            if (i == size - 1)
                break;
            sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}