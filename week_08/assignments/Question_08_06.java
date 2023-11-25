package week_08.assigments;

import java.util.Scanner;

public class Question_08_06 {
    public static void main(String[] args) {
        System.out.print("Enter matrix1: ");
        double [][] matrixOne = getMatrix();
        System.out.print("Enter matrix2: ");
        double [][] matrixTwo = getMatrix();

//        if ( matrixOne[0].length != matrixTwo.length){
//            System.out.println("The matrices cannot be multiplied. ");
//            System.exit(1);
//        }
        double [][] multiplyMatrix = multiplyMatrix(matrixOne , matrixTwo);
        printMultipliedMatrix(matrixOne , matrixTwo , multiplyMatrix);
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
    public static double[][] multiplyMatrix(double[][] a, double[][] b){
        double [][] resultMatrix = new double[a.length][b[0].length];

        for (int row = 0; row < resultMatrix.length; row++){
            for(int column = 0; column < resultMatrix[row].length; column++){
                for (int i = 0; i < b.length; i++){
                    resultMatrix[row][column] += (a[row][i] * b[i][column]);
                }
            }
        }
        return resultMatrix;
    }

    public static void printMultipliedMatrix(double [][] matrix1 , double [][] matrix2 , double [][] matrix3){
        System.out.println("The multiplication of the matrices is");

        for(int row = 0 ; row < matrix1.length; row++){
            for (int column = 0; column < matrix1[row].length; column++){
                System.out.printf("%.0f%s" , matrix1[row][column] , " ");
            }
            if (row != 1) {
                System.out.print("         ");
            }else{
                System.out.print("    *    ");
            }
            for (int column = 0; column < matrix2[row].length; column++){
                System.out.printf("%.1f%s" , matrix2[row][column] , " ");
            }
            if (row != 1) {
                System.out.print("         ");
            }else{
                System.out.print("    =    ");
            }
            for (int column = 0; column < matrix3[row].length; column++){
                System.out.printf("%.1f%s" , matrix3[row][column] , " ");
            }
            System.out.println();
        }
    }

}
