//This program requests a user input integer between 0 to 100 and switches it to the appropriate grade.
//
//Grading scale
//Below 25 - F
//25 to 45 - E
//45 to 50 - D
//50 to 60 - C
//60 to 80 - B
//Above 80 – A
//
import java.util.*;

public class Grading {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

         System.out.println("Please enter a grade between 0 and 100: ");
         int numberGrade = input.nextInt();

            if ( numberGrade < 25  ) System.out.println("Grade result is F.");
            if ( numberGrade >= 25 && numberGrade < 45 ) System.out.println("Grade result is E.");
            if ( numberGrade >= 45 && numberGrade < 50 ) System.out.println("Grade result is D.");
            if ( numberGrade >= 50 && numberGrade < 60 ) System.out.println("Grade result is C.");
            if ( numberGrade >= 60 && numberGrade < 80 ) System.out.println("Grade result is B.");
            if ( numberGrade >= 80 ) System.out.println("Grade result is A.");

    }

}