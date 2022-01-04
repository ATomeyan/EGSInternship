package homework6.figures.exception;

/**
 * @author Artur Tomeyan.
 */
public class SquareIllegalArgumentException extends RuntimeException {

    public SquareIllegalArgumentException() {
        super();
    }

    public SquareIllegalArgumentException(String message) {
        super(message);
    }
}