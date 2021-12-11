package exercise.oop.figures.model;

import exercise.oop.figures.enums.Color;
import exercise.oop.figures.exception.FigureIllegalException;

/**
 * @author Artur Tomeyan.
 * @project EGS Internship.
 * @date 08.12.2021.
 */
public abstract class Figure {

    private final int size;
    private final int height;
    private final Color color;

    public Figure() {
        this.size = 0;
        this.color = Color.WHITE;
        this.height = 0;
    }

    public Figure(final int size, final Color color){
        if (size < 0 || color == null){
            throw new FigureIllegalException();
        }

        this.size = size;
        this.color = color;
        this.height = 0;
    }

    public Figure(final int size, final int height, final Color color){

        if (size < 0 || height < 0|| color == null){
            throw new IllegalArgumentException();
        }

        this.size = size;
        this.height = height;
        this.color = color;
    }
    public abstract void draw();

    public int getSize() {
        return size;
    }

    public int getHeight() {
        return height;
    }

    public Color getColor() {
        return color;
    }
}