public class stringNumber {
    // Takes two String parameters str and sub and returns an int value.
    public static int stringNumber(String str, String sub) {
        int totalCount = 0;
        int lastNumber = 0;
        // While loop to find the number of matching strings in main string
        while (lastNumber != -1) {
            lastNumber = str.indexOf(sub,
                    lastNumber);
            if (lastNumber != -1) {
                totalCount++;
                lastNumber += sub.length();
            }
        }
        return totalCount;
    }

    public static void main(String[] args) {
        String str = "This is the main test that is being used to check against the string counter";
        String sub = "the";
        int totalCount = stringNumber(str, sub);
        System.out.println(totalCount);
    }
}
