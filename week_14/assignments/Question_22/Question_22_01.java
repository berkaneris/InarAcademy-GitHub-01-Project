package week_14.assignments.Question_22;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question_22_01 {
    // This is recursive solution
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();
        List<Integer> numbers = new ArrayList<>();
        if (sumSquaresOfDigits(number , numbers) == 1) {
            System.out.println(number + " is a happy number");
        }else{
            System.out.println(number + " is not a happy number");
        }
    }
    public static int sumSquaresOfDigits(int number , List<Integer> numbers) {
        if (number == 1) {
            return number;
        } else if (numbers.contains(number) || number == 0) {
            return 0;
        } else {
            numbers.add(number);
            String num = number + "";
            int result = 0;
            for (int i = 0; i < num.length(); i++) {
                result += Math.pow(Integer.parseInt(num.charAt(i) + ""), 2);
            }
           return sumSquaresOfDigits(result , numbers);
        }
    }
}
