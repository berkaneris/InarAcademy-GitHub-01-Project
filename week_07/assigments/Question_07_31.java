package week_07.assigments;

import java.util.Arrays;
import java.util.Scanner;

public class Question_07_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter sorted list1: ");
        int [] array1 = new int[input.nextInt()];
        for (int i = 0; i <array1.length; i++){
            array1[i] = input.nextInt();
        }


        System.out.print("Enter sorted list2: ");
        int [] array2 = new int[input.nextInt()];
        for (int i = 0; i < array2.length; i++){
            array2[i] = input.nextInt();
        }


        int [] mergedList ;
        mergedList = merge(array1 , array2);


        System.out.print("The merged list is ");
        for (int i= 0; i < mergedList.length; i++){
            System.out.print(mergedList[i] + " ");
        }
    }
    public static int[] merge(int[] list1, int[] list2){
      int [] newList = new int[list1.length + list2.length];

      for (int i = 0 , k = 0; i < newList.length; i++){
          if (i < list1.length){
              newList[i] = list1[i];
          }else {
              newList[i] = list2[k];
              k++;
          }
      }

      Arrays.sort(newList);
      return newList;
    }
}
