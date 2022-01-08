package homework7.modifiedfigures.painter.talent;

import homework7.modifiedfigures.model.Image;
import homework7.modifiedfigures.model.Square;
import homework7.modifiedfigures.painter.Painter;

/**
 * @author Artur Tomeyan.
 */
public class SquarePainter implements Painter {

    @Override
    public Image doImage() {

        StringBuilder stringBuilder = new StringBuilder();
        Square square = new Square();
        int size = square.getSize();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                stringBuilder.append(square.getColor()).append("*");
            }
            stringBuilder.append("\n");
        }
        return new Image(stringBuilder.toString());
    }
}