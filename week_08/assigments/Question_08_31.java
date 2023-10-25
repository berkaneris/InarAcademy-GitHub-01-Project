package week_08.assigments;

import java.util.Scanner;

public class Question_08_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        double[][] points = new double[4][2];

        for (int row = 0; row < points.length; row++) {
            for (int column = 0; column < points[row].length; column++) {
                points[row][column] = input.nextDouble();
            }
        }
        double [] intersectingPoint = getIntersectingPoint(points);

        if(intersectingPoint[2] == -1){
            System.out.println("The two lines are parallel");
        }else{
            System.out.printf("The intersecting point is at (%.5f , %.5f)" , intersectingPoint[0] , intersectingPoint[1] );
        }
    }

    public static double[] getIntersectingPoint(double[][] points) {
        double [] intersectingPoint = new double[3];

        double a =  points[0][1] - points[1][1];
        double b =  points[1][0] - points[0][0];                                                                          //(-x1 + x2);
        double c = points[2][1] - points[3][1];
        double d = points[3][0] - points[2][0];
        double e = a * points[0][0] + b * points[0][1];
        double f = c * points[2][0] + d * points[2][1];
        if (((a * d) - (b * c)) == 0) {
           intersectingPoint[2] = -1;
           return intersectingPoint;
        } else {
           intersectingPoint[0] = ((e * d) - (b * f)) / ((a * d) - (b * c));
           intersectingPoint[1] = ((a * f) - (e * c)) / ((a * d) - (b * c));
            return intersectingPoint;
        }
    }
}
