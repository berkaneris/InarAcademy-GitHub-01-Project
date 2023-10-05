package week_07.assigments;

import java.util.Scanner;

public class Question_07_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int number = input.nextInt();
        input.nextLine();
        String [] names = new String[number];
        double [] scores = new double[number];
        System.out.println("Enter the name a score for each student:");
        for (int i = 0; i < names.length; i++){
            System.out.print("Student " + (i + 1) + ": ");
            names[i] = input.nextLine();
            System.out.print("Score: ");
            scores[i] = input.nextDouble();
            input.nextLine();
        }
        selectionSort(scores , names);
        for (int i = scores.length - 1 ; 0 <= i; i--){
            System.out.println(names[i]);
        }
    }
    public static void selectionSort(double[] list , String [] array) {
        for (int i = 0; i < list.length - 1; i++) {
            // Find the minimum in the list[i...list.length-1]
            double currentMin = list[i];
            String currentName = array[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentName = array[j];
                    currentMinIndex = j;
                }
            }

            // Swap list[i] with list[currentMinIndex] if necessary
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                array[currentMinIndex] = array[i];
                list[i] = currentMin;
                array[i]= currentName;
            }
        }
    }
}
