package study.lc.hash;

import java.util.Arrays;

public class SingleNumber {

    public int singleNumber(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        Arrays.sort(nums);

        int position = 0;
        while (position < nums.length-1) {
            if (nums[position] != nums[position+1]) return nums[position];

            position+=2;
        }

        //single element at end
        return nums[position];
    }


    //1, 2, 2 returns 1
    //01, 10, 10 = 01 XOR 10 XOR 10 = 11 XOR 10 = 01
    public int singleNumberXOR(int[] nums) {
        int a = 0;

        for (int num: nums) {
            a^=num;
        }

        return a;
    }
}
