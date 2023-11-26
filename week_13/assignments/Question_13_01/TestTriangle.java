package week_13.assignments.Question_13_01;

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three side of the triangle :");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        input.nextLine();
        System.out.println("Enter the color : ");
        String color = input.nextLine();
        System.out.println("Enter : isFilled ? true or false :");
        boolean isFilled = Boolean.parseBoolean(input.next());


        Triangle triangle = new Triangle(side1 , side2, side3, color , isFilled);
        System.out.println(triangle);

    }
}
