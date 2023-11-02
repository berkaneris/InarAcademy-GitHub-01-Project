package week_09.assigments;

import java.util.Scanner;

public class Question_09_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        double[][] points = new double[4][2];

        for (int row = 0; row < points.length; row++) {
            for (int column = 0; column < points[row].length; column++) {
                points[row][column] = input.nextDouble();
            }
        }

        double a = points[0][1] - points[1][1];
        double b = -(points[0][0] - points[1][0]);
        double c = points[2][1] - points[3][1];
        double d = -(points[2][0] - points[3][0]);
        double e = (a * points[0][0]) + (b * points[0][1]);
        double f = (c * points[2][0]) + (d * points[2][1]);

        LinearEquation linearEquation = new LinearEquation(a, b, c, d, e, f);

        if(linearEquation.isSolvable()){
            System.out.printf("The intersecting point is at (%f , %f)" , linearEquation.getX() , linearEquation.getY());
        }else{
            System.out.println("The two lines are parallel");
        }


    }
}
