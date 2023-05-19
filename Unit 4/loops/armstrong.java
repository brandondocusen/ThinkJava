// Write a program to print out all Armstrong numbers between 1 and 500. If
// sum of cubes of each digit of the number is equal to the number itself,
// then the number is called an Armstrong number.
// For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 )
public class ArmstrongNumbers {
    public static void main(String[] args) {
        int num, originalNum, remainder, result = 0;
        System.out.println("These are the Armstrong numbers between 1 and 500.");
        for (int i = 1; i <= 500; i++) {
            num = i;
            originalNum = num;
            while (originalNum != 0) {
                remainder = originalNum % 10;
                result += Math.pow(remainder, 3);
                originalNum /= 10;
            }
            if (result == num) {
                System.out.print(num + " ");
            }
            result = 0;
        }
    }
}