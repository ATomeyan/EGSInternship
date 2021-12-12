package exercise.oop.figures.exception;

/**
 * @author Artur Tomeyan.
 * @project EGS Internship.
 * @date 10.12.2021.
 */
public class RhombusIllegalArgumentException extends RuntimeException {

    public RhombusIllegalArgumentException() {
        super();
    }

    public RhombusIllegalArgumentException(String message) {
        super(message);
    }
}