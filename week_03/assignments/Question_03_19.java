package week_03.assigments;

import java.util.Scanner;

public class Question_03_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three value for edges of a triangle: ");
        double edge1 = input.nextDouble();
        double edge2 = input.nextDouble();
        double edge3 = input.nextDouble();

        if (edge1 + edge2 > edge3 && edge1 + edge3 > edge2 && edge2 + edge3 > edge1){
            double perimeterOfTriangle = edge1 + edge2 + edge3;
            System.out.println("The perimeter of the triangle is " + perimeterOfTriangle);
        }
        else{
            System.out.println("The input is invalid.");
        }
    }
}
