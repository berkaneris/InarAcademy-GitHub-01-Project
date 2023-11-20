package week_12.assigments;

import java.util.Scanner;

public class Question_12_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] array = new int[100];

        for(int i= 0; i < array.length; i++){
            array[i] = (int)(Math.random() * 100);
        }

        System.out.print("Enter the index of the array: ");
        try{
            int number = input.nextInt();
            System.out.println("You chose: " + array[number]);
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Out of Bounds.!!");
        }
    }
}
