package week_12.assigments.Question_12_05;

import java.util.Scanner;

public class Question_12_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three sides of a triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        try{
            Triangle triangle = new Triangle(side1 , side2 , side3);
            System.out.println(triangle);
            System.out.println("Perimeter of triangle is " + triangle.getPerimeter());
            System.out.println("Area of the triangle is " + triangle.getArea());

        }catch (IllegalTriangleException ex){
            ex.printStackTrace();
        }
    }
}
