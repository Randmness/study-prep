package study.lc.arrays_strings;

public class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int position = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[position] != nums[i]) {
                position++;
                nums[position] = nums[i];
            }
        }

        return position+1;
    }
}
