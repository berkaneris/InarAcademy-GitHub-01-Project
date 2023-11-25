package week_08.assigments;

import java.util.Scanner;

public class Question_08_12 {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        double [] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
        int [][] brackets =  {
                {8350, 33950, 82250, 171550, 372950}, // Single filer
                {16700, 67900, 137050, 20885, 372950}, // Married jointly -or qualifying widow(er)
                {8350, 33950, 68525, 104425, 186475}, // Married separately
                {11950, 45500, 117450, 190200, 372950} // Head of household
        };

        // Prompt the user to enter filing status
        System.out.print("(0-single filer, 1-married jointly or " +
                "qualifying widow(er), 2-married separately, 3-head of " +
                "household) Enter the filing status: ");

        int status = input.nextInt();

        // Prompt the user to enter taxable income
        System.out.print("Enter the taxable income: ");
        double income = input.nextDouble();
        int count = 0;
        while(brackets[status][count] < income){
            count++;
            if(count == 5){
                break;
            }
        }

        // Compute tax
        double tax = brackets[status][0] * rates[0];
        for (int i = 1; i < brackets[i].length; i++) {
            if (income > brackets[status][i]) {
                tax += (brackets[status][i] - brackets[status][i - 1]) * rates[i];
            } else {
                tax += (income - brackets[status][i - 1]) * rates[i];
                break;
            }
        }
        // Display the result
        System.out.println("Tax is " + (int)(tax * 100) / 100.0);
    }
}
