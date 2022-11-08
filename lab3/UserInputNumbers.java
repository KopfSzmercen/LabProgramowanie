import java.util.ArrayList;
import java.util.Collections;

public class UserInputNumbers

{
    private static final ArrayList<Double> numbersArray = new ArrayList<Double>();

    public static void fillArray() {
        for (int i = 0; i < 2; i++) {
            System.out.println("Podaj " + i + " liczbe");
            UserInputNumbers.numbersArray.add(UserInputHelper.getDouble());
        }
    }

    public static void staticSortAndPrint() {
       Collections.sort( UserInputNumbers.numbersArray);

       for (var e : UserInputNumbers.numbersArray) {
           System.out.println(e + " Silnia: " + Factorial.getFactorial(e));
       }

    }
}
