import java.util.Scanner;

public class oddSum {

    public static int addIt(int n) {
        if (n == 0) {
            return 0;
        } else {
            int placeholder = 0;
            if (n % 2 == 1) {
                placeholder = n;
            }
            return placeholder + addIt(n - 1);
        }
    }

    public static void main(String[] logic) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a value for n: ");
        int n = in.nextInt();
        System.out.println("When adding ever number from 1 to " + n + " is " + addIt(n));
    }

}