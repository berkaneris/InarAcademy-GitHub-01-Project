package week_04.assigments;

import java.util.Scanner;

public class Question_04_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an ASCII code: ");
        int number = input.nextInt();

        if (0 <= number && number <= 127) {
            char value = (char) number;
            System.out.println("The character for ASCII code " + number + " is " + value);
        }
        else {
            System.out.println("The input is invalid");
            System.exit(1);
        }
    }
}
