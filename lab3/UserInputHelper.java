import java.util.Scanner;

public class UserInputHelper {
    public static String getString() {
        var scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static Double getDouble() {
        var scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }
}
