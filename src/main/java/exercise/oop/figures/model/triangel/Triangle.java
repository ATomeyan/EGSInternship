package exercise.oop.figures.model.triangel;

import exercise.oop.figures.enums.Color;
import exercise.oop.figures.exception.TriangleIllegalException;
import exercise.oop.figures.model.Figure;

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

        this.length = 0;
        this.color = Color.WHITE;
    }

    public Triangle(int length, Color color) {
        super(length, color);

        if (length < 0 || color == null){
            throw new TriangleIllegalException();
        }

        this.length = length;
        this.color = color;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}