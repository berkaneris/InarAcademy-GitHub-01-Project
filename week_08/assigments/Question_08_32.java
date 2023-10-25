package week_08.assigments;

import java.util.Scanner;

public class Question_08_32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x1, y1, x2, y2, x3, y3: ");
        double [][] points = new double[3][2];

        for(int row = 0; row < points.length; row++){
            for(int column = 0; column < points[row].length; column++){
                points[row][column] = input.nextDouble();
            }
        }
        if(getTriangleArea(points) == 0){
            System.out.println("The three points are on the same line");
        }else{
            System.out.printf("The area of the triangle is %.2f" , getTriangleArea(points));
        }
    }
    public static double getTriangleArea(double[][] points){

            double side1 = Math.pow(Math.pow((points[1][0] - points[0][0]), 2) + Math.pow((points[1][1] - points[0][1]), 2), 0.5);
            double side2 = Math.pow(Math.pow((points[1][0] - points[2][0]), 2) + Math.pow((points[1][1] - points[2][1]), 2), 0.5);
            double side3 = Math.pow(Math.pow((points[0][0] - points[2][0]), 2) + Math.pow((points[0][1] - points[2][1]), 2), 0.5);


            double side = (side1 + side2 + side3) / 2;
            double check = side * (side - side1) * (side - side2) * (side - side3);
            if(check <= 0){
                return 0;
            }
            else {
                return Math.pow(check, 0.5);
            }
    }
}
