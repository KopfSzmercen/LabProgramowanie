import java.util.Random;
import java.util.Scanner;

public class Lab {

    public static boolean isDivideableByFiveAndThree(int a) {
        return a % 3 == 0 && a % 5 == 0;
    }

    public static int thirdPower(int number) {
        return number * number * number;
    }

    public static boolean canConstructTriangle(double a, double b, double c) {
        return Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2);
    }

    public static String getName() {
        System.out.println("Podaj imie");
        var name = getString();
        return name;
    }

    public static int getAge() {
        System.out.println("Podaj wiek: ");
        var age = getInt();
        return age;
    }

    public static void getInput() {
        int a, b;

        Scanner input = new Scanner(System.in);

        System.out.println("Podaj a: ");
        a = getInt();

        System.out.println("Podaj b: ");
        b = getInt();
    }

    public static int[] getValues() {
        int[] table = new int[3];

        System.out.println("Podaj poczatek przewdzialu: ");
        var a = getInt();

        System.out.println("Podaj koniec przewdzialu: ");
        var b = getInt();

        table[0] = new Random().nextInt(a, b);
        table[1] = new Random().nextInt(a, b);
        table[2] = new Random().nextInt(a, b);

        return table;
    }

    public static void count(int a, int b) {
        System.out.println("Suma: " + (a + b));

        System.out.println("Roznica: " + (a - b));

        System.out.println("Iloczyn: " + (a * b));
    }

    public static boolean isEven(int a) {
        return a % 2 == 0;
    }

    public static void wypisz() {
        System.out.println("sdsd");
    }

    public static int getInt() {
        return new Scanner(System.in).nextInt();
    }

    public static String getString() {
        return new Scanner(System.in).nextLine();
    }
}
