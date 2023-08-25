package week_04.assigments;

import java.util.Scanner;

public class Question_04_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter employee's name: ");
        String name = input.nextLine();
        System.out.print("Enter number of hours worked in a week: ");
        double hours = input.nextDouble();
        System.out.print("Enter hourly pay rate: ");
        double payRate = input.nextDouble();
        System.out.print("Enter federal tax withholding rate: ");
        double federalTaxRate = input.nextDouble();
        System.out.print("Enter state tax withholding rate: ");
        double stateTaxRate = input.nextDouble();

        //Operations:::::

        double grossPay = (payRate * hours);
        double federalPay = (payRate * hours * federalTaxRate);
        double statePay = (payRate * hours * stateTaxRate);

        //Results:::::

        System.out.println("Employee Name: " + name +
                           "\nHours Worked: " + hours +
                           "\nPay Rate: $" + payRate +
                           "\nGross Pay: $" + grossPay +
                           "\nDeductions: " +
                           "\n  Federal Withholding ("+ (federalTaxRate * 100) + "%): $" + federalPay +
                           "\n  State Withholding (" + (stateTaxRate * 100) + "%): $" + statePay +
                           "\n  Total Deduction: $" + (int)((federalPay + statePay) * 100) / 100.0 +
                           "\nNet Pay: $" + (int)((grossPay - (federalPay + statePay)) * 100) / 100.0 );

    }
}
