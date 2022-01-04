package homework5;

/**
 * @author Artur Tomeyan.
 */
public class MyMergeAndSort {

    private MyMergeAndSort() {
        throw new UnsupportedOperationException();
    }

    public static void sortWithMergeSortAlgorithm(int[] sourceArray) {

        if (sourceArray.length < 2) {
            return;
        }

        int mid = sourceArray.length / 2;
        int[] left_arr = new int[mid];
        int[] right_arr = new int[sourceArray.length - mid];

        for (int i = 0; i < mid; i++) {
            left_arr[i] = sourceArray[i];
        }
        for (int i = mid; i < sourceArray.length; i++) {
            right_arr[i - mid] = sourceArray[i];
        }

        sortWithMergeSortAlgorithm(left_arr);
        sortWithMergeSortAlgorithm(right_arr);
        merge(sourceArray, left_arr, right_arr);
    }


    private static void merge(int[] array, int[] left, int[] right) {

        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                array[k] = left[i];
                i++;
            } else {
                array[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < left.length) {
            array[k] = left[i];
            i++;
            k++;
        }

        while (j < right.length) {
            array[k] = right[j];
            j++;
            k++;
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