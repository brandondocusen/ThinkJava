
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
            System.out.print("Tell me a human number. No questions. ");
            num1 = input.nextInt();
            System.out.print("Tell me another number. Just.. do it. ");
            num2 = input.nextInt();
            sum = num1 + num2;
            System.out.println("Sum: " + sum + ". Don't tell me that you expected anything less, Professor Bourne.");
            System.out.print("Want to keep going? (please say Y) ");
            choice = input.next().charAt(0);
        } while (choice == 'Y' || choice == 'y');
        input.close();
    }
}