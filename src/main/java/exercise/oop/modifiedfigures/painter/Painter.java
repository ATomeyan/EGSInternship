package exercise.oop.modifiedfigures.painter;

import exercise.oop.modifiedfigures.exception.GalleryIllegalArgumentException;
import exercise.oop.modifiedfigures.model.Image;

import java.util.List;

/**
 * @author Artur Tomeyan.
 * @project EGS Internship.
 * @date 12.12.2021.
 */
public class Painter {

    private final List<Image> images;

    public Painter(List<Image> images) {
        if (images == null){
            throw new GalleryIllegalArgumentException(String.format("Incorrect gallery argument %s\n", images));
        }

        this.images = images;
    }

    public void show(){
        for (Image image: images) {
            System.out.println(image.getData());
        }
    }
}