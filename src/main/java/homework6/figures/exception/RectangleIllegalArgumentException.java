package homework6.figures.exception;

/**
 * @author Artur Tomeyan.
 */
public class RectangleIllegalArgumentException extends RuntimeException {

    public RectangleIllegalArgumentException() {
        super();
    }

    public RectangleIllegalArgumentException(String message) {
        super(message);
    }
}