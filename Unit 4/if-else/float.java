// Write a Java program that reads a floating-point number and prints "zero" if the number is zero. 
// Otherwise, print "positive" or "negative". 
// If the absolute value of the number entered is less than 1, prefix the value state with "small", If the number exceeds 1,000,000, add the prefix "large."
import java.util.Scanner;

public class floating_point_identifier {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num = input.nextDouble(); // awaits user input of a integer or float
        if (num == 0) {                  // conditional if-else logic
            System.out.println("zero");
        } else if (num > 0) {
            if (num < 1) {
                System.out.println("small positive");
            } else if (num > 1000000) {
                System.out.println("large positive");
            } else {
                System.out.println("positive");
            }
        } else {
            if (Math.abs(num) < 1) {
                System.out.println("small negative");
            } else if (Math.abs(num) > 1000000) {
                System.out.println("large negative");
            } else {
                System.out.println("negative");
            }
        }
    }
}