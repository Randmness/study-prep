package study.lc.arrays_strings;

public class RemoveInPlace {

    public int removeElement(int[] nums, int val) {
        int highestCount = 0;

        int cons = 0;
        for (int digit: nums) {
            if (digit == 1) {
                cons++;
            } else {
                if (cons > highestCount) {
                    highestCount = cons;
                }
                cons = 0;
            }
        }

        return Math.max(highestCount, cons);
    }
}
