package week_08.assigments;

import java.util.Scanner;

public class Question_08_27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 3-by-3 matrix row by row:");
        double [][] matrix = new double[3][3];

        for(int row = 0; row < matrix.length; row++){
            for(int column = 0; column < matrix[row].length; column++){
                matrix[row][column] = input.nextDouble();
            }
        }

        double [][] sortedColumnsMatrix = sortColumns(matrix);
        System.out.println("The column-sorted array is");
        for(int row = 0; row < sortedColumnsMatrix.length; row++){
            for(int column = 0; column < sortedColumnsMatrix[row].length; column++){
                System.out.print(sortedColumnsMatrix[row][column] + " ");
            }
            System.out.println();
        }
    }
    public static double[][] sortColumns(double[][] m){
          double [][] sortedColumns = new double[3][3];
        for(int row = 0; row < m.length; row++){
            for(int column = 0; column < m[row].length; column++){
                sortedColumns[row][column] = m[row][column];
            }
        }
        for(int column = 0; column < sortedColumns[0].length; column++){
            for(int row = 0; row < sortedColumns.length - 1; row++){
                double minNumber = sortedColumns[row][column];
                int minIndex = row;

                for(int i = row + 1; i < sortedColumns.length; i++){
                    if(minNumber > sortedColumns[i][column]){
                        minNumber = sortedColumns[i][column];
                        minIndex = i;
                    }
                }

                if(minIndex != row){
                    sortedColumns[minIndex][column] = sortedColumns[row][column];
                    sortedColumns[row][column] = minNumber;
                }
            }
        }

        return sortedColumns;


    }

}
