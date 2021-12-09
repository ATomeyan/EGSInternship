package exercise.algorithms;

/**
 * @author Artur Tomeyan.
 * @project EGS Internship.
 * @date 30.11.2021.
 */
public class MyMergeAndSort {

    private MyMergeAndSort() {
    }

    public static void sortWithMergeSortAlgorithm(int[] sourceArray) {

        int begin = sourceArray[0];
        int end = sourceArray[sourceArray.length - 1];
        int mid = (begin - end) / 2;
    }

    void merge(int[] array) {

        int begin = array[0];
        int end = array[array.length - 1];
        int mid = (begin - end) / 2;

        if (begin < end) {
            merge(array);
        }
    }

    public static int binarySearch(final int[] input, final int target) {

        int begin = 0;
        int end = input.length - 1;

        while (end >= begin) {

            int mid = (begin + end) / 2;

            if (input[mid] == target) {
                return mid;
            } else if (input[mid] < target) {
                begin = mid + 1;
            } else if (input[mid] > target) {
                end = mid - 1;
            }
        }
        return -1;
    }
}