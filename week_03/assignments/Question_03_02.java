package week_03.assigments;

import java.util.Scanner;

public class Question_03_02 {
    public static void main(String[] args) {
        int number1 = (int) (Math.random()*10);
        int number2 = (int) (Math.random()*10);
        int number3 = (int) (Math.random()*10);

        // Create a Scanner
        Scanner input = new Scanner(System.in);

        System.out.print(
                "What is " + number1 + " + " + number2 + " + " +number3 + "? ");
        int answer = input.nextInt();

        System.out.println(
                number1 + " + " + number2 + " + " + number3 + " = " + answer + " is " +
                        (number1 + number2 + number3 == answer));


    }
}
