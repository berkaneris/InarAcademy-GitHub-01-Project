package week_08.assigments;

import java.util.Scanner;

public class Question_08_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter five points: ");
        double [][] points = new double[5][2];

        for(int row = 0; row < points.length; row++){
            for(int column = 0; column < points[row].length; column++){
                points[row][column] = input.nextDouble();
            }
        }

        if(sameLine(points)){
            System.out.println("The five points are on the same line");
        }else{
            System.out.println("The five points are not on the same line");
        }

    }
    public static boolean sameLine(double[][] points){
       for (int i = 2; i < points.length; i++){
           double check = (points[1][0] - points[0][0]) * (points[i][1] - points[0][1]) -
                          (points[i][0] - points[0][0]) * (points[1][1] - points[0][1]);
           if (check != 0){
               return false;
           }
       }
       return true;
    }
}
