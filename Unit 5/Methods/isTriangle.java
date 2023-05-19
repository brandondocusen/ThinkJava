public class Triangle {

    public static boolean isTriangle(int a, int b, int c) {
        if (a + b > c && b + c > a && a + c > b) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 5;
        System.out.println(
                "Can you form a triangle with sides " + a + ", " + b + ", and " + c + "? " + isTriangle(a, b, c));
    }
}