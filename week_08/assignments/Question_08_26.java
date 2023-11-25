package week_08.assigments;

import java.util.Arrays;
import java.util.Scanner;

public class Question_08_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 3-by-3 matrix row by row:");
        double [][] matrix = new double[3][3];
        for(int row = 0; row < matrix.length; row++){
            for(int column = 0; column < matrix[row].length; column++){
                matrix[row][column] = input.nextDouble();
            }
        }
        double [][] sortedRowsMatrix = sortRows(matrix);
        System.out.println("The row-sorted array is");

        for(int row = 0; row < sortedRowsMatrix.length; row++){
            for(int column = 0; column < sortedRowsMatrix[row].length; column++){
                System.out.print(sortedRowsMatrix[row][column] + " ");
            }
            System.out.println();
        }
    }
    public static double[][] sortRows(double[][] m){
        double [][] sortRows = new double[3][3];
        for(int row = 0; row < m.length; row++){
            for(int column = 0; column < m[row].length; column++){
                sortRows[row][column] = m[row][column];
            }
        }
        for(int row = 0; row < sortRows.length; row++){
            Arrays.sort(sortRows[row]);
        }
        return sortRows;
    }
}
