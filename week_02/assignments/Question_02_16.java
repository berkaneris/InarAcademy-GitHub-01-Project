package week_02.assigments;

import java.util.Scanner;

public class Question_02_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side: ");
        double side = input.nextDouble();
        double area = Math.pow(side, 2) * 3 * Math.pow(3, 0.5) / 2.0 ;
        System.out.println("The area of the hexagon is " + area);

    }
}
