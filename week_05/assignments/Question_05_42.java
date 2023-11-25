package week_05.assigments;

import java.util.Scanner;

public class Question_05_42 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int baseSalary = 5000;
        System.out.println("Your base salary is $" + baseSalary);
        System.out.print("How much money do you want to earn in a year: ");
        double earn = input.nextDouble();
        System.out.print("Enter the commission for $0.01–$5,000: ");
        double commission1 = input.nextDouble();
        System.out.print("Enter the commission for $5,000.01–$10,000: ");
        double commission2 = input.nextDouble();
        System.out.print("Enter the commission for $10,000.01 and above: ");
        double commission3 = input.nextDouble();
        double commission = 0;
        double salesAmount ;
        for (salesAmount = 0; commission < (earn - baseSalary); salesAmount++){
            if (0 <= salesAmount && salesAmount <= 5000 ){
                commission = salesAmount * commission1 / 100;
            }else if (salesAmount <= 10000){
                commission =  5000 * commission1 / 100 + (salesAmount - 5000) * commission2 / 100;
            }else{
                commission =  5000 * commission1 / 100 + 5000 * commission2 / 100 + (salesAmount - 10000) * commission3 / 100;
            }
        }
        System.out.println("The sales that you should do is $" + salesAmount);
    }
}
