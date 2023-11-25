package week_07.assigments;

import java.util.Scanner;

public class Question_07_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers to exclude from random (1-54): ");
        int [] array = new int[10];

        for(int i = 0; i < array.length; i++){
            array[i] = input.nextInt();
        }

       int number = getRandom(array);
        System.out.println("Number generated: " + number);
    }
    public static int getRandom(int... numbers){
       boolean isSame = true;
        int number = 0;
       while(isSame) {
             number =(int)(Math.random() * 53 + 1);
            for (int i = 0; i < numbers.length; i++) {
                if (number == numbers[i]) {
                    isSame = true;
                    break;
                }else{
                    isSame = false;
                }
            }
       }
       return number;
    }
}
