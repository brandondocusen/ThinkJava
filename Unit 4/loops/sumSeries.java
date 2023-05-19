// Write a program to calculate the sum of following series where n is input by user.
// 1 + 1/2 + 1/3 + 1/4 + 1/5 +............1/n
import java.util.Scanner;

public class sumSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Type any integer here. ");
        int n = input.nextInt();
        double total = 0.0;
        for (int i = 1; i <= n; i++) {
            total += 1.0 / i;
        }
        System.out.println("When added together, the sum is " + total);
    }
}