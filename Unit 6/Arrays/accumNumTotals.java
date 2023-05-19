// Accept 15 integers from a user and print the following: 
//number of positive numbers, number of 0s, the smallest number
// number of negative numbers, the largest number, number of even numbers
// number of odd numbers

import java.util.Scanner;
public class NumberAnalysis {
    public static void main(String[] args) {
        int[] numbers = new int[15];
        int positives = 0;
        int negatives = 0;
        int evens = 0;
        int odds = 0;
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int zeros = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 15 different numbers:");
        for (int i = 0; i < 15; i++) {
            numbers[i] = input.nextInt();
            if (numbers[i] == 0) {
                zeros++;
            } else if (numbers[i] > 0) {
                positives++;
            } else {
                negatives++;
            }
            if (numbers[i] % 2 == 0) {
                evens++;
            } else {
                odds++;
            }
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }
        System.out.println("Positive numbers: " + positives);
        System.out.println("Negative numbers: " + negatives);
        System.out.println("Even numbers: " + evens);
        System.out.println("Odd numbers: " + odds);
        System.out.println("Largest number: " + largest);
        System.out.println("Smallest number: " + smallest);
        System.out.println("Number of times 0 was used: " + zeros);
    }
}