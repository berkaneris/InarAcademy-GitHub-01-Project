package week_07.assigments;

import java.util.Scanner;

public class Question_07_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of values: ");
        int number = input.nextInt();

        int [] numbers = new int[number];
        System.out.print("Enter the values: ");

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = input.nextInt();
        }
        if (isConsecutiveFour(numbers)){
            System.out.println("The list has consecutive fours");
        }else{
            System.out.println("The list has no consecutive fours");
        }
    }

    public static boolean isConsecutiveFour(int[] values) {
       int count = 1;
       for (int i = 0; i < values.length - 1; i++){
           if(values[i] == values[i + 1]){
               count++;
           }
       }
       if (count >= 4){
           return true;
       }else{
           return false;
       }
    }
}
