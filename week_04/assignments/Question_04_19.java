package week_04.assigments;

import java.util.Scanner;

public class Question_04_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ISBN: ");
        String numberIsbn = input.nextLine();
        int number = Integer.parseInt(numberIsbn);
        int digit1 = Integer.parseInt(numberIsbn.substring(0,1));
        int digit2 = Integer.parseInt(numberIsbn.substring(1,2));
        int digit3 = Integer.parseInt(numberIsbn.substring(2,3));
        int digit4 = Integer.parseInt(numberIsbn.substring(3,4));
        int digit5 = Integer.parseInt(numberIsbn.substring(4,5));
        int digit6 = Integer.parseInt(numberIsbn.substring(5,6));
        int digit7 = Integer.parseInt(numberIsbn.substring(6,7));
        int digit8 = Integer.parseInt(numberIsbn.substring(7,8));
        int digit9 = Integer.parseInt(numberIsbn.substring(8,9));

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
