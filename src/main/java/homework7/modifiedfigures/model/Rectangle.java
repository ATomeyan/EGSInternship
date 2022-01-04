package homework7.modifiedfigures.model;

import homework7.modifiedfigures.exception.RectangleIllegalArgumentException;
import homework7.modifiedfigures.enums.Color;
import homework7.modifiedfigures.enums.RectanglePattern;

/**
 * @author Artur Tomeyan.
 */
public class Rectangle extends Figure {

    private int height;
    private int width;
    private Color color;
    private RectanglePattern pattern;

    public Rectangle() {
        super();

        this.height = 0;
        this.width = 0;
        this.color = Color.WHITE;
    }

    public Rectangle(int width, int height, Color color) {
        super(width, height, color);

        if (width < 0 || height < 0 || color == null){
            throw new RectangleIllegalArgumentException(String.format("Incorrect value of rectangle width or height or color %s\n", width, height, color));
        }

        this.height = height;
        this.width = width;
        this.color = color;
    }

    @Override
    public String getPattern() {
        return null;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height < 0){
            System.out.printf("Incorrect value of rectangle height %s\n", height);
        }
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width < 0){
            System.out.printf("Incorrect value of rectangle width %s\n", width);
        }
        this.width = width;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        if (color == null){
            System.out.printf("Incorrect value of rectangle color %s\n", color);
        }
        this.color = color;
    }
}