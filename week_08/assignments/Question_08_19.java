package week_08.assigments;

import java.util.Scanner;

public class Question_08_19 {
    public static void main(String[] args) {

        int [][] matrix = getMatrix();

        if(isConsecutiveFour(matrix)){
            System.out.println("Matrix has consecutive four numbers.");
        }else{
            System.out.println("Matrix has not consecutive four numbers.");
        }
    }
    public static int[][] getMatrix(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter row number: ");
        int rowNum = input.nextInt();
        System.out.print("Enter column number: ");
        int columnNum = input.nextInt();
        int [][] matrix = new int[rowNum][columnNum];

        System.out.println("Fill the matrix: ");
        for(int row = 0; row < matrix.length; row++){
            for(int column = 0; column < matrix[row].length; column++){
                matrix[row][column] = input.nextInt();
            }
        }
        return matrix;
    }
    public static boolean isConsecutiveFour(int[][] values) {
           if(isConsecutiveFourInRows(values) || isConsecutiveFourInColumns(values) || isConsecutiveFourInDiagonals(values)){
               return true;
           }
           return false;
    }
    public static boolean isConsecutiveFourInRows(int [][] matrix){
        for(int row = 0; row < matrix.length; row++){
            for(int column = 0; column < matrix[row].length - 3 ; column++){
                int count = 0;
                for(int i = column + 1; i < column + 4; i++ ){
                    if (matrix[row][column] == matrix[row][i]){
                        count++;
                    }
                }
                if(count == 3){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean isConsecutiveFourInColumns(int [][] matrix){
        for(int column = 0; column < matrix[0].length; column++){
            for(int row = 0; row < matrix.length - 3; row++){
                int count = 0;
                for(int i = row + 1; i < row + 4; i++ ){
                    if (matrix[row][column] == matrix[i][column]){
                        count++;
                    }
                }
                if(count == 3){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean isConsecutiveFourInDiagonals(int [][] matrix){
        for(int row = 3; row < matrix.length; row++) {
            int count = 0;
            for (int i = row, k = 0; 1 <= i ; i--, k++) {
                if(matrix[i][k] == matrix[i - 1][k + 1]){
                   count++;
                   if(count == 3){
                       return true;
                   }
               }else{
                   count = 0;
               }

            }
            count = 0;
            for(int i = (matrix.length - 1) - row, k = matrix[row].length - 1; i < matrix.length - 1; i++ , k--){
               if(matrix[i][k] == matrix[i + 1][k - 1]){
                   count++;
                   if(count == 3){
                       return true;
                   }
               }else{
                   count = 0;
               }
            }
        }
        for(int row = 3; row < matrix.length; row++){
            int count = 0;
            for (int i = (matrix.length - 1) - row, k = 0; i < matrix.length - 1 ; i++, k++) {
                if(matrix[i][k] == matrix[i + 1][k + 1]){
                    count++;
                    if(count == 3){
                        return true;
                    }
                }else{
                    count = 0;
                }

            }
            count = 0;
            for(int i = row , k = matrix[row].length - 1; 1 <= i; i--, k--){
                if(matrix[i][k] == matrix[i - 1][k - 1]){
                    count++;
                    if(count == 3){
                        return true;
                    }
                }else{
                    count = 0;
                }
            }
        }
        return false;
    }
}
