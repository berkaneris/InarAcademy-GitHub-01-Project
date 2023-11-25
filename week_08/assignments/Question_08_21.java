package week_08.assigments;

import java.util.Scanner;

public class Question_08_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of cities: ");
        int numberOfCities = input.nextInt();
        double [][] coordinates = new double[numberOfCities][2];
        System.out.println("Enter the coordinates of the cities: ");
        for(int row = 0; row < coordinates.length; row++){
            for(int column = 0; column < coordinates[row].length; column++){
                coordinates[row][column] = input.nextDouble();
            }
        }

        double [] totalDistances = new double[numberOfCities];

        for(int i = 0; i < numberOfCities; i++){
            for(int k = 0; k < numberOfCities; k++){
                if(i == k){
                    continue;
                }
                totalDistances[i] += Math.sqrt(Math.pow(coordinates[i][0] - coordinates[k][0] , 2) + Math.pow(coordinates[i][1] - coordinates[k][1] , 2));
            }
        }
        double minDistance = totalDistances[0];
        int minIndex = 0;
        for(int i = 1; i < totalDistances.length; i++){
            if (minDistance > totalDistances[i]){
                minIndex = i;
                minDistance = totalDistances[i];
            }
        }

        System.out.println("The central city is at (" + coordinates[minIndex][0] + ", " + coordinates[minIndex][1] + ")");
        System.out.printf("The total distance to all other cities is %.2f" , minDistance);
    }
}
