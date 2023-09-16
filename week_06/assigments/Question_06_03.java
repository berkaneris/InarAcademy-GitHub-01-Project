package week_06.assigments;

import java.util.Scanner;

public class Question_06_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a integer number: ");
        int number = input.nextInt();
        if (isPalindrome(number)){
            System.out.println("The number you entered is a palindrome.");
        }else {
            System.out.println("The reverse of the number is not a palindrome." );
        }
    }
    public static int reverse (int number){
        String num = "";
        while (number != 0){
                num += number % 10;
                number /= 10;
        }
            return Integer.parseInt(num);

    }
    public static boolean isPalindrome (int number){

        return reverse(number) == number;
    }
}
