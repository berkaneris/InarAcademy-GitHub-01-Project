package week_06.assigments;

import java.util.Scanner;

public class Question_06_35 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        System.out.print("Enter the side: ");
        double side = input.nextDouble();
        System.out.println("The area of the pentagon is " + area(side));
    }
    public static double area(double side){
        double area = (5 * Math.pow(side , 2)) / (4 * Math.tan(Math.PI / 5));
        return area;
    }
}
