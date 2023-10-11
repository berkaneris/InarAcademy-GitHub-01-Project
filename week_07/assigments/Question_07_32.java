package week_07.assigments;

import java.util.Scanner;

public class Question_07_32 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        System.out.print("Enter list: ");
        int [] list = new int[input.nextInt()];

        for(int i = 0; i < list.length; i++){
            list[i] = input.nextInt();
        }
        int partition = partition(list);

        System.out.print("After the partition, the list is: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();


    }
    public static int partition(int[] list){
       int pivot = list[0];
       int countBefore = 0;
       int countAfter = list.length - 1;

        while (countAfter > countBefore) {
            // Find an element on the left side that is greater than the pivot
            while (countBefore <= countAfter && list[countBefore] <= pivot) {
                countBefore++;
            }

            // Find an element on the right side that is less than the pivot
            while (countBefore <= countAfter && list[countAfter] > pivot) {
                countAfter--;
            }

            // Swap the elements at low and high indices if they are out of order
            if (countAfter > countBefore) {
                int temp = list[countAfter];
                list[countAfter] = list[countBefore];
                list[countBefore] = temp;
            }
        }

        // Move the pivot element to its correct position
        while (countAfter > 0 && list[countAfter] >= pivot) {
            countAfter--;
        }

        if (pivot > list[countAfter]) {
            list[0] = list[countAfter];
            list[countAfter] = pivot;
            return countAfter;
        } else {
            return 0;
        }

    }
}
