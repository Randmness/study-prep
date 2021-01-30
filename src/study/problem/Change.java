package study.problem;

public class Change {

    static int[] denominations = new int[] {100, 25, 10, 5 ,1};
    static String[] bills = new String[] {"Dollar", "Quarter", "Dime", "Knickel" , "Penny"};

    public static void main(String[] args) {
        returnChange(197);
    }



    private static void returnChange(int change) {
        int[] changeArray = new int[5];

        int position = 0;
        for (int denomination : denominations) {
            if (change > denomination) {
                int frequency = change / denomination;
                changeArray[position] = frequency;
                change = change - denomination * frequency;
                System.out.println(frequency + " " + bills[position]);
            }
            position++;
        }
    }

}
