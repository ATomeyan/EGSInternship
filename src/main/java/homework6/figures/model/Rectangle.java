package homework6.figures.model;

import homework6.figures.enums.Color;
import homework6.figures.exception.RectangleIllegalArgumentException;

/**
 * @author Artur Tomeyan.
 */
public class Rectangle extends Figure{

    private int height;
    private int width;
    private Color color;

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

    @Override
    public void draw() {

        for (int i = 0; i < height; i++){
            for (int j = 0; j < width; j++){
                System.out.print(color.getColor() + "* ");
            }
            System.out.println();
        }
    }
}