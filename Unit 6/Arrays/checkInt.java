

// Modify the method created in #1 to take in 5 integers from a user and store them in an array. 
//Then ask the user to repeat one of the ten numbers. 
// Respond to the user that yes, the number is in the list or no, the number is not in the list. 



import java.util.Scanner;

public class NumberArray {

    public static void main(String[] args) {
        int[] numbers = new int[5];
        Scanner input = new Scanner(System.in);
        

        System.out.println("Enter five different numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = input.nextInt();
        }
        

        System.out.println("Enter a number to search for:");
        int searchNumber = input.nextInt();
        
        // Check the array for the input number
        boolean found = false;
        for (int i = 0; i < 5; i++) {
            if (numbers[i] == searchNumber) {
                found = true;
                break;
            }
        }
        
        // Print whether or not there was a match
        if (found) {
            System.out.println("Match");
        } else {
            System.out.println("Not in the array");
        }
    }

}