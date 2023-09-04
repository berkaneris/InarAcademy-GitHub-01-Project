package week_05.assigments;

import java.util.Scanner;

public class Question_05_22 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.print("Loan Amount: ");
        double loanAmount = input.nextDouble();
        System.out.print("Number of Years: ");
        int numberOfYears = input.nextInt();
        System.out.print("Annual Interest Rate: ");
        double annualInterestRate = input.nextDouble();

        double monthlyPayment = loanAmount * (annualInterestRate / 1200) / (1
                - 1 / Math.pow(1 + (annualInterestRate / 1200), numberOfYears * 12));
        double totalPayment = monthlyPayment * numberOfYears * 12;

        System.out.printf("Monthly Payment: %.2f" , monthlyPayment);
        System.out.println();
        System.out.printf("Total Payment: %.2f" , totalPayment);
        System.out.println();

        System.out.println("Payment#     Interest     Principal     Balance");
        double balance = loanAmount;
        for (int i = 1; i <= numberOfYears * 12; i++){
            double monthlyInterest = (annualInterestRate / 1200) * balance;
            double principal = monthlyPayment - monthlyInterest;
            balance -= principal;
            System.out.printf("%-13d%-13.2f%-14.2f%-7.2f" , i , monthlyInterest , principal , balance);
            System.out.println();
        }
    }
}
