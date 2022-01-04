package homework7.modifiedfigures.exception;

/**
 * @author Artur Tomeyan.
 */
public class GalleryIllegalArgumentException extends RuntimeException{

    public GalleryIllegalArgumentException() {
    }

    public GalleryIllegalArgumentException(String message) {
        super(message);
    }
}