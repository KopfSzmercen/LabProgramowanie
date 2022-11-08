public class Main {
    public static void main(String[] args) {

        NumberArray.getAvgInArray();

        int[] evenArray = {1, 2, 3, 4};
        int[] oddArray = {1, 2, 3, 4, 5};


        NumberArray.printEverySecondElement(evenArray);
        NumberArray.printEverySecondElement(oddArray);

        StringArray.fillArray();
        StringArray.printArray();

        UserInputString.fillArray();
        UserInputString.printReversedArray();

        UserInputNumbers.fillArray();
        UserInputNumbers.staticSortAndPrint();

        System.out.println( CompareStringArrays.areArraysTheSame());
    }

}