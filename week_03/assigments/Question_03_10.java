package week_03.assigments;

import java.util.Scanner;

public class Question_03_10 {
    public static void main(String[] args) {
        // 1. Generate two random single-digit integers
         int number1 = (int)(Math.random() * 10);
         int number2 = (int)(Math.random() * 10);
         int number3 = (int)(Math.random() * 100);
         int number4 = (int)(Math.random() * 100);

        // 2. If number1 < number2, swap number1 with number2
         if (number1 < number2) {
             int temp = number1;

            number1 = number2;
             number2 = temp;
             }
         if (number3 < number4){
             int temp = number3;
             number3 = number4;
             number4 = temp;
         }

         // 3. Prompt the student to answer ”What is number1 – number2?”
         System.out.print
         ("What is " + number1 + " - " + number2 + "? ");
         Scanner input = new Scanner(System.in);
         int answer = input.nextInt();
        System.out.print
                ("What is " + number3 + " - " + number4 + "? ");

        int answer2 = input.nextInt();

        // 4. Grade the answer and display the result
         if (number1 - number2 == answer )
             System.out.println("You answer1 is correct!");
         else {
             System.out.println("Your answer1 is wrong.");
             System.out.println(number1 + " - " + number2 +
                     " should be " + (number1 - number2));
         }
         if (number3 - number4 == answer2)
             System.out.println("You answer2 is correct!");
         else {
             System.out.println("Your answer2 is wrong.");
             System.out.println(number3 + " - " + number4 +
                     " should be " + (number3 - number4));
         }
        }
}
