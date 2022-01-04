package homework10.list;

/**
 * @author Artur Tomeyan.
 */
public interface CustomDeque<E> {

    void addFirst(E e);

    void addLast(E e);

    boolean offerFirst(E e);

    boolean offerLast(E e);

    E removeFirst();

    E removeLast();

    E getFirst();

    E getLast();
}
