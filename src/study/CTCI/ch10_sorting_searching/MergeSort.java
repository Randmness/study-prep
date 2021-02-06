package study.CTCI.ch10_sorting_searching;

public class MergeSort {


    //O(nlogn)
    public static void mergeSort(int[] array) {
        int[] helper = new int[array.length];
        mergeSort(array, helper, 0, array.length-1);
    }

    public static void mergeSort(int[] array, int[] helper, int start, int end) {
        if (start < end) {
            int middle = start + (end - start) / 2;
            mergeSort(array, helper, start, middle); //left
            mergeSort(array, helper, middle+1, end); //right
            merge(array, helper, start, middle, end);
        }
    }

    public static void merge(int[] array, int[] helper, int start, int middle, int end) {
        for (int i=start; i<= end; i++) {
            helper[i] = array[i];
        }

        int helperLeft = start;
        int helperMiddle = middle + 1;
        int current = start;

        while (helperLeft <= middle && helperMiddle <= end) {
            if (helper[helperLeft] <= helper[helperMiddle]) {
                array[current] = helper[helperLeft];
                helperLeft++;
            } else {
                array[current] = helper[helperMiddle];
                helperMiddle++;
            }
            current++;
        }

        int remaining = middle - helperLeft;
        for (int i = 0; i <= remaining; i++) {
            array[current+i] = helper[helperLeft + i];
        }
    }

}
