
// Create a 2D array that contains student and their classes using the data shown in the following table. 
// Ask the user to provide a name and respond with the classes associated with that student. 

import java.util.Scanner;

public class findTheCourses {

    public static void main(String[] args) {

        String[][] findTheCourses = {
                { "Joe", "CS101", "CS110", "CS255" },
                { "Mary", "CS101", "CS115", "CS270" },
                { "Isabella", "CS101", "CS110", "CS270" },
                { "Orson", "CS220", "CS255", "CS270" }
        };


        Scanner input = new Scanner(System.in);
        System.out.print("What is the student's name?");
        String student = input.nextLine();


        boolean found = false;
        for (int i = 0; i < findTheCourses.length; i++) {
            if (findTheCourses[i][0].equals(student)) {
                System.out.print("The courses for " + student + " are ");
                for (int j = 1; j < findTheCourses[i].length; j++) {
                    System.out.print(findTheCourses[i][j] + " ");
                }
                found = true;
                break;
            }
        }

        
        if (!found) {
            System.out.println("Student not found.");
        }
    }
}