import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Lab.wypisz();

        Lab.count(5, 10);
        System.out.println(Lab.thirdPower(3));

        System.out.println(Lab.canConstructTriangle(2, 4, 5));
        System.out.println(Lab.canConstructTriangle(new Random().nextInt(1, 500), 4, 5));

        int[] wartosci = Lab.getValues();

        System.out.println(Lab.canConstructTriangle(wartosci[0], wartosci[1], wartosci[2]));

        LabTwo.getAvg();
    }
}