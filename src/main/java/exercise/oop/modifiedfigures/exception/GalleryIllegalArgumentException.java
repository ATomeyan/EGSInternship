package exercise.oop.modifiedfigures.exception;

/**
 * @author Artur Tomeyan.
 * @project EGS Internship.
 * @date 12.12.2021.
 */
public class GalleryIllegalArgumentException extends RuntimeException{

    public GalleryIllegalArgumentException() {
    }

    public GalleryIllegalArgumentException(String message) {
        super(message);
    }
}