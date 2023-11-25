package week_08.assigments;

import java.util.Scanner;

public class Question_08_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 3-by-3 matrix row by row:");
        double [][] matrix = new double[3][3];
        for(int row = 0; row < matrix.length; row++){
            for(int column = 0; column < matrix[row].length; column++){
                matrix[row][column] = input.nextDouble();
            }
        }
        if(isMarkovMatrix(matrix)){
            System.out.println("It is a Markov matrix");
        }
        else{
            System.out.println("It is not a Markov matrix");
        }
    }
    public static boolean isMarkovMatrix(double[][] m){
          return isElementsPositive(m) && isColumnSumEqualsOne(m);
    }
    public static boolean isElementsPositive(double[][] matrix){
        for(int row = 0; row < matrix.length; row++){
            for(int column = 0; column < matrix[row].length; column++){
                if(matrix[row][column] < 0){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean isColumnSumEqualsOne(double[][] matrix){

        for(int column = 0; column < matrix[0].length; column++){
            double sum = 0;
            for(int row = 0; row < matrix.length; row++){
               sum += matrix[row][column];
            }
            if(sum != 1){
                return false;
            }
        }
        return true;
    }
}
