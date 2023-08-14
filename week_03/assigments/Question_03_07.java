package week_03.assigments;

import java.util.Scanner;

public class Question_03_07 {
    public static void main(String[] args) {
        // Create a Scanner
         Scanner input = new Scanner(System.in);

         // Receive the amount
         System.out.print(
                 "Enter an amount in double, for example 11.56: ");
         double amount = input.nextDouble();

         int remainingAmount = (int)(amount * 100);

         // Find the number of one dollars
         int numberOfOneDollars = remainingAmount / 100;
         remainingAmount = remainingAmount % 100;

         // Find the number of quarters in the remaining amount
         int numberOfQuarters = remainingAmount / 25;

        remainingAmount = remainingAmount % 25;

         // Find the number of dimes in the remaining amount
         int numberOfDimes = remainingAmount / 10;
         remainingAmount = remainingAmount % 10;

         // Find the number of nickels in the remaining amount
         int numberOfNickels = remainingAmount / 5;
         remainingAmount = remainingAmount % 5;

         // Find the number of pennies in the remaining amount
         int numberOfPennies = remainingAmount;

         // Display results
        if (numberOfOneDollars != 0 && numberOfOneDollars != 1) {
            System.out.println("Your amount " + amount + " consists of");
            System.out.println(" " + numberOfOneDollars + " dollars");
        }
        else if (numberOfOneDollars == 1){
            System.out.println(" " + numberOfOneDollars + " dollar");
        }
        if (numberOfQuarters != 0 && numberOfQuarters != 1) {
            System.out.println(" " + numberOfQuarters + " quarters");
        }
        else if (numberOfOneDollars == 1) {
            System.out.println(" " + numberOfQuarters + " quarter");
        }
        if (numberOfDimes != 0 && numberOfDimes != 1) {
            System.out.println(" " + numberOfDimes + " dimes");
        }
        else if (numberOfDimes == 1) {
            System.out.println(" " + numberOfDimes + " dime");
        }
        if (numberOfNickels != 0 && numberOfNickels != 1) {
            System.out.println(" " + numberOfNickels + " nickels");
        }
        else if (numberOfNickels == 1) {
            System.out.println(" " + numberOfNickels + " nickel");
        }
        if (numberOfPennies != 0 && numberOfPennies != 1) {
            System.out.println(" " + numberOfPennies + " pennies");
        }
        else if (numberOfPennies == 1) {
            System.out.println(" " + numberOfPennies + " penny");
        }
    }
}
