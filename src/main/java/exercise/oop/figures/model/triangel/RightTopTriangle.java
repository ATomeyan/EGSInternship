package exercise.oop.figures.model.triangel;

import exercise.oop.figures.enums.Color;
import exercise.oop.figures.exception.TriangleIllegalException;

/**
 * @author Artur Tomeyan.
 * @project EGS Internship.
 * @date 08.12.2021.
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