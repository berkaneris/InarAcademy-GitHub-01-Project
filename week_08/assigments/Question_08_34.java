package week_08.assigments;

import java.util.Scanner;

public class Question_08_34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 6 points: ");
        double [][] points = new double[6][2];

        for(int row = 0; row < points.length; row++){
            for(int column = 0; column < points[row].length; column++){
                points[row][column] = input.nextDouble();
            }
        }
        double [] rightmostLowestPoint = getRightmostLowestPoint(points);

        System.out.printf("The rightmost lowest point is (%.1f, %.1f)" , rightmostLowestPoint[0] , rightmostLowestPoint[1]);
    }
    public static double[] getRightmostLowestPoint(double[][] points){
        double [] result = new double[2];
        result[0] = points[0][0];
        result[1] = points[0][1];
        for(int row = 1; row < points.length; row++){
            if(result[1] > points[row][1]){
                result[1] = points[row][1];
                result[0] = points[row][0];
            }else if(result[1] == points[row][1] && result[0] < points[row][0]){
                result[0] = points[row][0];
            }
        }
        return result;
    }
}
