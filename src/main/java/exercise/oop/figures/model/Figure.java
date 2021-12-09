package exercise.oop.figures.model;

/**
 * @author Artur Tomeyan.
 * @project EGS Internship.
 * @date 08.12.2021.
 */
public abstract class Figure {

    private final int size;

    public Figure() {
        size = 0;
    }

    public abstract void draw();
}