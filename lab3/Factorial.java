public class Factorial
{
    public static double getFactorial(double number) {
        if (number == 0 || number == 1) return 1;

        return Factorial.getFactorial(number - 1) * number;
    }
}
