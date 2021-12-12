package exercise.oop.figures.exception;

/**
 * @author Artur Tomeyan.
 * @project EGS Internship.
 * @date 10.12.2021.
 */
public class SquareIllegalArgumentException extends RuntimeException {

    public SquareIllegalArgumentException() {
        super();
    }

    public SquareIllegalArgumentException(String message) {
        super(message);
    }
}