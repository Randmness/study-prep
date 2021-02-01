package study.CTCI.ch8_recursion_dynamic_prog;

import java.util.ArrayList;
import java.util.Arrays;

public class PossibleChangePermutations {

    public static void main(String args[]) {
        int change = 8;
        int[] denominations = new int[] {25, 10, 5, 1};
        int[][] cache = new int[change+1][denominations.length];
        System.out.println("Number of permuations: "+ changePermutations(change, denominations, 0));
        System.out.println("Number of permuations: "+ changePermutationsMemo(change, denominations, 0, cache));
    }

    private static int changePermutationsMemo(int total, int[] denominations, int index, int[][] cache) {
        if (cache[total][index] > 0) {
            return cache[total][index];
        }

        int coin = denominations[index];
        if (index == denominations.length-1) {
            int remainder = total % coin;
            return (remainder == 0) ? 1 : 0;
        }

        int ways = 0;
        for (int amount = 0; amount <= total; amount+= coin) {
            ways += changePermutationsMemo(total-amount, denominations, index+1, cache);
        }
        cache[total][index] = ways;
        return ways;
    }

    private static int changePermutations(int total, int[] denominations, int index) {
        int coin = denominations[index];
        if (index == denominations.length-1) {
            int remainder = total % coin;
            return (remainder == 0) ? 1 : 0;
        }

        int ways = 0;
        for (int amount = 0; amount <= total; amount+= coin) {
            ways += changePermutations(total-amount, denominations, index+1);
        }

        return ways;
    }

}
