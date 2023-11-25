package week_05.assigments;

import java.util.Scanner;

public class Question_05_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int countPositive = 0;
        int countNegative = 0;
        double sum = 0;
        boolean value = true;
        System.out.print("Enter an integer, the input ends if it is 0: ");


        while (value){
            int number = input.nextInt();
            if (number == 0 && countPositive == 0 && countNegative == 0){
                value = false;
                System.out.println("No numbers are entered except " + number);
            }else if (number == 0){
                value = false;
            }
            else if (number < 0){
                countNegative++;
                sum += number;
            }
            else {
                countPositive++;
                sum += number;
            }
        }
        if (countPositive != 0 && countNegative != 0) {
            System.out.print("The number of positives is " + countPositive +
                    "\nThe number of negatives is " + countNegative +
                    "\nThe total is " + sum +
                    "\nThe average is " + ( sum / (countPositive + countNegative )));
        }
    }
}
