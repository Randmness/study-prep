package study.CTCI.ch8_recursion_dynamic_prog;

import java.util.ArrayList;

public class PermutationsOfString {

    public static void main(String args[]) {
        for (String result : permutations("adcd")) {
            System.out.println(result);
        }
    }

    private static ArrayList<String> permutations(String permutation) {
        ArrayList<String> results = new ArrayList<>();
        if (permutation.length() == 0) {
            results.add("");
        }

        for (int index = 0; index < permutation.length(); index++) {
            char letter = permutation.charAt(index);
            String before = permutation.substring(0, index);
            String after = permutation.substring(index+1);
            ArrayList<String> permResults = permutations(before + after);

            for (String permResult : permResults) {
                results.add(letter + permResult);
            }
        }

        return results;
    }
}
