package homework9.list;

import java.util.Collection;

/**
 * @author Artur Tomeyan.
 */
public interface CustomList<E> {

    int size();

    void clear();

    boolean add(E e);

    void add(int index, E element);

    E set(int index, E element);

    boolean addAll(int index, Collection<? extends E> collection);

    E remove(int index);

    boolean remove(Object o);

    boolean contains(Object o);

    int indexOf(Object o);
}