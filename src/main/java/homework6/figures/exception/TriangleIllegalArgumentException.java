package homework6.figures.exception;

/**
 * @author Artur Tomeyan.
 */
public class TriangleIllegalArgumentException extends RuntimeException {

    public TriangleIllegalArgumentException() {
        super();
    }

    public TriangleIllegalArgumentException(String message) {
        super(message);
    }
}