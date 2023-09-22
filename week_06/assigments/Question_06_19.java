package week_06.assigments;

import java.util.Scanner;

public class Question_06_19 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.print("Enter three side for a triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        if(isValid(side1 , side2 , side3)){
            System.out.println("The area of the triangle is " + area(side1 , side2 , side3));
        }
        else{
            System.out.println("The input is invalid.");
        }
    }
    public static boolean isValid(
            double side1, double side2, double side3){
        if ((side1 + side2 > side3) && (side2 + side3 > side1) && (side3 + side1 > side2)){
            return true;
        }else{
            return false;
        }
    }
    public static double area(
            double side1, double side2, double side3){
        double side = (side1 + side2 + side3) / 2;
        return Math.pow(side * (side - side1) * (side - side2) * (side - side3), 0.5);
    }

}
