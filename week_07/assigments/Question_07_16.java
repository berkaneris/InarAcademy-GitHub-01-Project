package week_07.assigments;

import week_07.BinarySearch;
import week_07.LinearSearch;

import java.util.Arrays;

public class Question_07_16 {
    public static void main(String[] args) {
        int [] array = new int[100000];
        for (int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random() * 100000);
        }
        int key = (int)(Math.random() * 100000);
        long startTime = System.currentTimeMillis();
        int result = LinearSearch.linearSearch(array , key);
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println("Execution time of invoking the linearSearch in milliseconds: " + executionTime);

        Arrays.sort(array);
        startTime = System.currentTimeMillis();
        result = BinarySearch.binarySearch(array , key);
        endTime =  System.currentTimeMillis();
        executionTime = endTime - startTime;
        System.out.println("Execution time of invoking the binarySearch in milliseconds: " + executionTime);

    }
}
