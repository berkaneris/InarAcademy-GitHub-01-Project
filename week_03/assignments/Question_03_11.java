package week_03.assigments;

import java.util.Scanner;

public class Question_03_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        System.out.print("Enter a number of month: ");
        int month = input.nextInt();
        if (month == 1) {
            System.out.println("January " + year + " had 31 days.");
        } else if (month == 2 && year % 4 != 0 ) {
            System.out.println("February " + year + " had 28 days.");
        } else if (month == 2 && year % 100 == 0 && year % 400 != 0) {
            System.out.println("February " + year + " had 28 days.");
        } else if (month == 2 ) {
            System.out.println("February " + year + " had 29 days.");
        } else if (month == 3) {
            System.out.println("March " + year + " had 31 days.");
        } else if (month == 4) {
            System.out.println("April " + year + " had 30 days.");
        } else if (month == 5) {
            System.out.println("May " + year + " had 31 days.");
        } else if (month == 6) {
            System.out.println("June " + year + " had 30 days.");
        } else if (month == 7) {
            System.out.println("July " + year + " had 31 days.");
        } else if (month == 8) {
            System.out.println("August " + year + " had 31 days.");
        } else if (month == 9) {
            System.out.println("September " + year + " had 30 days.");
        } else if (month == 10) {
            System.out.println("October " + year + " had 31 days.");
        } else if (month == 11) {
            System.out.println("November " + year + " had 30 days.");
        } else if (month == 12) {
            System.out.println("December " + year + " had 31 days.");
        }
        else {
            System.out.println("You enter a false value.");
        }
    }
}
