package exercise;

/**
 * @author Artur Tomeyan.
 * @project EGS Internship.
 * @date 23.11.2021.
 */
public class BitwiseUtils {

    private BitwiseUtils() {
    }

    /**
     * Check number is even or not
     *
     * @param number input number
     * @return true if number is even, false for otherwise
     */
    public static boolean isEven(int number) {

        return ((number & 1) != 1);
    }

    /**
     * Convert string characters lowercase or uppercase
     *
     * @param str input parameter
     * @return converted string
     */
    public static String lowerCaseOrToUpper(String str) {

        char[] chars = new char[str.length()];
        String converted = "";
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }

        for (int i = 0; i < chars.length; i++) {
            if (Character.isLowerCase(chars[i])) {
                chars[i] &= ~32;
            } else if (Character.isUpperCase(chars[i])) {
                chars[i] |= 32;
            }
        }

        converted = String.valueOf(chars);

        return converted;
    }

    /**
     * Find non-duplicate element in array
     *
     * @param array input set of integers
     * @return non-duplicate elements
     */
    public static int nonRepeatElement(int[] array) {

        int duplicate = 0;

        for (int i : array) {
            duplicate ^= i;
        }

        return duplicate;
    }

    /**
     * Find first set-bit position form right
     *
     * @param number input number of integer
     * @return a bit of position
     */
    public static int positionOfBit(int number) {

        int position = 1;
        int bit = 1;

        while((number & bit) == 0){
            bit <<= 1;
            position++;
        }

        return position;
    }
}