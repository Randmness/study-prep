package study.lc.recursion;

public class ReverseString {

    public static void main(String[] args) {
        char[] test = "abcd".toCharArray();
        reverseString(0, test.length-1, test);
        System.out.println("Reversed: "+ String.valueOf(test));
    }


    public static void reverseString(int start, int end, char[] s) {
        if (start >= end) return;

        char temp = s[end];
        s[end] = s[start];
        s[start] = temp;

        reverseString(start + 1, end -1, s);
    }
}
