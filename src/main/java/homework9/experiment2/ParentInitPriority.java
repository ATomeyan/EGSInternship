package homework9.experiment2;

/**
 * @author Artur Tomeyan.
 */
public class ParentInitPriority {
    private static String str1 = "Parent Static field";
    private static int count = 0;
    private String str2 = "Parent Instance field";

    static {
        count++;
        System.out.println("Parent count " + count);

        System.out.println(str1);
    }

    {
        System.out.println(str2);
    }

    public ParentInitPriority(){
        System.out.println("Parent Constructor");
    }
}
