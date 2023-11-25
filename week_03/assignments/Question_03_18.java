package week_03.assigments;

import java.util.Scanner;

public class Question_03_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your package weight in pounds: ");
        double weight = input.nextDouble();

        if (weight > 0 && weight <= 1){
            System.out.println("The shipping cost is " + 3.5 + "$");
        }
        else if (weight > 1 && weight <= 3){
            double cost = 1 * 3.5 + (weight -1) * 5.5;
            System.out.println("The shipping cost is " + cost + "$");
        }
        else if (weight > 3 && weight <= 10){
            double cost = 1 * 3.5 +(3-1) * 5.5 + (weight - 3 ) * 8.5;
            System.out.println("The shipping cost is " + cost + "$");
        }
        else if (weight > 10 && weight <= 20){
            double cost = 1 * 3.5 +(3-1) * 5.5 + (10 - 3 ) * 8.5 + (weight - 10) * 10.5;
            System.out.println("The shipping cost is " + cost + "$");
        }
        else if (weight > 50 ) {
            System.out.println("The package cannot be shipped.");
        }
    }
}
