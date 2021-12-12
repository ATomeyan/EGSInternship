package exercise.oop.figures.exception;

/**
 * @author Artur Tomeyan.
 * @project EGS Internship.
 * @date 10.12.2021.
 */
public class RectangleIllegalArgumentException extends RuntimeException {

    public RectangleIllegalArgumentException() {
        super();
    }

    public RectangleIllegalArgumentException(String message) {
        super(message);
    }
}