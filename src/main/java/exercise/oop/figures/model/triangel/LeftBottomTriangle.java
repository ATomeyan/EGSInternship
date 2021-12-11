package exercise.oop.figures.model.triangel;

import exercise.oop.figures.enums.Color;
import exercise.oop.figures.exception.TriangleIllegalException;

/**
 * @author Artur Tomeyan.
 * @project EGS Internship.
 * @date 08.12.2021.
 */
public class LeftBottomTriangle extends Triangle {

    private int length;
    private Color color;

    public LeftBottomTriangle() {
        super();

        this.length = 0;
        this.color = Color.WHITE;
    }

    public LeftBottomTriangle(int length, Color color) {
        super(length, color);

        if (length < 0 || color == null){
            throw new TriangleIllegalException();
        }

        this.length = length;
        this.color = color;
    }

    public int getLength() {
        return length;
    }

    @Override
    public void setLength(int length) {
        this.length = length;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public void draw() {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(color.getColor() + "*");
            }
            System.out.println();
        }
    }
}