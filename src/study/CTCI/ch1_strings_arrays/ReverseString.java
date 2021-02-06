package study.CTCI.ch1_strings_arrays;

public class ReverseString {


    public static void main(String[] args) {
        System.out.println("Reverse String: " + reverse("abcd"));
    }

    private static String reverse(String stringForward) {
        char[] reversedString = new char[stringForward.length()];

        int index = stringForward.length()-1;
        for (char character : stringForward.toCharArray()) {
            reversedString[index] = character;
            index--;
        }

        return String.valueOf(reversedString);
    }


}
