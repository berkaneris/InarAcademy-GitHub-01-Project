package week_05.assigments;

import java.util.Scanner;

public class Question_05_21 {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        System.out.print("Loan Amount: ");
        double loanAmount = input.nextDouble();
        System.out.print("Number of Years: ");
        double years = input.nextDouble();

        System.out.println("Interest Rate     Monthly Payment     Total Payment");
        System.out.println();
        for(double interestRate = 5; interestRate <= 8.0 ; interestRate += (1.0 / 8)) {
            double monthlyPayment = loanAmount * (interestRate / 1200) / (1
                    - 1 / Math.pow(1 + (interestRate / 1200), years * 12));
            double totalPayment = monthlyPayment * years * 12;

            System.out.printf("%-5.3f%-13s%-20.2f%-13.2f" , interestRate ,"%" , monthlyPayment , totalPayment);
            System.out.println();
        }
    }
}
