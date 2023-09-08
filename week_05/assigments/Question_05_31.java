package week_05.assigments;

import java.util.Scanner;

public class Question_05_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the initial deposit amount: ");
        double depositAmount = input.nextDouble();
        System.out.print("Enter annual percentage yield: ");
        double annualPercentageYield = input.nextDouble();
        System.out.print("Enter maturity period (number of months): ");
        int month = input.nextInt();
        System.out.println("Month   CD Value");

        for (int i = 0 ; i < month ; i++){
            depositAmount += depositAmount * (annualPercentageYield / 1200);
            System.out.printf("%-8d%.2f" , (i + 1) , depositAmount);
            System.out.println();
        }

    }
}
