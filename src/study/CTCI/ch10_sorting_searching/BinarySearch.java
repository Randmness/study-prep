package study.CTCI.ch10_sorting_searching;

public class BinarySearch {



    public static int binarySearchIterative(int[] array, int x) {
        int low = 0;
        int high = array.length -1;
        int middle;

        while (low <= high) {
            middle = low + (high - low)/2;
            if (array[middle] < x) {
                low = middle + 1;
            } else if (array[middle] > x) {
                high = middle - 1;
            } else {
                return middle;
            }
        }

        //error
        return -1;
    }

    private static int binarySearchRecursive(int[] array, int x, int low, int high) {
        if (low > high) return -1;

        int middle = low + (high - low) / 2;
        if (array[middle] < x) {
            binarySearchRecursive(array, x, low, high-1);
        } else if (array[middle] > x) {
            binarySearchRecursive(array, x, middle + 1, high);
        } else {
            return middle;
        }

        //error
        return -1;
    }
}
