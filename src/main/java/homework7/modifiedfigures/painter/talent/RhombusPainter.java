package homework7.modifiedfigures.painter.talent;

import homework7.modifiedfigures.model.Image;
import homework7.modifiedfigures.model.Rhombus;
import homework7.modifiedfigures.painter.Painter;

import java.awt.*;

/**
 * @author Artur Tomeyan.
 */
public class RhombusPainter implements Painter {

    @Override
    public Image doImage() {
        Rhombus rhombus = new Rhombus();
        int size = rhombus.getSize();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 1; i <= size; i++) {

            for (int j = size; j > i; j--) {
                stringBuilder.append(" ");
            }

            for (int j = 1; j <= (i * 2) - 1; j++) {
                stringBuilder.append(rhombus.getColor()).append("*");
            }
            stringBuilder.append("\n");
        }

        for (int i = size - 1; i >= 1; i--) {
            for (int j = size - 1; j >= i; j--) {
                stringBuilder.append(" ");
            }
            for (int j = 1; j <= (i * 2) - 1; j++) {
                stringBuilder.append(rhombus.getColor()).append("*");
            }
            stringBuilder.append("\n");
        }

        return new Image(stringBuilder.toString());
    }
}