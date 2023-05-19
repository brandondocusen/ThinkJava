import java.util.Scanner;

public class hoursMinutesSeconds {
    public static void main(String[] args) {

        // in line 11, "Scanner" is part of the java.util package that is included with
        // every java runtime environment. The Scanner class allows for "listening" of
        // data input
        // in line 11, "System.in" is a Java utility that enables keyboard input into a
        // Java program
        Scanner input = new Scanner(System.in);
        
        // in line 15-16, the program initiates communication with the user via command
        // line with the "print" class
        System.out.print("How many seconds would you like to convert to hours and minutes? ");
        int totalSeconds = input.nextInt();
        
        // the variables for hour and minutes is initialized in line 19-20
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        
        // the final output to the user is printed to command line with the following concatinization
        System.out.println("The amount of seconds that you have input are equivalent to " + hours + " hour/s and " + minutes + " minute/s");
    }
}