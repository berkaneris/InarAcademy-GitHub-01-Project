package week_07.assigments;

import java.util.Scanner;

public class Question_07_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        int [] numbers = new int[10];
        int count = 0;
        for(int i = 0; i < 10; i++){
            int number = input.nextInt();
            if (isInArray(number , numbers ,count)) {
                for (int k = count; k < numbers.length; k++) {
                    numbers[k]=number ;
                    break;
                }
                count++;
            }
        }
        System.out.println("The number of distinct number is " + count);
        System.out.print("The distinct numbers are: ");
        for (int i = 0; i < count; i++){
            System.out.print(numbers[i] + " ");
        }
    }
    public static boolean isInArray (int number , int [] array , int count){
        boolean isCheck = true;
        for (int i = 0; i < count; i++){
            if (array[i] == number){
                isCheck = false;
                break;
            }
        }
        return isCheck;
    }
}
