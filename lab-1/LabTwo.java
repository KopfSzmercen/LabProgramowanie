public class LabTwo {

    public static void getAvg() {

        System.out.println("Podaj liczbe studentow");
        var numberOfStudents = Lab.getInt();

        int sumOfPoints = 0;

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Podaj punkty: ");
            sumOfPoints += Lab.getInt();
        }

        System.out.println("Srednia: " + (sumOfPoints / numberOfStudents));
    }
}
