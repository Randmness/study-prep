package study.EPI.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MultiplyArrays {

    public static List<Integer> multiply(List<Integer> num1, List<Integer> num2) {
        int sign = (num1.get(0) * num2.get(0) < 0) ? -1 : 1;
        num1.set(0, Math.abs(num1.get(0)));
        num2.set(0, Math.abs(num2.get(0)));

        /**
         * [1,2,3]
         * [2,0]
         * [0,0,0,0,0]
         *
         * 4 = (3,0)
         */
        List<Integer> result = new ArrayList<>(Collections.nCopies(num1.size() + num2.size(), 0));
        for (int n1Index = num1.size()-1; n1Index >= 0 ; n1Index--) {
            for (int n2Index = num2.size()-1; n2Index >= 0; n2Index--) {
                int index = n1Index + n2Index;
                //store the entire result
                result.set(index+1, result.get(index+1) + num1.get(n1Index) * num2.get(n2Index));
                //add carry over
                result.set(index, result.get(index+1)/10);
                //remove carryover
                result.set(index+1, result.get(index+1) % 10);
            }
        }

        int firstZero = 0;
        while (firstZero < result.size() && result.get(firstZero) == 0) {
            ++firstZero;
        }

        result = result.subList(firstZero, result.size());
        result.set(0, result.get(0) * sign);
        return result;
    }

    public static void main(String args[]) {
        int[] result = multiply(new int[] {1,2,3}, new int[]{-2,4});

        for (int value: result) {
            System.out.print(value+" ");
        }
    }


    public static int[] multiply(int[] num1, int[] num2) {
        int sign = num1[0] * num2[0] < 0 ? -1: 1;
        num1[0] = Math.abs(num1[0]);
        num2[0] = Math.abs(num2[0]);

        int[] result = new int[num1.length + num2.length];

        /**
         * n1 = [1,2,3], n2 = [2, 4]
         * result = [0, 0, 0, 0, 0]
         *
         *
         * [0, 0, 0, 0, 0]
         * [0, 0, 0, 0, 12]
         * [0, 0, 0, 7, 2]
         */
        for (int n1 = num1.length-1; n1 >= 0; n1--) {
            for (int n2 = num2.length-1; n2 >=0; n2--) {
                int index = n1 + n2;
                result[index+1] = result[index+1] + num1[n1] * num2[n2];
                result[index] = result[index] + result[index+1]/10;
                result[index+1] = result[index+1] % 10;

                for (int value: result) {
                    System.out.print(value+" ");
                }
                System.out.println("");
            }
        }

        int firstNonZero = 0;
        while (firstNonZero < result.length && result[firstNonZero] == 0) firstNonZero++;

        result[firstNonZero] = result[firstNonZero] * sign;
        return result;
    }
}
