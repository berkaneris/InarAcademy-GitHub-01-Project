package week_04.assigments;

import java.util.Scanner;

public class Question_04_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        String letter = input.nextLine();

        if (letter.length() != 1) {
            System.out.println("The input is invalid.");
            System.exit(1);
        }
        char ch = letter.charAt(0);
        if (('A' <= ch && ch <= 'Z') || ('a' <= ch && ch <= 'z')) {
               if ( letter.equalsIgnoreCase("A") ||
                    letter.equalsIgnoreCase("E") ||
                    letter.equalsIgnoreCase("I") ||
                    letter.equalsIgnoreCase("O") ||
                    letter.equalsIgnoreCase("U") ) {
                   System.out.println(letter + " is a vowel");
               } else {
                   System.out.println(letter + " is a consonant");
               }

        }
        else {
            System.out.println(letter + " is an invalid input");
        }
    }
}
