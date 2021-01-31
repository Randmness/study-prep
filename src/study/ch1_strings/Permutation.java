package study.ch1_strings;

public class Permutation {

    public static void main(String[] args) {
        System.out.println("Permutation: " + permutation("abc", "bca3"));
    }

    private static boolean permutation(String text1, String text2) {

        int[] count = new int[128];
        for (char character: text1.toCharArray()) {
            count[character]++;
        }

        for (char character: text2.toCharArray()) {
            count[character]--;
            if (count[character]<0) {
                return false;
            }
        }

        return true;
    }
}
