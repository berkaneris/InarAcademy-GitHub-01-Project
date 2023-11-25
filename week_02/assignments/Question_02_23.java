package week_02.assigments;

import java.util.Scanner;

public class Question_02_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the driving distance: ");
        double distance = input.nextDouble();
        System.out.print("Enter miles per gallon: ");
        double miles = input.nextDouble(); // miles per gallon
        System.out.print("Enter price per gallon: ");
        double price = input.nextDouble(); // price per gallon
        double cost = (distance / miles) * price;
        System.out.print("The cost of driving is $");
        System.out.format("%.2f", cost);
    }
}
