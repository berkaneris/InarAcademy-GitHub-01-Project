package week_07.assigments;

import java.util.Scanner;

public class Question_07_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] numbers = new int[10];
        System.out.print("Enter ten numbers: ");

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = input.nextInt();
        }
        reverse(numbers);
        for (int e : numbers){
            System.out.print(e + " ");
        }
    }
    public static int[] reverse(int[] list){
        for (int i = 0 , k = list.length - 1; i < k; i++ , k--){
            int temp = list[i];
            list[i] = list[k];
            list[k] = temp;
        }
        return list;
    }
}
