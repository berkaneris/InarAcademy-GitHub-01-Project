package week_08.assigments;

import java.util.Scanner;

public class Question_08_14 {
    public static void main(String[] args) {

        int [][] matrix = getMatrix();

        printMatrix(matrix);

        findSameNumbersInRow(matrix);
        findSameNumbersInColumn(matrix);
        findSameNumbersInMajorDiagonal(matrix);
        findSameNumbersInSubDiagonal(matrix);
    }
    public static int[][] getMatrix(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size for the matrix: ");
        int size = input.nextInt();
        int [][] matrix = new int[size][size];

        for(int row = 0; row < matrix.length; row++){
            for(int column = 0; column < matrix[row].length; column++){
                matrix[row][column] = (int)(Math.random() * 2);
            }
        }
        return matrix;
    }
    public static void printMatrix(int [][] matrix){
        for(int row = 0; row < matrix.length; row++){
            for(int column = 0; column < matrix[row].length; column++){
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
    }
    public static void findSameNumbersInRow (int [][] matrix){
        boolean isSame ;
        int count = 0;
        for(int row = 0; row < matrix.length; row++){
            int num = matrix[row][0];
            isSame = true;
            for(int column = 0; column < matrix[row].length; column++){
                if(num != matrix[row][column]){
                    isSame = false;
                    break;
                }
            }
            if(isSame){
                System.out.println("All " + num + "s on row " + row);
                count++;
            }
        }
        if (count == 0){
            System.out.println("No same numbers on a row");
        }
    }
    public static void findSameNumbersInColumn (int [][] matrix){
        boolean isSame ;
        int count = 0;
        for(int column = 0; column < matrix[0].length; column++){
            int num = matrix[0][column];
            isSame = true;
            for(int row = 0; row < matrix.length; row++){
                if(num != matrix[row][column]){
                    isSame = false;
                    break;
                }
            }
            if(isSame){
                System.out.println("All " + num + "s on column " + column);
                count++;
            }
        }
        if (count == 0){
            System.out.println("No same numbers on a column");
        }
    }
    public static void findSameNumbersInMajorDiagonal (int [][] matrix){
        int number = matrix[0][0];
        boolean isSame = true;
        for(int i = 0, k = 0; i < matrix.length; i++ , k++){
            if(number != matrix[i][k]){
                isSame = false;
                break;
            }
        }
        if(isSame){
            System.out.println("All " + number + "s on major diagonal");
        }else{
            System.out.println("No same numbers on the major diagonal");
        }
    }

    public static void findSameNumbersInSubDiagonal (int [][] matrix){
       int number = matrix[0][0];
       boolean isSame = true;
        for(int i = 1, k = 0; i < matrix.length; i++ , k++){
            if(number != matrix[i][k]){
                isSame = false;
                break;
            }
        }
        if(isSame){
            System.out.println("All " + number + "s on sub-diagonal");
        }else{
            System.out.println("No same numbers on the sub-diagonal");
        }
    }
}
