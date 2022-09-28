//Write a method that takes a String s and an int i as input. The
//method should return true if the character at index i is a vowel,
//false otherwise.

import java.util.*;

public class ExerciseTwo {

    public static void vowelOrNot(int i, String s) {
        char ch = s.charAt(i);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            System.out.println("True.");
        else
            System.out.println("False.");

    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a string: ");
        String s = input.next();
        int y = s.length();

        System.out.println("Please input a number between 0 and " + y);
        int i = input.nextInt();

        vowelOrNot(i, s);
    }
}
