package week_08.assigments;

import java.util.Scanner;

public class Question_08_29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two 3-by-3 matrices of integers");
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

        System.out.println("The two arrays are " + (equals(matrix1 , matrix2) ? "identical" : "not identical"));
    }
    public static boolean equals(int[][] m1, int[][] m2){
        for (int row = 0; row < m1.length; row++){
            for(int column = 0; column < m1[row].length; column++){
                boolean isInArray = false;

                for (int i = 0; i < m2.length; i++){
                    for(int k = 0; k < m2[i].length; k++){
                       if(m1[row][column] == m2[i][k]){
                           isInArray = true;
                           break;
                       }
                    }
                }
                if(!isInArray){
                    return false;
                }
            }
        }
        for (int row = 0; row < m2.length; row++){
            for(int column = 0; column < m2[row].length; column++){
                boolean isInArray = false;

                for (int i = 0; i < m1.length; i++){
                    for(int k = 0; k < m1[i].length; k++){
                        if(m2[row][column] == m1[i][k]){
                            isInArray = true;
                            break;
                        }
                    }
                }
                if(!isInArray){
                    return false;
                }
            }
        }
        return true;
    }
}
