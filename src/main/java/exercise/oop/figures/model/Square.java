package exercise.oop.figures.model;

import exercise.oop.figures.enums.Color;
import exercise.oop.figures.exception.SquareIllegalArgumentException;

/**
 * @author Artur Tomeyan.
 * @project EGS Internship.
 * @date 08.12.2021.
 */
public class Square extends Rectangle{

    private int size;
    private Color color;

    public Square(){
        super();

        size = 0;
        color = Color.WHITE;
    }

    public Square(int size, Color color) {
        super(size, size, color);

        if (size < 0 || color == null){
            throw new SquareIllegalArgumentException(String.format("Incorrect value of square size or color %s\n", size, color));
        }

        this.size = size;
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        if (size < 0) {
            System.out.printf("Incorrect value of square size %s\n", size);
        }
        this.size = size;
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public void setColor(Color color) {
        if (color == null){
            System.out.printf("Incorrect value of square color %s\n", color);
        }
        this.color = color;
    }
}