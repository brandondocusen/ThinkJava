
// Write a Java program that asks the user for a single alphabetic character. 
// Print Vowel or Consonant, whichever is true of the character entered. 
// If the character entered isn’t an alphabetic character (between a and z or A and Z), or is a string with a length > 1, print an error message instead.
import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a character in the alphabet. ");
        String input = scanner.nextLine();
        if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
            System.out.println("Error: Please enter a letter of the alphabet. ");
        } else {
            char c = input.charAt(0);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
                    || c == 'U') {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
        }
    }
}