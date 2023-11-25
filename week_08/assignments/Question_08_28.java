package week_08.assigments;

import java.util.Arrays;
import java.util.Scanner;

public class Question_08_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two 3-by-3 matrices of integers:");
        int [][] matrix1 = new int[3][3];
        int [][] matrix2 = new int[3][3];

        System.out.print("Enter list1: ");
        for (int row = 0; row < matrix1.length; row++){
            for(int column = 0; column < matrix1[row].length; column++){
                matrix1[row][column] = input.nextInt();
            }
        }
        System.out.print("Enter list2: ");
        for (int row = 0; row < matrix2.length; row++){
            for(int column = 0; column < matrix2[row].length; column++){
                matrix2[row][column] = input.nextInt();
            }
        }

        System.out.println("The two arrays are " + (equals(matrix1 , matrix2) ? "strictly identical" : "not strictly identical"));
    }
    public static boolean equals(int[][] m1, int[][] m2){
       return Arrays.deepEquals(m1 , m2);

    }
}
