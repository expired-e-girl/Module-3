//Write a method that takes a String as input and prints true if the
//String length is greater than 6 characters. The method should print
//false otherwise.
import java.util.*;

public class ExerciseOne {
    public static void longerThan(String x) {
        int y = x.length();
        if (y > 6){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        longerThan(input.next());
    }
}
