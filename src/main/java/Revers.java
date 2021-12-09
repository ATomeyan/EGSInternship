public class Revers {

    public static int getRevers(int n) {

        int reverse = 0;

        while (n != 0) {

            int tmp = n % 10;
            reverse = reverse * 10 + tmp;
            n = n / 10;
        }

        return reverse;
    }
}