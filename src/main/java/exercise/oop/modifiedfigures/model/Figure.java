package exercise.oop.modifiedfigures.model;

import exercise.oop.modifiedfigures.exception.FigureIllegalArgumentException;
import exercise.oop.modifiedfigures.enums.Color;

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
        this.size = 6;
        this.color = Color.RED;
        this.height = 4;
    }

    public Figure(final int size, final Color color){
        if (size < 0 || color == null){
            throw new FigureIllegalArgumentException(String.format("Incorrect value of figure size or color %s\n", size, color));
        }

        this.size = size;
        this.color = color;
        this.height = 4;
    }

    public Figure(final int size, final int height, final Color color){

        if (size < 0 || height < 0|| color == null){
            throw new FigureIllegalArgumentException(String.format("Incorrect value of figure size or height or color %s\n", size, height, color));
        }

        this.size = size;
        this.height = height;
        this.color = color;
    }

    public abstract Image toImage();

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