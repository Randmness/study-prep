package study.random;

public class PrintNumber {

    //1-9
    //10-90
    //11-19
    //100s, thousands, millions

    public static void main(String args[]) {
        System.out.println(printNumber("999,212,923"));
    }

    public static String printNumber(String number) {

        StringBuilder result = new StringBuilder();

        String[] split = number.split(",");
        int index = 0;
        while (index < split.length) {
            char[] value = split[index].toCharArray();

            if (value[0] != '0') {
                result.append(getIndivLevel(value[0]-'0'));
                result.append(" hundred");
            }

            if (value[1] == '1') {
                result.append(getTeenLevel(10 + (value[2] - '0')));
            } else if (value[1] != '0'){
                result.append(getTenthLevel(value[1]-'0'));
                result.append(getIndivLevel(value[2]-'0'));
            }

            result.append(getLevel(split.length - index));
            index++;
        }

        return result.toString();
    }

    public static String getLevel(int number) {
        switch (number) {
            case 2:
                return " thousand";
            case 3:
                return " million";
            default:
                return "";
        }
    }

    public static String getTenthLevel(int number) {
        switch (number) {
            case 2:
                return " twenty";
            case 3:
                return " thirty";
            case 4:
                return " fourty";
            case 5:
                return " fifty";
            case 6:
                return " sixty";
            case 7:
                return " seventy";
            case 8:
                return " eighty";
            case 9:
                return " ninety";
            default:
                return "";
        }
    }

    public static String getIndivLevel(int number) {
        switch (number) {
            case 1:
                return " one";
            case 2:
                return " two";
            case 3:
                return " three";
            case 4:
                return " four";
            case 5:
                return " five";
            case 6:
                return " six";
            case 7:
                return " seven";
            case 8:
                return " eight";
            case 9:
                return " nine";
            default:
                return "";
        }
    }

    public static String getTeenLevel(int number) {
        switch (number) {
            case 10:
                return " ten";
            case 11:
                return " eleven";
            case 12:
                return " twelve";
            case 13:
                return " thirteen";
            case 14:
                return " fourteen";
            case 15:
                return " fifteen";
            case 16:
                return " sixteen";
            case 17:
                return " seventeen";
            case 18:
                return " eighteen";
            case 19:
                return " nineteen";
            default:
                return "";
        }
    }


}
