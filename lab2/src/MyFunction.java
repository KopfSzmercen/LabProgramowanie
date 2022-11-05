public class MyFunction {

    static public int solveFunctionA() {

        System.out.println("Podaj x: ");
        int x = UserInputHelper.getInt();

        if (x > 0) return 2 * x;

        if (x == 0) return 0;

        return -3 * x;
    }

    static public int solveFunctionB() {
        System.out.println("Podaj x: ");

        int x = UserInputHelper.getInt();
        if (x >= 1) return (int) Math.pow(x, 2);

        return x;

    }

    static int solveFunctionC() {
        System.out.println("Podaj x: ");

        int x = UserInputHelper.getInt();
        if (x > 2) return x + 2;

        if (x < 2) return x - 4;

        return 8;

    }
}
