import java.util.ArrayList;

public class NumberArray {

    private static final ArrayList<Double> numbersArray = new ArrayList<Double>();

    private static void fillArray() {

        for (int i = 0; i< 50; i++) {
            numbersArray.add(NumberArray.getRandomNumber());
        }
    }

    public static void getAvgInArray() {
        NumberArray.fillArray();

        double sumOfNumbers = 0;

        for (double number : NumberArray.numbersArray) {
            sumOfNumbers += number;
        }

        double avg = sumOfNumbers/NumberArray.numbersArray.size();
        System.out.println("Srednia: " + avg);
    }

    private static double getRandomNumber() {
        int range = 5000;
        int min =0;
       return (Math.random() * range) + min;
    }

    public static void printEverySecondElement(int array[]) {
        for (int i = 0; i <= array.length - 1; i+= 2) {
            System.out.println(array[i]);
        }
    }
}
