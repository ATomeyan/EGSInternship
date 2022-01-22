package homework9.experiment2;

/**
 * @author Artur Tomeyan.
 */
public class InitPriority extends ParentInitPriority{

    private static String str1 = "Child Static field";
    private static int count = 0;
    private String str2 = "Child Instance field";

    static {
        count++;
        System.out.println("Child " + count);

        System.out.println(str1);
    }

    {
        System.out.println(str2);
    }

    public InitPriority(){
        System.out.println("Child Constructor");
    }

    public static void main(String[] args) {
        new InitPriority();
    }
}