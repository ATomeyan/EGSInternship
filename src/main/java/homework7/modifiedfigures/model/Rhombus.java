package homework7.modifiedfigures.model;

import homework7.modifiedfigures.exception.RhombusIllegalArgumentException;
import homework7.modifiedfigures.enums.Color;

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
    public String getPattern(){
        return "";
    }
}