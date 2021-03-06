import java.util.Date;

/**
 * @author Artur Tomeyan.
 */
public final class SomeName {

    private final String name;
    private final Date bDate;

    public SomeName(String name, Date bDate){
        this.name = name;
        this.bDate = bDate;
    }

    public String getName() {
        return name;
    }

    public Date getDate() {
        return bDate;
    }
}