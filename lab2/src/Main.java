public class Main {
    public static void main(String[] args) {
        try {
            QuadraticEquation.solve();
        } catch (Exception e) {
            System.out.println(e);
        }


        System.out.println(MyFunction.solveFunctionA());
        System.out.println(MyFunction.solveFunctionB());
        System.out.println(MyFunction.solveFunctionC());

        NumberOrderer.sortNumbers();
    }
}