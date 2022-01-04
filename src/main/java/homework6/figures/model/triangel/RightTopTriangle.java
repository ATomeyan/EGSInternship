package homework6.figures.model.triangel;

import homework6.figures.enums.Color;
import homework6.figures.exception.TriangleIllegalArgumentException;

/**
 * @author Artur Tomeyan.
 */
public class RightTopTriangle extends Triangle{

    private int length;
    private Color color;

    public RightTopTriangle() {
        super();

        this.length = 0;
        this.color = Color.WHITE;
    }

    public RightTopTriangle(int length, Color color) {
        super(length, color);

        if (length < 0 || color == null){
            throw new TriangleIllegalArgumentException(String.format("Incorrect value of triangle length or color %s\n", length, color));
        }

        this.length = length;
        this.color = color;
    }

    public int getLength() {
        return length;
    }

    @Override
    public void setLength(int length) {
        if (length < 0) {
            System.out.printf("Incorrect value of triangle length %s\n", length);
        }
        this.length = length;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public void setColor(Color color) {
        if (color == null){
            System.out.printf("Incorrect value of triangle color %s\n", color);
        }
        this.color = color;
    }

    @Override
    public void draw() {

        for (int i = 1; i <= length; i++) {

            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = length; j >= i; j--) {
                System.out.print(color.getColor() + "*");
            }

            System.out.println();
        }
    }
}