package exercise.oop.modifiedfigures.model.triangle;

import exercise.oop.modifiedfigures.enums.Color;
import exercise.oop.modifiedfigures.model.Figure;

/**
 * @author Artur Tomeyan.
 * @project EGS Internship.
 * @date 05.12.2021.
 */
public abstract class Triangle extends Figure {

    private int length;
    private Color color;

    public Triangle() {
        super();

        this.length = 6;
        this.color = Color.RED;
    }

    public Triangle(int length, Color color) {
        super(length, color);

        if (length < 0 || color == null){
            throw new IllegalArgumentException(String.format("Incorrect value of triangle length or color %s\n", length, color));
        }

        this.length = length;
        this.color = color;
    }

    public void setLength(int length) {
        if (length < 0) {
            System.out.printf("Incorrect value of triangle length %s\n", length);
        }
        this.length = length;
    }

    public void setColor(Color color) {
        if (color == null){
            System.out.printf("Incorrect value of triangle color %s\n", color);
        }
        this.color = color;
    }

    public int getLength() {
        return length;
    }

    @Override
    public Color getColor() {
        return color;
    }
}