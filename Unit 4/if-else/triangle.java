//Write a Java program to accept an integer value 7 or less from the user and create a pyramid-shaped pattern
//The value entered as the base and repeating the row number its number of time in the row. 
import java.util.Scanner;

public class pyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 7 if you want cheap thrills. ");
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}