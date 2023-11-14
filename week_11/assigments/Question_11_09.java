package week_11.assigments;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_09 {
    public static void main(String[] args) {
        int[][] matrix = getMatrix();
        printMatrix(matrix);

        ArrayList<Integer> largestRows = getLargestRows(matrix);
        ArrayList<Integer> largestColumns = getLargestColumns(matrix);

        System.out.print("The largest row index: ");
        printArrayList(largestRows);
        System.out.print("\nThe largest column index: ");
        printArrayList(largestColumns);



    }

    public static int[][] getMatrix() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the array size n: ");
        int n = input.nextInt();
        int[][] matrix = new int[n][n];

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = (int) (Math.random() * 2);
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        System.out.println("The random array is");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
    }

    public static ArrayList<Integer> getLargestRows(int[][] matrix) {
        ArrayList<Integer> largestRows = new ArrayList<>();
        int maxNumberOfOneInRows = 0;

        for (int row = 0; row < matrix.length; row++) {
            int count = 0;
            for (int column = 0; column < matrix[row].length; column++) {
                if (matrix[row][column] == 1) {
                    count++;
                }
            }
            if(count > maxNumberOfOneInRows){
                maxNumberOfOneInRows = count;
                largestRows.clear();
                largestRows.add(row);
            } else if (count == maxNumberOfOneInRows) {
                largestRows.add(row);
            }
        }
        return largestRows;
    }
    private static ArrayList<Integer> getLargestColumns(int[][] matrix) {
        ArrayList<Integer> largestColumns = new ArrayList<>();
        int maxNumberOfOneInColumns = 0;

        for (int column = 0; column < matrix[0].length; column++) {
            int count = 0;
            for (int row = 0; row < matrix.length; row++) {
                if (matrix[row][column] == 1) {
                    count++;
                }
            }
            if(count > maxNumberOfOneInColumns){
                maxNumberOfOneInColumns = count;
                largestColumns.clear();
                largestColumns.add(column);
            } else if (count == maxNumberOfOneInColumns) {
                largestColumns.add(column);
            }
        }
        return largestColumns;
    }
    public static void printArrayList(ArrayList<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            if(i == list.size() - 1){
                System.out.print(list.get(i));
            }else{
                System.out.print(list.get(i) + ", ");
            }
        }
    }
}
