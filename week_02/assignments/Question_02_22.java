package week_02.assigments;

import java.util.Scanner;

public class Question_02_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an amount as integer, for example 1156 for 11.56: ");
        int amount = input.nextInt();
        int dollars = amount / 100;
        int remainingAmount = amount % 100;
        int quarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;
        int dimes = remainingAmount / 10;
        remainingAmount = remainingAmount %10;
        int nickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;
        int pennies = remainingAmount;
        System.out.println("Your amount " + amount + " consists of ");
        System.out.println(dollars + " dollars");
        System.out.println(quarters + " quarters");
        System.out.println(dimes + " dimes");
        System.out.println(nickels + " nickels");
        System.out.println(pennies + " pennies");
    }
}
