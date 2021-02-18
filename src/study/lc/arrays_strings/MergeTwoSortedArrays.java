package study.lc.arrays_strings;

public class MergeTwoSortedArrays {

    //nums1 can hold nums2
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int nums1Pos = m-1;
        int nums2Pos = n-1;

        int position = nums1.length  - 1;

        while (position >= 0) {
            if (nums1Pos < 0) {
                //copy nums2
                nums1[position] = nums2[nums2Pos--];
            } else if (nums2Pos < 0) {
                //copy nums1
                nums1[position] = nums1[nums1Pos--];
            } else if (nums1[nums1Pos] > nums2[nums2Pos]) {
                nums1[position] = nums1[nums1Pos--];
            } else {
                nums1[position] = nums2[nums2Pos--];
            }
            position--;
        }
    }
}
