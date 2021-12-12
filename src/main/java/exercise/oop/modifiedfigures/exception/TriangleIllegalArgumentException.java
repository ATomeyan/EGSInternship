package exercise.oop.modifiedfigures.exception;

/**
 * @author Artur Tomeyan.
 * @project EGS Internship.
 * @date 10.12.2021.
 */
public class TriangleIllegalArgumentException extends RuntimeException {

    public TriangleIllegalArgumentException() {
        super();
    }

    public TriangleIllegalArgumentException(String message) {
        super(message);
    }
}