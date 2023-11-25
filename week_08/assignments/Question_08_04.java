package week_08.assigments;

import java.util.Scanner;

public class Question_08_04 {
    public static void main(String[] args) {

        int [][] hoursMatrix = getInput();
        int [] sumOfHours = getSum(hoursMatrix);
        String [] names = new String[sumOfHours.length];

        System.out.println("Employees and their total hours in decreasing order of the total hours:\n");

        for(int i = 0; i < names.length; i++){
            names[i] = "Employee " + i;
        }
        printSortedList(sumOfHours , names);

    }
    public static int [][] getInput(){
        System.out.print("Enter employee number: ");
        Scanner input = new Scanner(System.in);
        int [][] matrix = new int[input.nextInt()][7];
        System.out.println("Enter the working hours of employees:");
        for(int row = 0; row < matrix.length; row++){
            for(int column = 0; column < matrix[row].length; column++){
                matrix[row][column] = input.nextInt();
            }
        }
        return matrix;
    }
    public static int [] getSum(int [][] matrix){
        int [] sumList = new int[matrix.length];


        for(int row = 0; row < matrix.length; row++){
            int sumOfHours = 0;
            for(int column = 0; column < matrix[row].length; column++){
                sumOfHours += matrix[row][column];
            }
            sumList[row] = sumOfHours;
        }
        return sumList;
    }

    public static void printSortedList(int [] array , String [] names){
        for (int i = 0; i < array.length - 1; i++) {
            // Find the minimum in the list[i...list.length-1]
            int currentMax = array[i];
            int currentMaxIndex = i;
            String currentMaxName = names[i];
            for (int j = i + 1; j < array.length; j++) {
                if (currentMax < array[j]) {
                    currentMax = array[j];
                    currentMaxName = names[j];
                    currentMaxIndex = j;
                }
            }

            // Swap list[i] with list[currentMinIndex] if necessary
            if (currentMaxIndex != i) {
                array[currentMaxIndex] = array[i];
                names[currentMaxIndex] = names[i];
                array[i] = currentMax;
                names[i] = currentMaxName;
            }
        }

        for(int i = 0; i < names.length; i++){
            System.out.println(names[i] + "'s total work hour is: " + array[i]);
        }
    }
}
