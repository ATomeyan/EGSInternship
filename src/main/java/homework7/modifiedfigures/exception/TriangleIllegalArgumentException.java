package homework7.modifiedfigures.exception;

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