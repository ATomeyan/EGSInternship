package homework7.modifiedfigures.exception;

/**
 * @author Artur Tomeyan.
 */
public class ImageIllegalArgumentException extends RuntimeException {

    public ImageIllegalArgumentException() {
        super();
    }

    public ImageIllegalArgumentException(String message) {
        super(message);
    }
}