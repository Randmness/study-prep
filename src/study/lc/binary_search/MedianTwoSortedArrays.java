package study.lc.binary_search;

public class MedianTwoSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] combined = new int[nums1.length+nums2.length];
        int index = combined.length-1;

        int nums1Index = nums1.length-1;
        int nums2Index = nums2.length-1;

        while (index >=0 ) {
            if (nums1Index >=0 && nums2Index <0) {
                combined[index] = nums1[nums1Index--];
            } else if (nums1Index < 0 && nums2Index>=0) {
                combined[index] = nums2[nums2Index--];
            } else if (nums1[nums1Index] >= nums2[nums2Index]){
                combined[index] = nums1[nums1Index--];
            } else if (nums2[nums2Index] > nums1[nums1Index]) {
                combined[index] = nums2[nums2Index--];
            }

            index--;
        }

        int middle = combined.length/2;
        if (combined.length % 2 == 0) {
            return ((double)combined[middle] + combined[middle-1])/2;
        } else {
            return combined[middle];
        }

    }

}
