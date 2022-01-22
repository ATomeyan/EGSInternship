package homework9.list.arraylist;

import homework9.list.CustomList;

import java.util.Arrays;
import java.util.Collection;

/**
 * @author Artur Tomeyan.
 */
public class CustomArrayList<E> implements CustomList<E> {

    private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};
    private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;
    private static final Object[] EMPTY_ELEMENTDATA = {};
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elementData;
    private int size;

    public CustomArrayList() {
        this.elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
    }

    public CustomArrayList(int initialCapacity) {
        if (initialCapacity > 0) {
            this.elementData = new Object[initialCapacity];
        } else if (initialCapacity == 0) {
            this.elementData = EMPTY_ELEMENTDATA;
        } else {
            throw new IllegalArgumentException("Illegal capacity " + initialCapacity);
        }
    }

    public CustomArrayList(Collection<? extends E> c) {
        Object[] a = c.toArray();
        if ((size = a.length) != 0) {
            if (elementData.getClass() != Object[].class)
                elementData = Arrays.copyOf(a, size, Object[].class);
        } else {
            elementData = EMPTY_ELEMENTDATA;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {

        for (int i = 0; i < size; i++) {
            elementData[i] = null;
        }
        size = 0;
    }

    @Override
    public boolean add(E e) {
        ensureCapacityInternal(size + 1);
        elementData[size++] = e;

        return true;
    }

    @Override
    public void add(int index, E element) {
        if (index >= 0) {
            throw new IndexOutOfBoundsException("Index " + index + ", size " + size);
        }

        ensureCapacityInternal(size + 1);
        System.arraycopy(elementData, index, elementData, index + 1, size - index);
        elementData[index] = element;
        size++;
    }

    @Override
    public E set(int index, E element) {

        if (index >= size) {
            throw new IndexOutOfBoundsException("Index " + index + ", size " + size);
        }

        E old = (E) elementData[index];
        elementData[index] = element;

        return old;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> collection) {

        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("Index " + index + ", size " + size);
        }

        if (index >= size) {
            throw new IndexOutOfBoundsException("Index " + index + ", size " + size);
        }

        Object[] objects = collection.toArray();
        int length = objects.length;
        ensureCapacityInternal(size + length);

        int movedNum = size - index;

        if (movedNum > 0) {
            System.arraycopy(elementData, index, elementData, index + length, movedNum);
        }

        System.arraycopy(objects, 0, elementData, index, length);
        size += length;

        return length != 0;
    }

    @Override
    public E remove(int index) {

        if (index >= size) {
            throw new IndexOutOfBoundsException("Index " + index + ", size " + size);
        }

        E old = (E) elementData[index];
        int movedNum = size - index - 1;

        if (movedNum > 0) {
            System.arraycopy(elementData, index + 1, elementData, index, movedNum);
        }

        elementData[--size] = null;

        return old;
    }

    @Override
    public boolean remove(Object o) {

        if (o == null) {
            for (int i = 0; i < size; i++) {
                if (elementData[i] == null) {
                    fastRemove(i);
                    return true;
                }
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (o.equals(elementData[i])) {
                    fastRemove(i);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return indexOf(o) >= 0;
    }

    @Override
    public int indexOf(Object o) {
        if (o == null) {
            for (int i = 0; i < size; i++) {
                if (elementData[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (o.equals(elementData[i])) {
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
            sb.append(elementData[i]);

            if (i == size - 1)
                break;
            sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }

    private static int calculateCapacity(Object[] elementData, int minCapacity) {
        if (elementData == DEFAULTCAPACITY_EMPTY_ELEMENTDATA) {
            return Math.max(DEFAULT_CAPACITY, minCapacity);
        }

        return minCapacity;
    }

    private void ensureCapacityInternal(int minCapacity) {
        ensureExplicitCapacity(calculateCapacity(elementData, minCapacity));
    }

    private void ensureExplicitCapacity(int minCapacity) {

        if (minCapacity - elementData.length > 0) {
            grow(minCapacity);
        }
    }

    private void grow(int minCapacity) {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity + (oldCapacity >> 1);

        if (newCapacity - minCapacity < 0) {
            newCapacity = minCapacity;
        }
        if (newCapacity - MAX_ARRAY_SIZE > 0) {
            newCapacity = hugeCapacity(minCapacity);
        }

        elementData = Arrays.copyOf(elementData, newCapacity);
    }

    private static int hugeCapacity(int minCapacity) {
        if (minCapacity < 0) {
            throw new OutOfMemoryError();
        }

        return (minCapacity > MAX_ARRAY_SIZE) ? Integer.MAX_VALUE : MAX_ARRAY_SIZE;
    }

    private void fastRemove(int index) {
        int movedNum = size - index - 1;

        if (movedNum > 0) {
            System.arraycopy(elementData, index + 1, elementData, index, movedNum);
        }

        elementData[--size] = null;
    }
}