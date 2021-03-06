package homework7.modifiedfigures.enums;

/**
 * @author Artur Tomeyan.
 */
public enum Color {

    GREEN("\u001B[32m"), RED("\u001B[31m"), YELLOW("\u001B[33m"), BLUE("\u001B[34m"), WHITE("\u001B[37m"), PURPLE("\u001B[35m"), CYAN("\u001B[36m");

    private final String color;

    Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }
}