package exercise.oop.figures.model;

import exercise.oop.figures.enums.Color;
import exercise.oop.figures.exception.RhombusIllegalException;

/**
 * @author Artur Tomeyan.
 * @project EGS Internship.
 * @date 09.12.2021.
 */
public class Rhombus extends Figure {

    private int size;
    private Color color;

    public Rhombus() {
        super();

        this.size = 0;
        this.color = Color.WHITE;
    }

    public Rhombus(int size, Color color) {
        super(size, color);

        if (size < 0 || color == null){
            throw new RhombusIllegalException();
        }

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

        for(int i = 1; i <= size; i++){

            for (int j = size; j > i; j--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (i * 2) - 1; j++) {
                System.out.print(color.getColor() + "*");
            }
            System.out.println();
        }

        for (int i = size - 1; i >= 1; i--){
            for (int j = size - 1; j >= i ; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (i * 2) - 1; j++) {
                System.out.print(color.getColor() + "*");
            }
            System.out.println();
        }
    }
}