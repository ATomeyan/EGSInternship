package homework7.modifiedfigures.model;

import homework7.modifiedfigures.exception.RectangleIllegalArgumentException;
import homework7.modifiedfigures.enums.Color;

/**
 * @author Artur Tomeyan.
 */
public class Square extends Figure {

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
            throw new RectangleIllegalArgumentException(String.format("Incorrect value of square size or color %s\n", size, color));
        }

        this.size = size;
        this.color = color;
    }

    @Override
    public String getPattern() {
        return null;
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

    public void setColor(Color color) {
        if (color == null){
            System.out.printf("Incorrect value of square color %s\n", color);
        }
        this.color = color;
    }
}