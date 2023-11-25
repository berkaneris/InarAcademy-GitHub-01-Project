package week_03.assigments;

import java.util.Scanner;

public class Question_03_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year: (e.g., 2012): ");
        int year = input.nextInt();
        System.out.print("Enter month: 1-12: ");
        int month = input.nextInt();
        System.out.print("Enter the day of the month: 1-31: ");
        int dayNumber = input.nextInt();

        if (month == 1 || month == 2){
            int day = (dayNumber + 26 * (month+13) / 10 + (year - 1) % 100 +
                    (year - 1) % 100 / 4 + (year -1) / 400 + 5 * (year - 1) / 100 ) % 7;
            if ( day == 0 ){
                System.out.println("Day of the week is Saturday");
            }else if ( day == 1 ){
                System.out.println("Day of the week is Sunday");
            }else if ( day == 2 ){
                System.out.println("Day of the week is Monday");
            }else if ( day == 3 ){
                System.out.println("Day of the week is Tuesday");
            }else if ( day == 4 ){
                System.out.println("Day of the week is Wednesday");
            }else if ( day == 5 ){
                System.out.println("Day of the week is Thursday");
            }else if ( day == 6 ){
                System.out.println("Day of the week is Friday");
            }
        }
        else {
            int day = (dayNumber + 26 * (month+1) / 10 + year % 100 +
                    year % 100 / 4 + year / 400 + 5 * (year / 100) ) % 7;
            if ( day == 0 ){
                System.out.println("Day of the week is Saturday");
            }else if ( day == 1 ){
                System.out.println("Day of the week is Sunday");
            }else if ( day == 2 ){
                System.out.println("Day of the week is Monday");
            }else if ( day == 3 ){
                System.out.println("Day of the week is Tuesday");
            }else if ( day == 4 ){
                System.out.println("Day of the week is Wednesday");
            }else if ( day == 5 ){
                System.out.println("Day of the week is Thursday");
            }else if ( day == 6 ){
                System.out.println("Day of the week is Friday");
            }

        }
    }
}
