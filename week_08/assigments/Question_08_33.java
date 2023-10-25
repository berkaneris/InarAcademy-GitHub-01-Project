package week_08.assigments;

import java.util.Arrays;
import java.util.Scanner;

public class Question_08_33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        double [][] points = new double[4][2];
        System.out.print("  ");

        for(int row = 0; row < points.length; row++){
            for(int column = 0; column < points[row].length; column++){
                points[row][column] = input.nextDouble();
            }
        }
        double [] intersectingPoint = getIntersectingPoint(points);

        double [] areas = new double[4];
        areas[0] = getTriangleArea(points[0][0] , points[0][1] , points[1][0] , points[1][1], intersectingPoint[0] , intersectingPoint [1]);
        areas[1] = getTriangleArea(points[1][0] , points[1][1] , points[2][0] , points[2][1], intersectingPoint[0] , intersectingPoint [1]);
        areas[2] = getTriangleArea(points[2][0] , points[2][1] , points[3][0] , points[3][1], intersectingPoint[0] , intersectingPoint [1]);
        areas[3] = getTriangleArea(points[3][0] , points[3][1] , points[0][0] , points[0][1], intersectingPoint[0] , intersectingPoint [1]);

        Arrays.sort(areas);

        System.out.print("The areas are ");
        for(int i = 0; i < areas.length; i++){
            System.out.printf( "%.2f%s" , areas[i] , " ");
        }
    }
    public static double[] getIntersectingPoint(double[][] points) {
        double [] intersectingPoint = new double[3];

        double a =  points[0][1] - points[2][1];
        double b =  points[2][0] - points[0][0];                                                                          //(-x1 + x2);
        double c = points[1][1] - points[3][1];
        double d = points[3][0] - points[1][0];
        double e = a * points[0][0] + b * points[0][1];
        double f = c * points[1][0] + d * points[1][1];
        if (((a * d) - (b * c)) == 0) {
            intersectingPoint[2] = -1;
            return intersectingPoint;
        } else {
            intersectingPoint[0] = ((e * d) - (b * f)) / ((a * d) - (b * c));
            intersectingPoint[1] = ((a * f) - (e * c)) / ((a * d) - (b * c));
            return intersectingPoint;
        }
    }
    public static double getTriangleArea(double x1 , double y1 , double x2 , double y2 , double x3 , double y3){

        double side1 = Math.pow(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2), 0.5);
        double side2 = Math.pow(Math.pow((x2 - x3), 2) + Math.pow((y2 - y3), 2), 0.5);
        double side3 = Math.pow(Math.pow((x1 - x3), 2) + Math.pow((y1 - y3), 2), 0.5);


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
