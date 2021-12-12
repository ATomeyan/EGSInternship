package exercise.oop.figures.exception;

/**
 * @author Artur Tomeyan.
 * @project EGS Internship.
 * @date 10.12.2021.
 */
public class FigureIllegalArgumentException extends RuntimeException {

    public FigureIllegalArgumentException() {
        super();
    }

    public FigureIllegalArgumentException(String message) {
        super(message);
    }
}