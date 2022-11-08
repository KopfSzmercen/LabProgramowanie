public class CompareStringArrays
{
    private static final String []arrayOne = {"Ala", "ma", "kota"};
    private static final String []arrayTwo = {"Ala", "ma", "kota"};

    public static boolean areArraysTheSame() {

        for (int i = 0; i < CompareStringArrays.arrayOne.length; i++) {
            if (CompareStringArrays.arrayOne[i].compareTo(CompareStringArrays.arrayTwo[i]) != 0) return false;
        }

        return true;
    }
}
