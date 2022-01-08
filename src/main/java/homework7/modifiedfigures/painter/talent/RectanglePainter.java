package homework7.modifiedfigures.painter.talent;

import homework7.modifiedfigures.model.Image;
import homework7.modifiedfigures.model.Rectangle;
import homework7.modifiedfigures.painter.Painter;

/**
 * @author Artur Tomeyan.
 */
public class RectanglePainter implements Painter {

    @Override
    public Image doImage() {

        Rectangle rectangle = new Rectangle();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < rectangle.getHeight(); i++) {
            for (int j = 0; j < rectangle.getWidth(); j++) {
                stringBuilder.append(rectangle.getColor()).append("* ");
            }
            stringBuilder.append("\n");
        }

        return new Image(stringBuilder.toString());
    }
}
