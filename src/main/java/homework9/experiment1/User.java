package homework9.experiment1;

/**
 * @author Artur Tomeyan.
 */
public interface User {
    String getUserName();

    default int getAge(){
        return 25;
    }
}