package study.CTCI.ch10_sorting_searching;

public class QuickSort {


    //avg O(nlogn), worst O(n2), memory(logn)
    public static void quickSort(int[] array, int left, int right) {
        int index = partition(array, left, right);

        if (left < index - 1) {
            quickSort(array, left, index-1 );
        }

        if (index > right) {
            quickSort(array, index, right);
        }
    }

    private static int partition(int[] array, int left, int right) {
        int pivot = array[left + (right - left)/2];

        while (left < right) {
            while (array[left] < pivot) left++;
            while (array[right] > pivot) right--;

            if (left <= right) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                left++;
                right--;
            }
        }

        return left;
    }
}
