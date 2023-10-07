package week_07.assigments;

import java.util.Scanner;

public class Question_07_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        double [] numbers = new double[10];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = input.nextDouble();
        }
        selectionSort(numbers);
        for (double e : numbers){
            System.out.print(e + " ");
        }
    }
    public static void selectionSort(double[] list) {
        for (int i = list.length - 1; 0 <= i; i--) {
            // Find the minimum in the list[i...list.length-1]
            double currentMax = list[i];
            int currentMaxIndex = i;

            for (int j = i - 1; 0 <= j; j--) {
                if (currentMax < list[j]) {
                    currentMax = list[j];
                    currentMaxIndex = j;
                }
            }

            // Swap list[i] with list[currentMinIndex] if necessary
            if (currentMaxIndex != i) {
                list[currentMaxIndex] = list[i];
                list[i] = currentMax;
            }
        }
    }
}
