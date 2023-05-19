

// Take 5 integers from a user and store them in an array and then print them on the display screen in reverse order.


import java.util.Scanner;

public class numberReverser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        // Prompt the user to input 5 integers
        System.out.println("Type a number, then press enter. Do that 5 times.");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Print the array in reverse order
        System.out.println("Your numbers have been placed in reverse order.");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}