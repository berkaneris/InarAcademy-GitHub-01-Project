package week_03.assigments;

import java.util.Scanner;

public class Question_03_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a guess number 0 for heads or 1 for tails: ");
        int guessNumber = input.nextInt();
        int generateNumber = (int) (Math.random() * 2);

        if (guessNumber < 2 && guessNumber >= 0) {
            if (guessNumber == generateNumber) {
                System.out.println("Your guess is true.");
            } else  {
                System.out.println("Your guess is false.");
            }
        }
        else{
            System.out.println("Your guess is not valid.");
        }
    }
}
