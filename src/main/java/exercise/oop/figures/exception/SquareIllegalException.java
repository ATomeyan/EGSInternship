package exercise.oop.figures.exception;

/**
 * @author Artur Tomeyan.
 * @project EGS Internship.
 * @date 10.12.2021.
 */
public class SquareIllegalException extends RuntimeException {

    public SquareIllegalException() {
        super();
    }

    public SquareIllegalException(String message) {
        super(message);
    }
}