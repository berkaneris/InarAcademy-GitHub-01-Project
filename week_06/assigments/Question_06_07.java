package week_06.assigments;

import java.util.Scanner;

public class Question_06_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("The amount invested: ");
        double investmentAmount = input.nextDouble();
        System.out.print("Annual interest rate: ");
        double interestRate = input.nextDouble();
        int years = 30;
        System.out.println("Years          Future Value");
        for (int i = 1; i <= years; i++){
            System.out.printf("%-15d%12.2f" , i , futureInvestmentValue(investmentAmount ,interestRate/1200 ,i ));
            System.out.println();
        }


    }
    public static double futureInvestmentValue(
            double investmentAmount, double monthlyInterestRate, int years){
        return investmentAmount * (Math.pow(1 + (monthlyInterestRate), years * 12));
    }
}
