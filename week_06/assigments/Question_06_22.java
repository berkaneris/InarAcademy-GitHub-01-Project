package week_06.assigments;

import java.util.Scanner;

public class Question_06_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = input.nextLong();
        System.out.println("The approximate root of the " + number + " is " + (double)Math.round(sqrt(number)));
    }
    public static double sqrt(long n){
        double lastGuess = 1;
        double nextGuess = 0;
        boolean control = true;
        while (control){
            nextGuess = (lastGuess + n / lastGuess) / 2;
            if(Math.abs(nextGuess - lastGuess) < 0.0001){
                control = false;
            }else{
                lastGuess = nextGuess;
            }
        }
        return nextGuess;

    }
}
