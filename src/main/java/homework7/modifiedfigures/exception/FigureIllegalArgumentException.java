package homework7.modifiedfigures.exception;

/**
 * @author Artur Tomeyan.
 */
public class FigureIllegalArgumentException extends RuntimeException {

    public FigureIllegalArgumentException() {
        super();
    }

    public FigureIllegalArgumentException(String message) {
        super(message);
    }
}