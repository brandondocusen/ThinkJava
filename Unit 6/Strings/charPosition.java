public class Main {
    public static void main(String[] args) {
        // Create a string called "testString"
        String testString = "Testing the character position retrieval.";
        // Call "getCharacterPosition" method with the "testString" variable and use index at position 12
        char targetPosition = getCharPosition(testString, 12);
        // Print results of the method call
        System.out.println(targetPosition);
    }

        // This is the logic that takes in the string and index above
    public static char getCharPosition(String str, int index) {
        // This line returns the character at the position we asked for, which was index 12
        return str.charAt(index);
    }
}