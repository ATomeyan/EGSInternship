package homework9.list.linkedlist;

import homework9.list.CustomDeque;
import homework9.list.CustomList;

import java.util.Collection;
import java.util.NoSuchElementException;

/**
 * @author Artur Tomeyan.
 */
public class CustomLinkedList<E> implements CustomList<E>, CustomDeque<E> {
    private int size;
    private Node<E> first;
    private Node<E> last;

    public CustomLinkedList() {
    }

    public CustomLinkedList(Collection<? extends E> collection) {
        this();
        addAll(size, collection);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {

        for (Node<E> x = first; x != null; ) {
            Node<E> next = x.next;
            x.item = null;
            x.next = null;
            x.prev = null;
            x = next;
        }

        first = null;
        last = null;
        size = 0;
    }

    @Override
    public boolean add(E e) {
        linkLast(e);
        return true;
    }

    @Override
    public void add(int index, E element) {

        if (!isPositionIndex(index)) {
            throw new IndexOutOfBoundsException("Index " + index + ", size " + size);
        }

        if (index == size) {
            Node<E> l = last;
            Node<E> newNode = new Node<>(l, element, null);
            last = newNode;

            if (l == null)
                first = newNode;
            else
                l.next = newNode;
        } else {
            linkBefore(element, node(index));
        }
    }

    @Override
    public E set(int index, E element) {
        if (!isElementIndex(index)) {
            throw new IndexOutOfBoundsException("Index " + index + ", size " + size);
        }

        Node<E> x = node(index);
        E oldValue = x.item;
        x.item = element;

        return oldValue;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> collection) {
        if (!isPositionIndex(index)) {
            throw new IndexOutOfBoundsException("Index " + index + ", size " + size);
        }

        Object[] arr = collection.toArray();
        int newNum = arr.length;

        if (newNum == 0)
            return false;

        Node<E> pred, node;
        if (index == size) {
            node = null;
            pred = last;
        } else {
            node = node(index);
            pred = node.prev;
        }

        for (Object o : arr) {
            E e = (E) o;
            Node<E> newNode = new Node<>(pred, e, null);

            if (pred == null)
                first = newNode;
            else
                pred.next = newNode;
            pred = newNode;
        }

        if (node == null)
            last = pred;
        else {
            pred.next = node;
            node.prev = pred;
        }

        size += newNum;

        return true;
    }

    @Override
    public E remove(int index) {
        if (!isElementIndex(index)) {
            throw new IndexOutOfBoundsException("Index " + index + ", size " + size);
        }

        return unlink(node(index));
    }

    @Override
    public boolean remove(Object o) {

        if (o == null) {
            for (Node<E> x = first; x != null; x = x.next) {
                if (x.item == null) {
                    unlink(x);
                    return true;
                }
            }
        } else {
            for (Node<E> x = first; x != null; x = x.next) {
                if (o.equals(x.item)) {
                    unlink(x);
                    return true;
                }
            }
        }

        return false;
    }

    @Override
    public boolean contains(Object o) {
        return indexOf(o) != -1;
    }

    @Override
    public int indexOf(Object o) {
        int index = 0;
        if (o == null) {
            for (Node<E> x = first; x != null; x = x.next) {
                if (x.item == null) {
                    return index;
                }
                index++;
            }
        } else {
            for (Node<E> x = first; x != null; x = x.next) {
                if (o.equals(x.item)) {
                    return index;
                }

                index++;
            }
        }
        return -1;
    }

    @Override
    public void addFirst(E e) {

        linkFirst(e);
    }

    @Override
    public void addLast(E e) {
        linkLast(e);
    }

    @Override
    public boolean offerFirst(E e) {
        addFirst(e);
        return true;
    }

    @Override
    public boolean offerLast(E e) {
        addLast(e);
        return true;
    }

    @Override
    public E removeFirst() {
        Node<E> f = first;

        if (f == null) {
            throw new NoSuchElementException();
        }

        E element = f.item;
        Node<E> next = f.next;
        f.item = null;
        f.next = null;
        first = next;

        if (next == null)
            last = null;
        else
            next.prev = null;
        size--;

        return element;
    }

    @Override
    public E removeLast() {
        Node<E> l = last;
        if (l == null) {
            throw new NoSuchElementException();
        }

        E element = l.item;
        Node<E> prev = l.prev;
        l.item = null;
        l.prev = null;
        last = prev;

        if (prev == null)
            first = null;
        else
            prev.next = null;
        size--;

        return element;
    }

    @Override
    public E getFirst() {
        Node<E> f = first;

        if (f == null){
            throw new NoSuchElementException();
        }

        return f.item;
    }

    @Override
    public E getLast() {
        Node<E> l = last;

        if (l == null){
            throw new NoSuchElementException();
        }

        return last.item;
    }

    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder("[");
        Node<E> node = first;

        while (node != null) {
            stringBuilder.append(node.item);

            if (node != last)
                stringBuilder.append(", ");
            node = node.next;
        }
        stringBuilder.append("]");

        return stringBuilder.toString();
    }

    private Node<E> node(int index) {

        Node<E> x;

        if (index < (size >> 1)) {
            x = first;
            for (int i = 0; i < index; i++) {
                x = x.next;
            }
        } else {
            x = last;
            for (int i = size - 1; i > index; i--) {
                x = x.prev;
            }
        }
        return x;
    }

    private E unlink(Node<E> x) {
        E element = x.item;
        Node<E> next = x.next;
        Node<E> prev = x.prev;

        if (prev == null) {
            first = next;
        } else {
            prev.next = next;
            x.prev = null;
        }

        if (next == null) {
            last = next;
        } else {
            next.prev = next;
            x.next = null;
        }

        x.item = null;
        size--;

        return element;
    }

    private void linkFirst(E e) {
        Node<E> f = first;
        Node<E> newNode = new Node<>(null, e, f);
        first = newNode;

        if (f == null) {
            last = newNode;
        } else {
            f.prev = newNode;
        }

        size++;
    }

    private void linkLast(E e) {
        Node<E> l = last;
        Node<E> newNode = new Node<>(l, e, null);
        last = newNode;

        if (l == null)
            first = newNode;
        else
            l.next = newNode;
        size++;
    }

    private void linkBefore(E e, Node<E> node) {

        Node<E> pred = node.prev;
        Node<E> newNode = new Node<>(pred, e, node);
        node.prev = newNode;

        if (pred == null) {
            first = newNode;
        } else {
            pred.next = newNode;
        }
        size++;
    }

    private boolean isElementIndex(int index) {
        return index >= 0 && index < size;
    }

    private boolean isPositionIndex(int index) {
        return index >= 0 && index <= size;
    }

    private static class Node<E> {
        E item;
        Node<E> next;
        Node<E> prev;

        public Node(Node<E> prev, E item, Node<E> next) {
            this.item = item;
            this.next = next;
            this.prev = prev;
        }
    }
}