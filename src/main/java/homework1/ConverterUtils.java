package homework1;

/**
 * @author Artur Tomeyan.
 */
public class ConverterUtils {

    private ConverterUtils() {
    }

    /**
     * Decimal to Binary
     *
     * @param number input parameter
     * @return
     */
//    public static int decToBinary(int number) {
//
//        int binary = 0;
//        int i = 0;
//
//        while (number != 0) {
//            int rem =  number % 2;
//            double c = Math.pow(10, i);
//            binary += rem * c;
//            number /= 2;
//            i++;
//        }
//
//        return binary;
//    }

    public static String decToBinary(int number){

        String binary = "";

        while (number != 0){
            binary = (number % 2) + binary;
            number /= 2;
        }

        while(binary.length() % 4 != 0){
            binary = "0" + binary;
        }

        return binary;
    }

    /**
     * Decimal to Hexadecimal
     *
     * @param number input parameter
     */
    public static void decToHex(int number) {

        char[] hex = new char[255];
        int temp;
        int i = 0;

        while (number != 0) {
            temp = number % 16;

            if (temp < 10)
                hex[i] = (char) (temp + 48);
            else
                hex[i] = (char) (temp + 55);
            i++;

            number /= 16;
        }

        for (int j = i - 1; j >= 0; j--)
            System.out.print(hex[j]);
    }

    /**
     * Binary to Hexadecimal
     *
     * @param binary input number in binary representation
     */
    public static void binaryToHex(int binary) {

        char[] hex = new char[255];
        int tmp;
        int hexDigit = 0;
        int m = 1;
        int c = 1;
        int i = 0;
        while (binary != 0) {

            tmp = binary % 10;
            hexDigit += (tmp * m);

            if (c % 4 == 0) {
                if (hexDigit < 10)
                    hex[i] = (char) (hexDigit + 48);
                else
                    hex[i] = (char) (hexDigit + 55);
                m = 1;
                c = 1;
                hexDigit = 0;
                i++;
            } else {
                m = m * 2;
                c++;
            }

            binary = binary / 10;
        }

        if (c != 1)
            hex[i] = (char) (hexDigit + 48);

        for (int j = 1; j >= 0; j--) {
            System.out.print(hex[j]);
        }
    }

    /**
     * Count integer bits
     *
     * @param number input parameter
     * @return a bit number by counter
     */
    public static int bitCounter(int number) {

        int count = 0;

        while (number > 0) {
            number &= (number - 1);
            count++;
        }

        return count;
    }
}