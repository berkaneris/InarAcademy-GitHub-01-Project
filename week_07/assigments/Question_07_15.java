package week_07.assigments;

import java.util.Scanner;

public class Question_07_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        int [] numbers = new int[10];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = input.nextInt();
        }
        int [] newList = eliminateDuplicates(numbers);
        System.out.print("The distinct numbers are: ");
        for(int e : newList){
            System.out.print(e + " ");
        }
    }
    public static int[] eliminateDuplicates(int[] list){
     int [] distinctList = new int[list.length];
     distinctList[0]=list[0];
     boolean isInArray = true;
     int count = 1;
     for (int i = 1; i < list.length; i++){
         int number = list[i];
         for (int k = 0; k < count; k++){
              if(number == distinctList[k]){
                  isInArray = false;
                  break;
              }
         }
         if(isInArray){
             distinctList[count] = number;
             count++;
         }
         isInArray=true;
     }
     int [] newList = new int[count];
     for (int i = 0; i < count; i++){
         newList[i] = distinctList[i];
     }
     return newList;
    }
}
