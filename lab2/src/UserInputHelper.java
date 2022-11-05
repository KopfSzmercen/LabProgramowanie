import java.util.Scanner;

public class UserInputHelper {
    public static int getInt() {
        return new Scanner(System.in).nextInt();
    }

    public static String getString() {
        return new Scanner(System.in).nextLine();
    }
}
