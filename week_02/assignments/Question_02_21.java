package week_02.assigments;

import java.util.Scanner;

public class Question_02_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter investment amount: ");
        double investmentAmount = input.nextDouble();
        System.out.print("Enter annual interest rate in percentage: ");
        double interestRate = input.nextDouble();
        System.out.print("Enter number of years: ");
        int years = input.nextInt();
        double value = investmentAmount * (Math.pow(1 + (interestRate/1200), years * 12)); // The result of inputs
        System.out.print("Accumulated value is $");
        System.out.format("%.2f", value);

    }
}
