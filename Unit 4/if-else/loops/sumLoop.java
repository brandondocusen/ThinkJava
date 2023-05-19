// Write a do-while loop that asks the user to enter two numbers. 
// The numbers should be added and the sum displayed. 
// The loop should ask the user whether he or she wishes to perform the operation again. 
// If so, the loop should repeat; otherwise it should terminate. 
import java.util.Scanner;

public class SumLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, sum;
        char choice;
        do {
            System.out.print("Enter first number: ");
            num1 = input.nextInt();
            System.out.print("Enter second number: ");
            num2 = input.nextInt();
            sum = num1 + num2;
            System.out.println("Sum: " + sum);
            System.out.print("Do you want to perform the operation again? (Y/N): ");
            choice = input.next().charAt(0);
        } while (choice == 'Y' || choice == 'y');
        input.close();
    }
}