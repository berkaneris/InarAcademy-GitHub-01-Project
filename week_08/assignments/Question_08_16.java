package week_08.assigments;

import java.util.Scanner;

public class Question_08_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an array length rows and columns in order: ");
        int [][] matrix = new int[input.nextInt()][input.nextInt()];
        System.out.println("Enter the array: ");

        for(int row = 0; row < matrix.length; row++){
            for(int column = 0; column < matrix[row].length; column++){
                matrix[row][column] = input.nextInt();
            }
        }
        sort(matrix);
    }
    public static void sort(int [][] m){

        for (int i = 0; i < m.length - 1; i++) {
            // Find the minimum in the list[i...list.length-1]
            int currentMinX = m[i][0];
            int currentMinY = m[i][1];
            int currentMinIndex = i;

            for (int j = i + 1; j < m.length; j++) {
                if (currentMinX > m[j][0]) {
                    currentMinX = m[j][0];
                    currentMinY = m[j][1];
                    currentMinIndex = j;
                }else if(currentMinX == m[j][0]){
                    if(currentMinY > m[j][1]){
                        currentMinY = m[j][1];
                        currentMinIndex = j;
                    }
                }
            }

            // Swap list[i] with list[currentMinIndex] if necessary
            if (currentMinIndex != i) {
                m[currentMinIndex][0] = m[i][0];
                m[currentMinIndex][1] = m[i][1];
                m[i][0] = currentMinX;
                m[i][1] = currentMinY;
            }
        }
        for(int row = 0; row < m.length; row++){

            System.out.print("{" + m[row][0] + ", " + m[row][1] + "} ");

        }

    }
}
