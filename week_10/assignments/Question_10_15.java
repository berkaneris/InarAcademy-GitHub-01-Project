package week_10.assigments;

import java.util.Scanner;

public class Question_10_15 {
    public static void main(String[] args) {
        System.out.print("Enter five points: ");
        double [][] points = getPoints(5);

        MyRectangle2D boundingRectangle = getRectangle(points);

        System.out.printf("The bounding rectangle's center (%.1f, %.2f), width %.1f, height %.1f" , boundingRectangle.getX() , boundingRectangle.getY(),
                boundingRectangle.getWidth() , boundingRectangle.getHeight());

    }
    public static double [][] getPoints(int length){
        Scanner input = new Scanner(System.in);
        double [][] points = new double[length][2];

        for(int row = 0; row < points.length; row++){
            for(int column = 0; column < points[row].length; column++){
                points[row][column] = input.nextDouble();
            }
        }
        return points;
    }
    public static MyRectangle2D getRectangle(double[][] points){
         double [] edgePoints = new double[4];
         int i = 0;
         for(int column = 0; column < points[0].length;column++){
             double min = points[0][column];
             double max = points[0][column];
             for(int row = 1; row < points.length; row++){
                 if(max < points[row][column]){
                     max = points[row][column];
                 }else if(min > points[row][column]){
                     min = points[row][column];
                 }
             }
             edgePoints[i++] = min;
             edgePoints[i++] = max;
         }

         return new MyRectangle2D((edgePoints[0] + edgePoints[1]) / 2 , (edgePoints[2] + edgePoints[3]) / 2 ,
                 edgePoints[1] - edgePoints[0] , edgePoints[3] - edgePoints[2]);

    }


}
