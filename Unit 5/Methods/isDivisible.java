public class Divisibility {

    public static boolean isDivisible(int n, int m) {
        if (n % m == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int n = 10;
        int m = 2;
        System.out.println(n + " is divisible by " + m + "? " + isDivisible(n, m));
    }
}