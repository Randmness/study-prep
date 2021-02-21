package study.lc.design;

import java.util.Random;

public class ShuffleAnArray {

    //O(n) - Fisher Yates
    class Solution {
        int[] array;
        int[] original;

        Random random = new Random();

        public Solution(int[] nums) {
            this.array = nums;
            this.original = nums.clone();
        }

        private int randRange(int min, int max) {
            return random.nextInt(max - min) + min;
        }

        private void swapAt(int i, int j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }

        /** Resets the array to its original configuration and return it. */
        public int[] reset() {
            array = original;
            original = original.clone();
            return original;
        }

        /** Returns a random shuffling of the array. */
        public int[] shuffle() {
            for (int i = 0; i < array.length; i++) {
                swapAt(i, randRange(i, array.length));
            }
            return array;
        }
    }
}
