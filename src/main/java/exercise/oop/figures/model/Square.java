package exercise.oop.figures.model;

import exercise.oop.figures.enums.Color;

/**
 * @author Artur Tomeyan.
 * @project EGS Internship.
 * @date 08.12.2021.
 */
public class Square extends Rectangle{

    private int size;
    private Color color;

    public Square(){
    }

    public Square(int size, Color color) {
        super(size, size, color);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }
}