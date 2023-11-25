package week_04.assigments;

import java.util.Scanner;

public class Question_04_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string s1: ");
        String s1 = input.nextLine();
        System.out.print("Enter string s2: ");
        String s2 = input.nextLine();

        if ( s1.contains(s2)) {
            System.out.println(s2 + " is a substring of " + s1);
        }
        else {
            System.out.println(s2 + " is not a substring of " + s1);
        }
    }
}
