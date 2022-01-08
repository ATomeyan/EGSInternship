package homework7.modifiedfigures.painter.talent;

import homework7.modifiedfigures.model.Image;
import homework7.modifiedfigures.model.Triangle;
import homework7.modifiedfigures.painter.Painter;

/**
 * @author Artur Tomeyan.
 */
public class RightBottomTriangle implements Painter {
    @Override
    public Image doImage() {

        Triangle triangle = new Triangle();
        int length = triangle.getLength();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 1; i <= length; i++) {
            for (int j = length; j > i; j--) {
                stringBuilder.append(" ");
            }

            for (int k = 1; k <= i; k++) {
                stringBuilder.append(triangle.getColor()).append("*");
            }

            stringBuilder.append("\n");
        }

        return new Image(stringBuilder.toString());
    }
}