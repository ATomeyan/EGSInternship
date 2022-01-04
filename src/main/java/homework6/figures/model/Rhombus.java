package homework6.figures.model;

import homework6.figures.enums.Color;
import homework6.figures.exception.RhombusIllegalArgumentException;

/**
 * @author Artur Tomeyan.
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
            throw new RhombusIllegalArgumentException(String.format("Incorrect value of rhombus size or color %s\n", size, color));
        }

        this.size = size;
        this.color = color;
    }

    public void setSize(int size) {

        if (size < 0){
            System.out.printf("Incorrect value of rhombus size %s\n", size);
        }

        this.size = size;
    }

    public void setColor(Color color) {
        if (color == null){
            System.out.printf("Incorrect value of rhombus color %s\n", color);
        }
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