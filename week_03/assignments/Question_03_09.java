package week_03.assigments;

import java.util.Scanner;

public class Question_03_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        int number = input.nextInt();
        int digit9 = number % 10;
        int remainNumber = number / 10;
        int digit8 = remainNumber % 10;
        remainNumber = remainNumber / 10;
        int digit7 = remainNumber % 10;
        remainNumber = remainNumber / 10;
        int digit6 = remainNumber % 10;
        remainNumber = remainNumber / 10;
        int digit5 = remainNumber % 10;
        remainNumber = remainNumber / 10;
        int digit4 = remainNumber % 10;
        remainNumber = remainNumber / 10;
        int digit3 = remainNumber % 10;
        remainNumber = remainNumber / 10;
        int digit2 = remainNumber % 10;
        remainNumber = remainNumber / 10;
        int digit1 = remainNumber % 10;
        int digit10 = (digit1  + digit2 * 2 + digit3 * 3 + digit4 * 4 + digit5 * 5 + digit6 * 6 +
                digit7 * 7 + digit8 * 8 + digit9 * 9) % 11;
        System.out.print("The ISBN-10 number is ");
        if (digit1 == 0 && digit10 == 10) {
            System.out.println("0" + number + "X");
        }else if (digit1 == 0 ) {
            System.out.println("0" + number + digit10);
        } else if (digit10 == 10) {
            System.out.println(number + "X");
        } else {
            System.out.println(number * 10 + digit10);
        }
    }
}
