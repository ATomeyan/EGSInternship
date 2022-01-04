package homework7.modifiedfigures.painter.talent;

import homework7.modifiedfigures.enums.Color;
import homework7.modifiedfigures.model.Image;
import homework7.modifiedfigures.painter.Painter;

/**
 * @author Artur Tomeyan.
 */
public class RightBottomTriangle implements Painter {

    private int length;
    private Color color;

    public RightBottomTriangle() {
        super();

        this.length = 0;
        this.color = Color.WHITE;
    }

    public RightBottomTriangle(int length, Color color) {
        if (length < 0 || color == null){
            throw new IllegalArgumentException(String.format("Incorrect value of triangle length or color %s\n", length, color));
        }

        this.length = length;
        this.color = color;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if (length < 0) {
            System.out.printf("Incorrect value of triangle length %s\n", length);
        }
        this.length = length;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        if (color == null){
            System.out.printf("Incorrect value of triangle color %s\n", color);
        }
        this.color = color;
    }

    @Override
    public Image doImage() {

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 1; i <= length; i++) {
            for (int j = length; j > i; j--) {
                stringBuilder.append(" ");
            }

            for (int k = 1; k <= i; k++){
                stringBuilder.append(color.getColor()).append("*");
            }

            stringBuilder.append("\n");
        }

        return new Image(stringBuilder.toString());
    }
}