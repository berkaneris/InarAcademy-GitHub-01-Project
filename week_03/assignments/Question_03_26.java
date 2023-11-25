package week_03.assigments;

import java.util.Scanner;

public class Question_03_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        System.out.println("Is " + number + " divisible by 5 and 6? " +
                ((10 % 5 == 0 && 10 % 6 == 0) ? "true" : "false"));
        System.out.println("Is " + number + " divisible by 5 or 6? " +
                ((10 % 5 == 0 || 10 % 6 == 0) ? "true" : "false"));
        System.out.println("Is " + number + " divisible by 5 or 6?, but not both? " +
                ((10 % 5 == 0 || 10 % 6 == 0) ? "true" : "false"));

    }
}
