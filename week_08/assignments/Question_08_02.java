package week_08.assigments;

import java.util.Scanner;

public class Question_08_02 {
    public static void main(String[] args) {

        double [][] matrix = getArray(4 ,4);

        System.out.println("Sum of the elements in the major diagonal is " + sumMajorDiagonal(matrix));
    }
    public static double [][] getArray(int a , int b){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 4-by-4 matrix row by row: ");
        double [][] matrix = new double[a][b];

        for(int row = 0; row < matrix.length; row++){
            for(int column = 0; column < matrix[row].length; column++){
                matrix[row][column] = input.nextDouble();
            }
        }
        return matrix;
    }
    public static double sumMajorDiagonal(double[][] m){
      double sumDiagonalOne = 0;
      double sumDiagonalTwo = 0;

      for (int i = 0; i < m.length; i++){
          sumDiagonalOne += m[i][i];
      }
      for (int i = 0 , l = m.length - 1; i < m.length; i++ , l--){
          sumDiagonalTwo += m[i][l];
      }

      return Math.max(sumDiagonalOne , sumDiagonalTwo);
    }
}
