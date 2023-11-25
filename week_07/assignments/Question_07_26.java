package week_07.assigments;

import java.util.Arrays;
import java.util.Scanner;

public class Question_07_26 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("Enter list1: ");
        int number = input.nextInt();
        int [] list1 = new int[number];
        for(int i = 0; i < list1.length; i++){
            list1[i] = input.nextInt();
        }
        System.out.print("Enter list2: ");
        number = input.nextInt();
        int [] list2 = new int[number];
        for(int i = 0; i < list2.length; i++){
            list2[i] = input.nextInt();
        }
        if (equals(list1 , list2)){
            System.out.println("Two lists are strictly identical");
        }else{
            System.out.println("Two lists are not strictly identical");
        }
    }
    public static boolean equals(int[] list1, int[] list2){
      return (Arrays.equals(list1 , list2));

    }
}
