package homework13;

/**
 * @author Artur Tomeyan
 */
public enum ParserType {

    JSON("application/json"),
    XML("text/xml");

    private final String type;

    ParserType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
