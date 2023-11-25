package week_07.assigments;

import java.util.Scanner;

public class Question_07_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double [] numbers = new double[10];
        System.out.print("Enter ten values of double type: ");
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = input.nextDouble();
        }
        System.out.println("The average value: " + average(numbers));
    }

    public static int average(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }

    public static double average(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }
}
