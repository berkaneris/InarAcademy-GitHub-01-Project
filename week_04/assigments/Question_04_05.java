package week_04.assigments;

import java.util.Scanner;

public class Question_04_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of sides: ");
        double numberOfSide = input.nextDouble();
        System.out.print("Enter the side: ");
        double lengthOfSide = input.nextDouble();

        double area = (numberOfSide * Math.pow(lengthOfSide, 2)) / (4 * Math.tan(Math.PI / numberOfSide));

        System.out.println("The area of the polygon is " + area);
    }
}
