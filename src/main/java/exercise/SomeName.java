package exercise;

import java.util.Date;

/**
 * @author Artur Tomeyan.
 * @project EGS Internship.
 * @date 24.11.2021.
 */
public final class SomeName {

    private final String name;
    private final Date bDate;

    public SomeName(String name, Date bDate){
        this.name = name;
        this.bDate = bDate;
    }

    public final String getName() {
        return name;
    }

    public final Date getbDate() {
        return bDate;
    }
}