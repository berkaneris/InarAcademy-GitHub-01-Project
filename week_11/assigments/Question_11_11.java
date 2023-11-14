package week_11.assigments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Question_11_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a list of integers ending with 0: ");
        ArrayList<Integer> list = new ArrayList<>();
        int number ;
        do{
            number = input.nextInt();
            if(number != 0){
                list.add(number);
            }
        }while (number != 0);
        System.out.println("Before sorting..");
        printArrayList(list);
        sort(list);

        System.out.println("\n\nAfter sorting..");
        printArrayList(list);
    }
    public static void sort(ArrayList<Integer> list){
        Collections.sort(list);
    }
    public static void printArrayList(ArrayList<Integer> list){
        for (Integer element: list) {
            System.out.print(element + " ");
        }
    }
}
