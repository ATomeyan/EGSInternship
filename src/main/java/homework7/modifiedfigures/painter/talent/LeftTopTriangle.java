package homework7.modifiedfigures.painter.talent;

import homework7.modifiedfigures.model.Image;
import homework7.modifiedfigures.model.Triangle;
import homework7.modifiedfigures.painter.Painter;

/**
 * @author Artur Tomeyan.
 */
public class LeftTopTriangle implements Painter {

    @Override
    public Image doImage() {

        Triangle triangle = new Triangle();
        int length = triangle.getLength();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i <= length; i++) {
            for (int j = length; j >= i; j--) {
                stringBuilder.append(triangle.getColor()).append("*");
            }

            for (int j = 1; j < i; j++) {
                stringBuilder.append(" ");
            }

            stringBuilder.append("\n");
        }

        return new Image(stringBuilder.toString());
    }
}