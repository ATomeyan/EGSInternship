package exercise.oop.figures.exception;

/**
 * @author Artur Tomeyan.
 * @project EGS Internship.
 * @date 10.12.2021.
 */
public class RectangleIllegalException extends RuntimeException {

    public RectangleIllegalException() {
        super();
    }

    public RectangleIllegalException(String message) {
        super(message);
    }
}