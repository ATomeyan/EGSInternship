package exercise.oop.modifiedfigures.model;

import exercise.oop.modifiedfigures.exception.ImageIllegalArgumentException;

/**
 * @author Artur Tomeyan.
 * @project EGS Internship.
 * @date 11.12.2021.
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