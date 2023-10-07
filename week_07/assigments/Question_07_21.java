package week_07.assigments;

import java.util.Scanner;

public class Question_07_21 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of balls to drop: ");
        int numberOfBalls = input.nextInt();
        System.out.print("Enter the number of slots in the bean machine: ");
        int numberOfSlots = input.nextInt();
        int [] slots = new int[numberOfSlots];
        String [] outputs = new String[numberOfBalls];
        String output = "";
        for(int i = 0; i < numberOfBalls; i++) {
            int count = 0;
            for (int k = 0; k < numberOfSlots - 1; k++) {
               int number =(int)(Math.random() * 2 + 1);
               if (number == 1){
                   output += "R";
                   count++;
               }else{
                   output += "L";
               }
            }
            slots[count]++;
            outputs[i] = output;
            output = "";
        }
        System.out.println();
        for (int i = 0; i < outputs.length; i++){
            System.out.println(outputs[i]);
        }
        System.out.println();
//        Display the histogram

        int max = 0;
        for (int i = 0; i < slots.length; i++){
            if (slots[i] > max){
                max = slots[i];
            }
        }
        int num = max;
        for (int k = 0; k < num; k++) {
            for (int i = 0; i < slots.length; i++) {
                if (slots[i] == max) {
                    System.out.print("O");
                    slots[i]--;
                } else {
                    System.out.print(" ");
                }
            }
            max--;
            System.out.println();
        }
    }

}
