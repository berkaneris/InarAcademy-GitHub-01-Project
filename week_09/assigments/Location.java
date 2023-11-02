package week_09.assigments;

import java.util.Scanner;

public class Location {
    public int row;
    public int column;
    public double maxValue;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns in the array: ");
        double [][] matrix = new double[input.nextInt()][input.nextInt()];
        System.out.println("Enter the array:");
        for(int row = 0; row < matrix.length; row++){
            for(int column = 0; column < matrix[row].length; column++){
                matrix[row][column] = input.nextDouble();
            }
        }
        Location location ;
        location = locateLargest(matrix);
        System.out.printf("The location of the largest element is %.1f at (%d, %d)" , location.maxValue , location.row , location.column);
    }
    public static Location locateLargest(double[][] a){
        Location location = new Location();

        location.maxValue = a[0][0];

        for(int row = 0; row < a.length; row++){
            for(int column = 0; column < a[row].length; column++){
                if(location.maxValue < a[row][column]){
                    location.maxValue = a[row][column];
                    location.row = row;
                    location.column = column;
                }
            }
        }
        return location;
    }
}
