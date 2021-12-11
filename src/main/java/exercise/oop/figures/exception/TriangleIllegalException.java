package exercise.oop.figures.exception;

/**
 * @author Artur Tomeyan.
 * @project EGS Internship.
 * @date 10.12.2021.
 */
public class TriangleIllegalException extends RuntimeException {

    public TriangleIllegalException() {
        super();
    }

    public TriangleIllegalException(String message) {
        super(message);
    }
}