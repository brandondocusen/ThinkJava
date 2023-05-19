// Rewrite it so that the result is a BigInteger.
// The parameters should still be integers

import java.math.BigInteger;

public class PowerCalculator {
    public static BigInteger pow(int x, int n) {
        if (n == 0) {
            return BigInteger.ONE;
        }

        BigInteger t = pow(x, n / 2);

        if (n % 2 == 0) {
            return t.multiply(t);
        } else {
            BigInteger bigX = BigInteger.valueOf(x);
            return t.multiply(t).multiply(bigX);
        }
    }

    public static void main(String[] args) {
        int base = 2;
        int exponent = 10;

        BigInteger result = pow(base, exponent);
        System.out.println(base + " to the power of " + exponent + " is: " + result);
    }
}