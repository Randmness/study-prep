package study.lc.arrays_strings;

public class TwoSum {
    public int[] twoSum(int[] numbers, int target) {
        int position = 0;
        while(position < numbers.length) {
            for (int i = numbers.length-1; i > position; i--) {
                if (numbers[i] + numbers[position] == target) {
                    return new int[] {position, i};
                }
            }
            position++;
        }

        return null;
    }
}
