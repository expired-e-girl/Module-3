//Write a method reverseConcat that takes three input parameters of type String (s1,s2,s3). It
//should return a value of type String equal to the three input Strings concatenated together in
//reverse order. Call this from your main method and print the result.
import java.util.Scanner;

public class ExerciseThree {
   public static void reverseConcat( String s1, String s2, String s3){
        System.out.println(s3 + ' ' + s2 + ' ' + s1);
   }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a first string: ");
        String s1 = input.next();
        System.out.println("Please enter a second string: ");
        String s2 = input.next();
        System.out.println("Please enter a third string: ");
        String s3 = input.next();

        reverseConcat(s1, s2, s3);

    }
}
