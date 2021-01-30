package src.study.strings;

public class StringCompression {

    public static void main(String[] args) {
        System.out.println("StringCompression: " + compressString("abcdeeeeeeeee"));
    }

    private static String compressString(String text) {
        char[] textArray = text.toCharArray();

        StringBuilder response = new StringBuilder();

        char temp = text.charAt(0);
        int tempCount = 0;
        for(Character character: textArray) {
            if (character != temp) {
                response.append(temp);
                response.append(tempCount);
                tempCount = 0;
                temp = character;
            }

            tempCount++;
        }

        //write last
        response.append(temp);
        response.append(tempCount);

        String compressedString = response.toString();
        if (compressedString.length() > text.length()) {
            return text;
        }

        return compressedString;
    }
}
