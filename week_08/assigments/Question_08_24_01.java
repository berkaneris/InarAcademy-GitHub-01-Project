package week_08.assigments;

import java.util.Scanner;

public class Question_08_24_01 {
    public static void main(String[] args) {
// Read a Sudoku solution
        int[][] grid = readASolution();

        System.out.println(isValid(grid) ? "Valid solution" :
                "Invalid solution");
    }

    /**
     * Read a Sudoku solution from the console
     */
    public static int[][] readASolution() {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a Sudoku puzzle solution:");
        int[][] grid = new int[9][9];
        for (int i = 0; i < 9; i++)
            for (int j = 0; j < 9; j++)
                grid[i][j] = input.nextInt();

        return grid;
    }

    /**
     * Check whether a solution is valid
     */


    public static boolean isValid(int[][] grid) {
        return isValidRows(grid) && isValidColumns(grid) && isValidSmallBoxes(grid);
    }

    public static boolean isValidSmallBoxes(int[][] grid) {
        for(int i = 0; i < grid.length; i+=3) {
            for (int j = 0; j < grid[i].length; j += 3) {
                int [] checkList = new int[9];
                for (int row = (i / 3) * 3; row < (i / 3) * 3 + 3; row++) {
                    for (int col = (j / 3) * 3; col < (j / 3) * 3 + 3; col++) {
                        if(grid[row][col] >= 1 && grid[row][col] <= 9){
                            checkList[grid[row][col] - 1]++;
                        }
                    }
                }
                for(int k = 0; k < checkList.length; k++){
                    if(checkList[k] != 1){
                        return false;
                    }
                }
            }
        }
        return true; // The current value at grid[i][j] is valid

    }

    public static boolean isValidColumns(int[][] grid) {
        for(int column = 0; column < grid[0].length; column++){
            int [] checkList = new int[9];
            for(int row = 0; row < grid.length; row++){
                if(grid[row][column] >= 1 && grid[row][column] <= 9){
                    checkList[grid[row][column] - 1]++;
                }
            }
            for(int i = 0; i < checkList.length; i++){
                if(checkList[i] != 1){
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isValidRows(int[][] grid) {
        for(int row = 0; row < grid.length; row++){
            int [] checkList = new int[9];
            for(int column = 0; column < grid[row].length; column++){
                if(grid[row][column] >= 1 && grid[row][column] <= 9){
                    checkList[grid[row][column] - 1]++;
                }
            }
            for(int i = 0; i < checkList.length; i++){
                if(checkList[i] != 1){
                    return false;
                }
            }
        }
        return true;
    }
}