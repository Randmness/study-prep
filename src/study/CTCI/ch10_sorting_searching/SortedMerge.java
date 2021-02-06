package study.CTCI.ch10_sorting_searching;

public class SortedMerge {

    //sorted merge where A can hold B
    public static void merge(int[] arrayA, int[] arrayB, int aCount, int bCount) {
        int indexMerged = aCount + bCount - 1;
        int indexA = aCount - 1;
        int indexB = bCount - 1;

        while(indexB > 0) {
            if (indexA >= 0 && arrayA[indexA] > arrayB[indexB]) {
                arrayA[indexMerged] = arrayA[indexA];
                indexA--;
            } else {
                arrayA[indexMerged] = arrayB[indexB];
                indexB--;
            }

            indexMerged--;
        }
    }

    //merge two sorted arrays
    public static int[] merge(int[] arrayA, int[] arrayB) {
        int[] mergedSorted = new int[arrayA.length + arrayB.length];
        int indexMerged = mergedSorted.length-1;

        int indexA = arrayA.length - 1;
        int indexB = arrayB.length - 1;

        while(indexA > 0 && indexB > 0) {
            if (arrayA[indexA] > arrayB[indexB]) {
                mergedSorted[indexMerged] = arrayA[indexA];
                indexA--;
            } else {
                mergedSorted[indexMerged] = arrayB[indexB];
                indexB--;
            }

            indexMerged--;
        }



        return mergedSorted;
    }
}
