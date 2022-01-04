package exam2;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Artur Tomeyan.
 */
public class ArithmeticUtil {

    private ArithmeticUtil() {
        throw new UnsupportedOperationException();
    }

    public static List<String> add(String s1, String s2) {

        if (s1 == null || s2 == null) {
            throw new NumberFormatException();
        }

        List<String> list = new LinkedList<>();

        if (s1.length() > s2.length()) {
            String tmp = s1;
            s1 = s2;
            s2 = tmp;
        }

        s1 = new StringBuilder(s1).reverse().toString();
        s2 = new StringBuilder(s2).reverse().toString();
        int length1 = s1.length();
        int length2 = s2.length();
        StringBuilder s = new StringBuilder();
        int nextStep = 0;

        for (int i = 0; i < length1; i++) {
            int sum = ((s1.charAt(i) - '0') + (s2.charAt(i) - '0') + nextStep);
            s.append((char) (sum % 10 + '0'));
            nextStep = sum / 10;
        }

        for (int k = length1; k < length2; k++) {
            int sum = ((s2.charAt(k) - '0') + nextStep);
            s.append((char) (sum % 10 + '0'));
            nextStep = sum / 10;
        }

//        if (nextStep > 0)
//            s.append((char) (nextStep + '0'));


        list.add(s.reverse().toString());

        return list;
    }

    public static List<String> subtract(String s1, String s2) {

        if (s1 == null || s2 == null){
            throw new IllegalArgumentException();
        }

        if(isNegative(s1) || isNegative(s2)){
            s1 = s1.substring(1);
            s2 = s2.substring(1);
        }

        if (isSmall(s1, s2)) {
            String tmp = s1;
            s1 = s2;
            s2 = tmp;
        }

        s1 = new StringBuilder(s1).reverse().toString();
        s2 = new StringBuilder(s2).reverse().toString();
        List<String> list = new LinkedList<>();
        StringBuilder s = new StringBuilder();
        int length1 = s1.length();
        int length2 = s2.length();
        int next = 0;

        for (int i = 0; i < length2; i++){
            int sub = ((s1.charAt(i) - '0') - (s2.charAt(i) - '0') - next);

            if (sub < 0){
                sub = sub + 10;
                next = 1;
            } else
                next = 0;

            s.append((char) (sub + '0'));
        }

        for (int i = length2; i < length1; i++){
            int sub = ((s1.charAt(i) - '0') - next);

            if (sub < 0){
                sub = sub + 10;
                next = 1;
            } else
                next = 0;

            s.append((char) (sub + '0'));
        }

        list.add(s.reverse().toString());
        return list;
    }

    private static boolean isNegative(String s){
        return s.charAt(0) == '-';
    }

    private static boolean isSmall(String s1, String s2) {
        int length1 = s1.length();
        int length2 = s2.length();

        if (length1 < length2)
            return true;
        if (length2 < length1)
            return false;

        for (int i = 0; i < length1; i++) {
            if (s1.charAt(i) < s2.charAt(i))
                return true;
            else if (s1.charAt(i) > s2.charAt(i))
                return false;
        }

        return false;
    }
}