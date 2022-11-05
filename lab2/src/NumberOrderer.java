import java.util.ArrayList;
import java.util.Comparator;

public class NumberOrderer {

    static void sortNumbers() {
        ArrayList<Integer> numberArray = new ArrayList<Integer>();

        boolean shouldGetNumbers = true;

        while (shouldGetNumbers) {
            System.out.println("Podaj liczbe calkowita: ");
            numberArray.add(UserInputHelper.getInt());

            System.out.println("Zakonczyc i posortowac? [Y/N]");
            String userInput = UserInputHelper.getString();

            if (userInput.charAt(0) == 'Y') shouldGetNumbers = false;
        }
        numberArray.sort(Comparator.naturalOrder());

        System.out.println(numberArray);
    }
}
