// Write a program that prompts the user to input a positive integer. 
// It should then print the multiplication table for multipliers of 1 – 12. 
import java.util.Scanner;

public class multiplication_table {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Pick a positive number to watch multiplier magic. ");
        int num = input.nextInt();
        for (int i = 1; i <= 12; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}