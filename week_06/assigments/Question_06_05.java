package week_06.assigments;

import java.util.Scanner;

public class Question_06_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double number1 = input.nextDouble();
        System.out.print("Enter the second number: ");
        double number2 = input.nextDouble();
        System.out.print("Enter the third number: ");
        double number3 = input.nextDouble();
        displaySortedNumbers(number1,number2,number3);
    }

    public static void displaySortedNumbers(
            double num1, double num2, double num3) {
        double min = Math.min(Math.min(num1, num2), num3);
        double max = Math.max(Math.max(num1, num2), num3);
        double mid ;
        if (num1 != min && num1 != max) {
            mid = num1;
        } else if (num2 != min && num2 != max) {
            mid = num2;
        } else {
            mid = num3;
        }
        System.out.println(min + " " + mid + " " + max);
    }
}
