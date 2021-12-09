package exercise.oop.figures.model.triangel;

import exercise.oop.figures.enums.Color;
import exercise.oop.figures.model.Figure;

/**
 * @author Artur Tomeyan.
 * @project EGS Internship.
 * @date 05.12.2021.
 */
public abstract class Triangle extends Figure {

    private int length;
    private Color color;

    public Triangle() {
    }

    public Triangle(int length, Color color) {
        this.length = length;
        this.color = color;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void draw1() {

        for (int i = 0; i < length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(color.getColor() + "*");
            }
            System.out.println();
        }
    }

    public void draw2() {

        for (int i = 1; i <= length; i++) {
            for (int j = length; j > i; j--) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++){
                System.out.print(color.getColor() + "*");
            }

            System.out.println();
        }
    }

    public void draw3(){

        for (int i = 0; i <= length; i++){
            for (int j = length; j >= i; j--){
                System.out.print(color.getColor() + "*");
            }

            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }
    
    public void draw4(){

        for (int i = 1; i <= length; i++) {

            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = length; j >= i; j--) {
                System.out.print(color.getColor() + "*");
            }

            System.out.println();
        }
    }
}