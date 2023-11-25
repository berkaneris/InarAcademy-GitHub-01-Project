package week_08.assigments;

import java.util.Scanner;

public class Question_08_05 {
    public static void main(String[] args) {
        System.out.print("Enter matrix1: ");
        double [][] matrixOne = getMatrix();


        System.out.print("Enter matrix2: ");
        double [][] matrixTwo = getMatrix();

        double [][] addedMatrix = addMatrix(matrixOne , matrixTwo);
        printMatrixSummation(matrixOne , matrixTwo , addedMatrix);
    }
    public static double[][] getMatrix(){
        Scanner input = new Scanner(System.in);
        double [][] matrix = new double[3][3];
        for(int row = 0 ; row < matrix.length; row++){
            for (int column = 0; column < matrix[row].length; column++){
                matrix[row][column] = input.nextDouble();
            }
        }
        return matrix;
    }
    public static double[][] addMatrix(double[][] a, double[][] b){
        double [][] addedMatrix = new double[3][3];

        for(int row = 0 ; row < addedMatrix.length; row++){
            for (int column = 0; column < addedMatrix[row].length; column++){
                addedMatrix[row][column] = a[row][column] + b[row][column];
            }
        }
        return addedMatrix;

    }
    public static void printMatrixSummation(double [][] matrix1 , double [][] matrix2 , double [][] matrix3){
        System.out.println("The matrices are added as follows");

        for(int row = 0 ; row < matrix1.length; row++){
            for (int column = 0; column < matrix1[row].length; column++){
                System.out.print(matrix1[row][column] + " ");
            }
            if (row != 1) {
                System.out.print("         ");
            }else{
                System.out.print("    +    ");
            }
            for (int column = 0; column < matrix2[row].length; column++){
                System.out.print(matrix2[row][column] + " ");
            }
            if (row != 1) {
                System.out.print("         ");
            }else{
                System.out.print("    =    ");
            }
            for (int column = 0; column < matrix3[row].length; column++){
                System.out.print(matrix3[row][column] + " ");
            }
            System.out.println();
        }
    }

}
