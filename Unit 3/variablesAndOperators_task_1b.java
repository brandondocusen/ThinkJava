public class example {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // define 3 or more integers or floats
        int birthYear = 1985; // integer variable
        int birthMonth = 4; // integer variable
        int birthDay = 6; // integer variable
        float birthWeight = 1.873927f; // float variable
        char gender = 'F'; // character variable
        boolean isSoftwareDeveloper = true; // boolean variable
        long height = 1000000000L; // long variable
        short points = 18; // short variable
        byte count = 19; // byte variable

        // define one or two illegal field names - I will use Java keywords and
        // prohibited starter symbols to comeplete this assignment request
        int class = 1;
        String int = "low IQ";

        // printing variables
        System.out.println(birthYear);
        System.out.println(birthMonth);
        System.out.println(birthDay);
        System.out.println(birthWeight);
        System.out.println(gender);
        System.out.println(isSoftwareDeveloper);
        System.out.println(height);
        System.out.println(points);
        System.out.println(count);
        System.out.println(_class); // problematic variable name
        System.out.println($int); // problematic variable name

    }
}