package week_06.assigments;

import java.util.Scanner;

public class Question_06_02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a integer: ");
        long number = input.nextLong();
        System.out.println("The sum of the digits in " + number + " is " + sumDigits(number));
    }
    public static int sumDigits (long n){
        int sum = 0;
        while (n != 0){
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
