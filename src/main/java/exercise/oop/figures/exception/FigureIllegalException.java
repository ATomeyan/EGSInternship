package exercise.oop.figures.exception;

/**
 * @author Artur Tomeyan.
 * @project EGS Internship.
 * @date 10.12.2021.
 */
public class FigureIllegalException extends RuntimeException {

    public FigureIllegalException() {
        super();
    }

    public FigureIllegalException(String message) {
        super(message);
    }
}