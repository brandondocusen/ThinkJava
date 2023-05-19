public class Main {
    public static void main(String[] args) {
        String sampleString = "Sample text for the program that finds the frequency of a character within a string";
        // Create the variable that is the character we will be searching for within the string
        char findThisCharacter = 'i';
        // Declare an integer that takes in the two variables listed above
        int countTheCharacters = countCharactercountTheCharacters(sampleString, findThisCharacter);
        // Return result to console
        System.out.println(countTheCharacters);
    }

    public static int countCharactercountTheCharacters(String str, char character) {
        // This is the beginning of a classic for loop that will iterate through the string and return the total count
        int totalNumber = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == character) {
                totalNumber++;
            }
        }

        return totalNumber;
    }
}