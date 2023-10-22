package week_08.assigments;

import java.util.Scanner;

public class Question_08_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 6-by-6 matrix row by row:");
        int [][] matrix = new int[6][6];

        for(int row = 0; row < matrix.length; row++){
            for(int column = 0; column < matrix[row].length; column++){
                matrix[row][column] = input.nextInt();
            }
        }

        System.out.println("The flipped cell is at (" + getIndexOfFlippedCellRow(matrix) + ", "
                + getIndexOfFlippedColumn(matrix) + ")");
    }
    public static int getIndexOfFlippedCellRow(int [][] matrix){
       int indexRow = 0;
        for(int row = 0; row < matrix.length; row++){
            int count = 0;
            for(int column = 0; column < matrix[row].length; column++){
                if(matrix[row][column] == 1){
                    count++;
                }
            }
            if(count % 2 != 0){
                indexRow = row;
            }
        }
        return indexRow;
    }
    public static int getIndexOfFlippedColumn(int [][] matrix){
        int indexColumn = 0;
        for(int column = 0; column < matrix[0].length; column++){
            int count = 0;
            for(int row = 0; row < matrix.length; row++){
                if(matrix[row][column] == 1){
                    count++;
                }
            }
            if(count % 2 != 0 ){
                indexColumn = column;
            }
        }
        return indexColumn;
    }
}
