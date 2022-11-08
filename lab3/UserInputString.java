import java.util.ArrayList;

public class UserInputString {
    private static final ArrayList<String> userInputStrings = new ArrayList<>();

    public static void fillArray() {
        for (int i = 0; i < 2; i++) {
            System.out.println("Podaj " + i + " liczbe");
            UserInputString.userInputStrings.add(UserInputHelper.getString());
        }
    }

    public static void printReversedArray() {
         String [] arrayOfStrings = new String[UserInputString.userInputStrings.size()];
         arrayOfStrings= UserInputString.userInputStrings.toArray(arrayOfStrings);

        for (int i = arrayOfStrings.length - 1; i >= 0; i--) {
            System.out.println(  new StringBuilder(arrayOfStrings[i]).reverse());
        }
    }
}
