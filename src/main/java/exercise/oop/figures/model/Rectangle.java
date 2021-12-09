package exercise.oop.figures.model;

import exercise.oop.figures.enums.Color;

/**
 * @author Artur Tomeyan.
 * @project EGS Internship.
 * @date 08.12.2021.
 */
public class Rectangle extends Figure{

    private int height;
    private int width;
    private Color color;

    public Rectangle() {
    }

    public Rectangle(int width, int height, Color color) {
        this.height = height;
        this.width = width;
        this.color = color;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
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