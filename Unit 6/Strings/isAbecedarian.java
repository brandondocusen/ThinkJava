public class Abecedarian {

    //// This is a method that checks if the given string is abecedarian
    public static boolean isAbecedarian(String str) {
        for (int i = 0; i < str.length() - 1; i++) {
            // If the current character being iterated past is greater
            // than the next character, return false
            if (str.charAt(i) > str.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String input = "dqvwxyz";
        System.out.println(isAbecedarian(input));
    }
}