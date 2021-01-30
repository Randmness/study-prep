package src.study.strings;

public class NullifyRowColumn {

    public static void main(String[] args) {
        System.out.println("IsRotation: " + isRotation("waterbottle", "botdtlewater"));
    }

    private static boolean isRotation(String text1, String text2) {
        String doubleText1 = text1+text1;
        return (doubleText1.contains(text2));
    }

}
