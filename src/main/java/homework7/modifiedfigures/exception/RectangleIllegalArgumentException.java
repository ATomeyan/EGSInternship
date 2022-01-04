package homework7.modifiedfigures.exception;

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