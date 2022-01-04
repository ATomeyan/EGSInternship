package homework7.modifiedfigures.model;

import homework7.modifiedfigures.exception.ImageIllegalArgumentException;

/**
 * @author Artur Tomeyan.
 */
public class Image {

    private String data;

    public Image() {
    }

    public Image(String data) {
        if (data == null){
            throw new ImageIllegalArgumentException(String.format("Incorrect image argument %s\n", data));
        }

        this.data = data;
    }

    public String getData() {
        return data;
    }
}