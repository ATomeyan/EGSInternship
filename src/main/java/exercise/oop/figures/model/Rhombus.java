package exercise.oop.figures.model;

import exercise.oop.figures.enums.Color;

/**
 * @author Artur Tomeyan.
 * @project EGS Internship.
 * @date 09.12.2021.
 */
public class Rhombus extends Figure {

    private int size;
    private Color color;

    public Rhombus() {
    }

    public Rhombus(int size, Color color) {
        this.size = size;
        this.color = color;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public void draw() {

    }
}