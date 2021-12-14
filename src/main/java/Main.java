import exercise.oop.modifiedfigures.enums.Color;
import exercise.oop.modifiedfigures.painter.Painter;
import exercise.oop.modifiedfigures.model.Figure;
import exercise.oop.modifiedfigures.model.Rhombus;
import exercise.oop.modifiedfigures.model.Image;
import exercise.oop.modifiedfigures.model.Rectangle;
import exercise.oop.modifiedfigures.model.Square;
import exercise.oop.modifiedfigures.model.triangle.LeftBottomTriangle;
import exercise.oop.modifiedfigures.model.triangle.LeftTopTriangle;
import exercise.oop.modifiedfigures.model.triangle.RightBottomTriangle;
import exercise.oop.modifiedfigures.model.triangle.Triangle;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Artur Tomeyan.
 * @project EGS Internship.
 * @date 24.11.2021.
 */
public class Main {
    public static void main(String[] args) {

        List<Image> images = new ArrayList<>();

        Triangle triangle1 = new RightBottomTriangle(5, Color.BLUE);
        Triangle triangle2 = new LeftBottomTriangle(5, Color.RED);
        Triangle triangle3 = new LeftTopTriangle(5, Color.GREEN);

        Figure figure1 = new Rectangle(6, 4, Color.YELLOW);
        Figure figure2 = new Square(6, Color.BLUE);
        Figure figure3 = new Rhombus(6, Color.BLUE);


        images.add(triangle1.toImage());
        images.add(triangle2.toImage());
        images.add(triangle3.toImage());
        images.add(figure1.toImage());
        images.add(figure2.toImage());
        images.add(figure3.toImage());

        Painter galleryPainter = new Painter(images);

        galleryPainter.show();

//        for (Image i: images) {
//            System.out.println(i.getData());
//        }
    }
}