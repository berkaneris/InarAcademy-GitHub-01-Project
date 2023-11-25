package week_07.assigments;

import java.util.Scanner;

public class Question_07_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] numbers = new int[10];


        // take numbers from user
        System.out.print("Enter ten integer number: ");
        for (int i=0; i < numbers.length; i++){
            numbers[i] = input.nextInt();
        }


        // display the combinations
        System.out.println("The all combinations of picking two numbers");
        for(int i = 0; i < numbers.length; i++){
            for (int k = 0; k < numbers.length; k++){
                if(i == k){
                    continue;
                }
                System.out.println("(" + numbers[i] + "," + numbers[k] + ") ");
            }
        }

    }
}
