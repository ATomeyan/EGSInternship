package homework10.experiment1;

/**
 * @author Artur Tomeyan.
 */
public class InterfaceTest implements Account, User{

    private String name;

    public InterfaceTest(){}

    public InterfaceTest(String name){
        this.name = name;
    }

    @Override
    public String getUserName() {
        return name;
    }
}