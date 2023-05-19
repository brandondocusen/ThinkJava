import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        // in line 10, "Scanner" is part of the java.util package that is included with
        // every java runtime environment. The Scanner class allows for "listening" of
        // data input
        // in line 10, "System.in" is a Java utility that enables keyboard input into a
        // Java program
        Scanner input = new Scanner(System.in);

        // in line 14, the program initiates communication with the user via command
        // line with the "print" class
        System.out.print("What celsius temperature would you like to convert to farenheit? "); 
        double celsius = input.nextDouble();    // nextDouble is a cool method that I just learned! It reads the next double that
                                                // is input into the scanner class
        double fahrenheit = 1.8 * celsius + 32; // in line 17, the variable to convert celsius to fahrenheight is initiated
        System.out.println("The temperature " + celsius + " celsius is equivalent to farenheit " + fahrenheit);
    }
}