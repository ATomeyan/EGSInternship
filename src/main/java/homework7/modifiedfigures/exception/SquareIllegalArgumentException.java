package homework7.modifiedfigures.exception;

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