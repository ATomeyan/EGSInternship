package exercise.oop.figures.exception;

/**
 * @author Artur Tomeyan.
 * @project EGS Internship.
 * @date 10.12.2021.
 */
public class RhombusIllegalException extends RuntimeException {

    public RhombusIllegalException() {
        super();
    }

    public RhombusIllegalException(String message) {
        super(message);
    }
}