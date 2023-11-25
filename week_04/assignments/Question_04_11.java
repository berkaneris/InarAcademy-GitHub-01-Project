package week_04.assigments;

import java.util.Scanner;

public class Question_04_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal value (0 to 15): ");
        int number = input.nextInt();

        if (0 <= number && number <= 15) {
            System.out.print("The hex value is ");
            if (number <= 9) {
                System.out.println(number);
            } else if (number == 10) {
                System.out.println("A");
            }else if (number == 11) {
                System.out.println("B");
            }else if (number == 12) {
                System.out.println("C");
            }else if (number == 13) {
                System.out.println("D");
            }else if (number == 14) {
                System.out.println("E");
            }else  {
                System.out.println("F");
            }
        } else {
            System.out.println(number + " is an invalid input");
        }
    }
}
