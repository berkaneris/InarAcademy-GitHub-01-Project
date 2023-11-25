package week_03.assigments;

import java.util.Scanner;

public class Question_03_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the exchange rate from dollars to RMB: ");
        double rate = input.nextDouble();
        System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
        int convert = input.nextInt();
        double amount;

        if (convert == 0) {
            System.out.print("Enter the dollar amount: ");
             amount = input.nextDouble();
            System.out.println("$" + amount + " is " + (amount * rate) + " yuan" );
        }
        else if (convert == 1){
            System.out.print("Enter the RMB amount: ");
             amount = input.nextDouble();
            System.out.println( amount + " yuan is $" +(int)(amount / rate * 100) / 100.0 );
        }
        else {
            System.out.println("Incorrect input");
        }

    }
}
