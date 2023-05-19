
// Using the 2D array created in #5, ask the user for a specific course number and list to the display the names of the students enrolled in that course. 


import java.util.Scanner;

public class CourseStudents {
    public static void main(String[] args) {


        String[][] studentClasses = {
                {"Joe", "CS101", "CS110", "CS255"},
                {"Mary", "CS101", "CS115", "CS270"},
                {"Isabella", "CS101", "CS110", "CS270"},
                {"Orson", "CS220", "CS255", "CS270"}
        };


        Scanner input = new Scanner(System.in);
        System.out.print("Which course are you taking? ");
        String course = input.nextLine();


        boolean found = false;
        for (int i = 0; i < studentClasses.length; i++) {
            for (int j = 1; j < studentClasses[i].length; j++) {
                if (studentClasses[i][j].equals(course)) {
                    if (!found) {
                        System.out.print("Classmates also in " + course + " are -  ");
                        found = true;
                    }
                    System.out.print(studentClasses[i][0] + " ");
                    break;
                }
            }
        }

        if (!found) {
            System.out.println("Did you give me a valid class number?");
        }
    }
}





