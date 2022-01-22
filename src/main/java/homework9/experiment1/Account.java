package homework9.experiment1;

/**
 * @author Artur Tomeyan.
 */
public interface Account {
    String getUserName();

    default int getAge(){
        return 25;
    }
}