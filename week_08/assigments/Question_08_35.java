package week_08.assigments;

import java.util.Scanner;

public class Question_08_35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows in the matrix: ");
        int number = input.nextInt();
        int [][] matrix = new int[number][number];
        System.out.println("Enter the matrix row by row:");

        for(int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = input.nextInt();
            }
        }
        int [] largestBlock = findLargestBlock(matrix);

        System.out.printf("The maximum square sub-matrix is at (%d, %d) with size %d" , largestBlock[0] , largestBlock[1] , largestBlock[2]);

    }
    public static int[] findLargestBlock(int[][] m){
        int [] result = new int[3];
        int size = m.length;

        while(size > 1){
            for (int row = 0; row < m.length; row++){
                for(int column = 0; column < m[row].length; column++){
                    if(row + size <= m.length && column + size <= m.length){
                        boolean control = true;
                      for(int i = row; i < row + size; i++){
                          for(int k = column; k < column + size; k++){
                              if(m[i][k] != 1){
                                  control = false;
                                  break;
                              }
                          }
                      }
                      if(control){
                          result[0] = row;
                          result[1] = column;
                          result[2] = size;
                          return result;
                      }


                    }


                }
            }
            size--;
        }
        return result;
    }
}
