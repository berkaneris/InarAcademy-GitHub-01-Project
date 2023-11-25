package week_05.assigments;

import java.util.Scanner;

public class Question_05_36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        int number = input.nextInt();
        int digit = 0;
        int remainNumber = number;
        int digit10 = 0;
        for (int i = 9; 0 < i ; i--){
            digit = remainNumber % 10;
            remainNumber = remainNumber / 10;
            digit10 += digit * (i);
        }
        digit10 = digit10 % 11;
        System.out.print("The ISBN-10 number is ");
        if (digit == 0 && digit10 == 10) {
            System.out.println("0" + number + "X");
        }else if (digit == 0 ) {
            System.out.println("0" + number + digit10);
        } else if (digit10 == 10) {
            System.out.println(number + "X");
        } else {
            System.out.println(number * 10 + digit10);
        }
    }
}
