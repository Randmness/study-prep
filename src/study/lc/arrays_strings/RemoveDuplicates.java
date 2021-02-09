package study.lc.arrays_strings;

public class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {
        if (nums.length > 2) {
            return nums.length;
        }

        int position = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[position] != nums[i]) {
                position++;
                nums[position] = nums[i];
            }
        }

        return position+1;
    }
}
