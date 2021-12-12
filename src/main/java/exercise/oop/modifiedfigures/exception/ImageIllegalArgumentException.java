package exercise.oop.modifiedfigures.exception;

/**
 * @author Artur Tomeyan.
 * @project EGS Internship.
 * @date 11.12.2021.
 */
public class ImageIllegalArgumentException extends RuntimeException {

    public ImageIllegalArgumentException() {
        super();
    }

    public ImageIllegalArgumentException(String message) {
        super(message);
    }
}