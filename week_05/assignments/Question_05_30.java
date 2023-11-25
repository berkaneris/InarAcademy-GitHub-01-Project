package week_05.assigments;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Question_05_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your saving amount: ");
        double amount = input.nextDouble();
        System.out.print("Enter the annual interest rate: ");
        double interestRate = input.nextDouble();
        System.out.print("Enter the number of months for saving: ");
        int month = input.nextInt();
        double processedAmount = 0;

        for (int i = 0; i < month ; i ++){
            processedAmount += amount;
            processedAmount += processedAmount * (interestRate / 1200);
        }
        System.out.printf("After the %d month, the processed saving is %.3f" ,month , processedAmount);
    }
}
