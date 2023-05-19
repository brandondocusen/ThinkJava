import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        // in line 10, "Scanner" is part of the java.util package that is included with
        // every java runtime environment. The Scanner class allows for "listening" of
        // data input
        // in line 10, "System.in" is a Java utility that enables keyboard input into a
        // Java program
        Scanner input = new Scanner(System.in);

        // in line 14, the program initiates communication with the user via command
        // line with the "print" class
        System.out.print("What is the radius of the circle? ");
        int radius = input.nextInt(); // nextInt is a cool method that I just learned! It reads the next integer that
                                      // is input into the scanner class

        // in line 20-21, we initiate the values of the variables that we have nameds
        // "circumference" and "area"
        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        // in line 24-25, we print the calculated end result to command line!
        System.out.println("Based on the radius you provided, the circumference of the circle is " + circumference);
        System.out.println("Based on the radius you provided, the area of the circle is " + area);
    }
}

// this was a very cool assignment, I learned a lot of really useful stuff here.
// Most notabely, the Scanner class and its use cases!