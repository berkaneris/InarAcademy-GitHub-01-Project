package week_08.assigments;

import java.util.Scanner;

public class Question_08_13 {
    public static void main(String[] args) {
        // Get the matrix
        double [][] matrix = getMatrix();

        // Find the largest element
        int [] result = locateLargest(matrix);
        System.out.println("The location of the largest element is at (" + result[0] + ", " + result[1] + ")");
    }
    public static double[][] getMatrix(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns of the array: ");
        double [][] matrix = new double[input.nextInt()][input.nextInt()];

        System.out.println("Enter the array: ");

        for(int row = 0; row < matrix.length; row++){
            for(int column = 0; column < matrix[row].length; column++){
                matrix[row][column] = input.nextDouble();
            }
        }
        return matrix;
    }
    public static int[] locateLargest(double[][] a){
         double max = 0;
         int [] index = new int[2];

         for (int row = 0; row < a.length; row++){
             for(int column = 0; column < a[row].length; column++){
                 if (a[row][column] > max) {
                     max = a[row][column];
                     index[0] = row;
                     index[1] = column;
                 }
             }
         }
         return index;
    }
}
