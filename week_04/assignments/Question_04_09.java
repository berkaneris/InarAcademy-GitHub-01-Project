package week_04.assigments;

import java.util.Scanner;

public class Question_04_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        String value = input.next();

        if(value.length() != 1){
            System.out.println("You must enter exactly one character");
            System.exit(1);
        }
        char ch = value.charAt(0);
        int unicode = ch;

        System.out.println("The Unicode for the character " + ch + " is " + unicode);
    }
}
