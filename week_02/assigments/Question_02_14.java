package week_02.assigments;

import java.util.Scanner;

public class Question_02_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double pounds = input.nextDouble();
        System.out.print("Enter height in inches: ");
        double inches = input.nextDouble();
        double bmı = (pounds * 0.45359237) / (Math.pow(inches * 0.0254, 2));
        System.out.println("BMI is " + bmı);
    }
}
