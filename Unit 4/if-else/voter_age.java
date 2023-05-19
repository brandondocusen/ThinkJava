//Write Java program that accepts the user’s age and then determines if the user’s is eligible (must have attained 18 years of age on or before 11/3/2020) to vote in the national election in 2020. 
//The program is to isplay whether or not user is eligible to vote. 
import java.time.LocalDate;
import java.util.Scanner;

public class VoterEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);                                                      // sets up scanner class to accept user input via cmd line
        System.out.print("How many years old are you? ");                                            // prints initial instruction message for user
        int age = scanner.nextInt();                                                                   // initializes age variable from scanner input
        LocalDate electionDate = LocalDate.of(2020, 11, 3);                      // saves date of local election to client
        LocalDate birthdate = LocalDate.now().minusYears(age);                                         // calculates birth year by subtracint user input from current date
        if (birthdate.isBefore(electionDate.minusYears(18))) {                         // conditionally determine if user integer is above or below threshold
            System.out.println("You are eligible to vote in the national election in 2020.");
        } else {
            System.out.println("You are not eligible to vote in the national election in 2020.");
        }
    }

}
