package week_07.assigments;

import java.util.Scanner;

public class Question_07_18 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        double [] numbers = new double[10];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = input.nextDouble();
        }
        bubbleSort(numbers);
        for (double e : numbers){
            System.out.print(e + " ");
        }
    }
    public static void bubbleSort (double [] array){
        for (int k = array.length - 1; 0 < k ; k--){
            for (int i = 0; i < k; i++) {
                if (array[i] > array[i + 1]) {
                 double temp = array[i];
                 array[i] = array[i+1];
                 array[i+1] = temp;
                }
            }
        }
    }
}
