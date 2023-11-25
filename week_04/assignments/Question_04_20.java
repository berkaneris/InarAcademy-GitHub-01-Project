package week_04.assigments;

import java.util.Scanner;

public class Question_04_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        System.out.println("The length of the string is " + text.length() +
                           " the first character of the string is " + text.charAt(0));
    }
}
