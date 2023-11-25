package week_08.assigments;

import java.util.Scanner;

public class Question_08_01 {
    public static void main(String[] args) {

        double [][] matrix = getArray(3,4);

            for(int column = 0; column < matrix[0].length; column++){
                System.out.println("Sum of the elements at column " + column + " is " + sumColumn(matrix , column));
            }

    }
    public static double [][] getArray(int a , int b){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 3-by-4 matrix row by row: ");
        double [][] matrix = new double[a][b];

        for(int row = 0; row < matrix.length; row++){
            for(int column = 0; column < matrix[row].length; column++){
                matrix[row][column] = input.nextDouble();
            }
        }
        return matrix;
    }
    public static double sumColumn(double[][] m, int columnIndex){
        double sumOfColumn = 0;
        for(int row = 0; row < m.length; row++){
            sumOfColumn += m[row][columnIndex];
        }
        return sumOfColumn;
    }
}
