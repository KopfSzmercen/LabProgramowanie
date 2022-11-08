import java.util.ArrayList;
import java.util.UUID;


public class StringArray {
    private static final ArrayList<String> stringArray = new ArrayList<String>();

    public static void fillArray() {
        for (int i = 0; i <= 10; i++) {
            StringArray.stringArray.add(StringArray.generateRandomString());
        }
    }

    public static void printArray() {
        for (String value : StringArray.stringArray) {
            System.out.println(value.toUpperCase());
        }
    }
    private static String generateRandomString() {
        String uuid = UUID.randomUUID().toString();
        return "uuid = " + uuid;

    }
}
