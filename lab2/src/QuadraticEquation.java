public class QuadraticEquation {
    private static int a, b, c;
    private final int x = 10;

    public static void solve() {
        System.out.println("Podaj a: ");
        a = UserInputHelper.getInt();

        System.out.println("Podaj b: ");
        b = UserInputHelper.getInt();

        System.out.println("Podaj c: ");
        c = UserInputHelper.getInt();

        double delta = Math.pow(b, 2) - (4 * a * c);

        if (delta < 0) throw new ArithmeticException("Równanie nie ma rozwiązań");


        if (delta > 0) {
            double x1 = (-b - Math.sqrt(delta)) / (2 * a);
            double x2 = (-b + Math.sqrt(delta)) / (2 * a);
            System.out.println("X1: " + x1 + " X2: " + x2);
        } else {
            double x1 = -b / (2 * a);
            System.out.println("X1: " + x1);
        }

    }
}
