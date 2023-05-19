import java.util.Scanner;

public class wallPaintingCalculator {
    public static void main(String[] args) {

        // in line 11, "Scanner" is part of the java.util package that is included with
        // every java runtime environment. The Scanner class allows for "listening" of
        // data input
        // in line 11, "System.in" is a Java utility that enables keyboard input into a
        // Java program
        Scanner input = new Scanner(System.in);

        // in line 15,18 and 21, the program initiates communication with the user via command
        // line with the "print" class
        System.out.print("How long is the area that you want to paint? ");
        double length = input.nextDouble();

        System.out.print("How wide is the area that you want to paint? ");
        double width = input.nextDouble();

        System.out.print("How tall is the area that you want to paint? ");
        double height = input.nextDouble();

        // lines 25 & 26, calculate the area of a wall
        double wallArea = 2 * height * (length + width);
        double roofArea = length * width;

        System.out.print("How many doors are in the area you plan to paint? ");
        int numberOfDoors = input.nextInt();

        System.out.print("How many windows are in the area you plan to paint? ");
        int numberOfWindows = input.nextInt();

        // lines 35-37, required to consider the gallons saved by unpainted window and door areas
        double doorArea = numberOfDoors * 20.0;
        double windowArea = numberOfWindows * 15.0;
        double totalArea = wallArea + roofArea - doorArea - windowArea;

        // line 40, this is the final answer to how many gallons are required based on the user's input
        double totalGallonsRequired = totalArea / 350.0;

        // line 43, this is the final statement that is given to the user
        System.out.printf("%.2f gallons of paint are required to cover the given paintable surface area.\n", totalGallonsRequired);

        input.close(); // this is a new function to me! This input.close command stops the scanner class from continuing to listen.
    }
}