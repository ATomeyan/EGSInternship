import exercise.CustomString;
import exercise.oop.figures.enums.Color;
import exercise.oop.figures.model.Rectangle;
import exercise.oop.figures.model.Square;

/**
 * @author Artur Tomeyan.
 * @project EGS Internship.
 * @date 24.11.2021.
 */
public class Main {
    public static void main(String[] args) {

        char[] chars = {'h', 'e', 'l', 'l', 'o'};
        CustomString customString = new CustomString(chars);

//        CustomString.valueOf(5).print();
        customString.substring(2, 4).printCustomString();

//        Rectangle s = new Square(4, Color.RED);
//        Rectangle r = new Rectangle(6, 4, Color.RED);
//
//        s.draw();
//
//        System.out.println();
//        r.draw();
    }
}