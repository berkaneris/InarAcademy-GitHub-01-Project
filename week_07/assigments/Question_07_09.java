package week_07.assigments;

import java.util.Scanner;

public class Question_07_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double [] numbers = new double[10];
        System.out.print("Enter ten numbers: ");

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = input.nextDouble();
        }
        System.out.println("The minimum number is: " + min(numbers));
    }
    public static double min(double[] array){
    double min = array[0];
    for (int i = 1; i < array.length; i++){
        if (array[i] < min){
            min = array[i];
        }
    }
    return min;
    }
}
