package week_14.assignments.Question_22;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();
        if (isHappyNumber(number)) {
            System.out.println(number + " is a happy number");
        }else{
            System.out.println(number + " is not a happy number");
        }
    }
    public static boolean isHappyNumber(int number) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(number);
        boolean isContinue = true;
        while (isContinue) {
            number = sumSquaresOfDigits(number);
            if (number == 1) {
                return true;
            } else if (numbers.contains(number)) {
                isContinue = false;
            } else {
                numbers.add(number);
            }
        }
        return false;
    }

    public static int sumSquaresOfDigits(int number) {
        String num = number + "";
        int result = 0;
        for (int i = 0; i < num.length(); i++) {
            result += Math.pow(Integer.parseInt(num.charAt(i) + ""), 2);
        }
        return result;
    }
}
