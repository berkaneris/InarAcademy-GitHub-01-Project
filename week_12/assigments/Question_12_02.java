package week_12.assigments;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question_12_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two integers to sum: ");
        boolean control = true;
        while (control) {
            try {
                int number1 = input.nextInt();
                int number2 = input.nextInt();

                System.out.println("Sum of " + number1 + " + " + number2 + " is " + (number1 + number2));
                control = false;
            } catch (InputMismatchException ex) {
                System.out.println(ex.getClass().toString().substring(6));
                System.out.println("Wrong input !! Please enter integer -->");
                input.nextLine();
            }
        }
    }
}
