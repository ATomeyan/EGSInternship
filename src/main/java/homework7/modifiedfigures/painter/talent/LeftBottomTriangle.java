package homework7.modifiedfigures.painter.talent;

import homework7.modifiedfigures.model.Image;
import homework7.modifiedfigures.model.Triangle;
import homework7.modifiedfigures.painter.Painter;

/**
 * @author Artur Tomeyan.
 */
public class LeftBottomTriangle implements Painter {

    @Override
    public Image doImage() {
        Triangle triangle = new Triangle();
        int length = triangle.getLength();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < length; i++) {
            for (int j = 0; j <= i; j++) {
                stringBuilder.append(triangle.getColor()).append("*");
            }
            stringBuilder.append("\n");
        }

        return new Image(stringBuilder.toString());
    }
}