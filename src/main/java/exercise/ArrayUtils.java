package exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Artur Tomeyan.
 * @project EGS Internship.
 * @date 24.11.2021.
 */
public class ArrayUtils {

    private ArrayUtils() {
    }

    public static void printMatrixInOneLoop(int[][] array){

    }

    /**
     * @param array
     * @return
     */
    public static int[] sortArrayInOddAndEvenOrder(int[] array) {

        int[] arr = new int[array.length];
        int odd;
        int even;
        boolean flag = false;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] % 2 == 0) {
                    even = array[i];
                    arr[i] = even;
                } else {
                    odd = array[j];
                    arr[j] = odd;
                }
            }
        }
        return array;
    }

    /**
     * The method check given array sorted in ascending sequence or not
     *
     * @param array input integer set
     * @return true if the array sorted in ascending sequence, false otherwise
     */
    public static boolean isSorted(int[] array) {

        if (array == null || array.length <= 1)
            return false;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }

        return true;
    }

    /**
     * The method calculate arithmetic mean from given array
     *
     * @param array input integer set
     * @return arithmetic mean
     */
    public static double getMean(int[] array) {

        int sum = 0;

        for (int i : array)
            sum += i;
        return (double)sum / array.length;
    }

    /**
     * The method compare two input array and return unique elements
     *
     * @param array1 input of integer number
     * @param array2 input of integer number
     */
    public static void getUniqueElement(int[] array1, int[] array2)
    {

//        int size = array1.length + array2.length;
//        int[] array = new int[size];

        List<Integer> list = new ArrayList<>();
        boolean contains = false;

        for (int i = 0; i < array1.length; i++) {
            for (int k : array2) {
                if (array1[i] == k) {
                    contains = true;
                    break;
                }
            }

            if (!contains)
                list.add(array1[i]);
//                array[i] = array1[i];
            else
                contains = false;
        }

        for (int i = 0; i < array2.length; i++) {
            for (int k : array1) {
                if (array2[i] == k) {
                    contains = true;
                    break;
                }
            }

            if (!contains)
                list.add(array2[i]);
//                array[i] = array2[i];
            else
                contains = false;
        }

        System.out.println(list);
        ;
    }

    /**
     * The method receives sorted array and return random ordered array
     *
     * @param array integer set
     */
    public static void getRandomOrder(int[] array) {

        for (int i = array.length - 1; i >= 0; i--) {

            // int j = (int)(Math.random() % (i + 1));
            int j = array[i] % (i + 1);

            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }

        for (int j : array) {
            System.out.print(j + " ");
        }
    }

    /**
     * The method finds pairs of sum given number from array
     *
     * @param array  integer set
     * @param number given sum
     * @return array of pairs
     */
    public static int[] twoPairsSum(int[] array, int number) {

        int[] sumPair = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == number) {
                    sumPair[i] = array[i];
                    break;
                }
            }
        }
        return sumPair;
    }

    /**
     * The method find most frequent element from array
     *
     * @param array input of integer
     * @return most frequent element
     */
    public static int mostFrequencyElement(int[] array) {

        int frequency = array[0];
        int count = 0, maxCount = 0;

        for (int i = 1; i < array.length; i++) {

            if (array[i] == array[i - 1])
                count++;
            else {
                if (count > maxCount) {
                    maxCount = count;

                    frequency = array[i - 1];
                }

                count = 1;
            }
        }

        if (count > maxCount) {
            frequency = array[array.length - 1];
        }
        return frequency;
    }

    /**
     * The method check and remove duplicate elements from sorted array
     *
     * @param array input integer number
     * @return new array length
     */
    public static int[] deleteDuplicates(int[] array) {

        int j = array.length;

        for (int i = 0; i < array.length - 1; i++) {
            for (int k = i + 1; k < array.length; k++) {
                if (array[i] == array[k]) {
                    array[k] = array[j - 1];
                    j--;
                    k--;
                }
            }
        }

        return Arrays.copyOf(array, j);
    }
}