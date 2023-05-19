import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        // in line 10, "Scanner" is part of the java.util package that is included with
        // every java runtime environment. The Scanner class allows for "listening" of
        // data input
        // in line 10, "System.in" is a Java utility that enables keyboard input into a
        // Java program
        Scanner input = new Scanner(System.in);

        // in line 14, the program initiates communication with the user via command
        // line with the "print" class
        System.out.print("What is the length of the first side of the triange? ");
        double side1 = input.nextDouble();  // nextDouble is a cool method that I just learned! It reads the next double that
                                        // is input into the scanner class

        System.out.print("What is the length of the second side of the triangle? ");
        double side2 = input.nextDouble();

        System.out.print("What is the length of the third side of the triangle? ");
        double side3 = input.nextDouble();

        // in line 25, a variable named "s" is initiated with the inputs of the three initial user prompts
        double s = (side1 + side2 + side3) / 2;

        // in line 28, we have applied the formula to find the area of a triangle
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

        // in line 31, the final message is delivered to user via command line
        System.out.println("According to the length of each of the three sides you input, the area of the triangle is " + area);
    }
}