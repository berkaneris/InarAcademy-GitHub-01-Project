package week_03.assigments;

import java.util.Scanner;

public class Question_03_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter today's day: ");
        int today = input.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        int elapsedTime = input.nextInt();
        if (today % 7 == 0) {
            System.out.print("Today is Sunday and the future day is ");
            switch (elapsedTime % 7) {
                case 0:
                    System.out.println("Sunday");
                    break;
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
            }
        } else if (today % 7 == 1) {
            System.out.print("Today is Monday and the future day is ");
            switch (elapsedTime % 7) {
                case 0:
                    System.out.println("Monday");
                    break;
                case 1:
                    System.out.println("Tuesday");
                    break;
                case 2:
                    System.out.println("Wednesday");
                    break;
                case 3:
                    System.out.println("Thursday");
                    break;
                case 4:
                    System.out.println("Friday");
                    break;
                case 5:
                    System.out.println("Saturday");
                    break;
                case 6:
                    System.out.println("Sunday");
                    break;
            }
        }
        else if (today % 7 == 2) {
            System.out.print("Today is Tuesday and the future day is ");
            switch (elapsedTime % 7) {
                case 0:
                    System.out.println("Tuesday");
                    break;
                case 1:
                    System.out.println("Wednesday");
                    break;
                case 2:
                    System.out.println("Thursday");
                    break;
                case 3:
                    System.out.println("Friday");
                    break;
                case 4:
                    System.out.println("Saturday");
                    break;
                case 5:
                    System.out.println("Sunday");
                    break;
                case 6:
                    System.out.println("Monday");
                    break;
            }
        }
        else if (today % 7 == 3) {
            System.out.print("Today is Wednesday and the future day is ");
            switch (elapsedTime % 7) {
                case 0:
                    System.out.println("Wednesday");
                    break;
                case 1:
                    System.out.println("Thursday");
                    break;
                case 2:
                    System.out.println("Friday");
                    break;
                case 3:
                    System.out.println("Saturday");
                    break;
                case 4:
                    System.out.println("Sunday");
                    break;
                case 5:
                    System.out.println("Monday");
                    break;
                case 6:
                    System.out.println("Tuesday");
                    break;
            }
        }
        else if (today % 7 == 4) {
            System.out.print("Today is Thursday and the future day is ");
            switch (elapsedTime % 7) {
                case 0:
                    System.out.println("Thursday");
                    break;
                case 1:
                    System.out.println("Friday");
                    break;
                case 2:
                    System.out.println("Saturday");
                    break;
                case 3:
                    System.out.println("Sunday");
                    break;
                case 4:
                    System.out.println("Monday");
                    break;
                case 5:
                    System.out.println("Tuesday");
                    break;
                case 6:
                    System.out.println("Wednesday");
                    break;
            }
        }
        else if (today % 7 == 5) {
            System.out.print("Today is Friday and the future day is ");
            switch (elapsedTime % 7) {
                case 0:
                    System.out.println("Friday");
                    break;
                case 1:
                    System.out.println("Saturday");
                    break;
                case 2:
                    System.out.println("Sunday");
                    break;
                case 3:
                    System.out.println("Monday");
                    break;
                case 4:
                    System.out.println("Tuesday");
                    break;
                case 5:
                    System.out.println("Wednesday");
                    break;
                case 6:
                    System.out.println("Thursday");
                    break;
            }
        }
        else if (today % 7 == 6) {
            System.out.print("Today is Saturday and the future day is ");
            switch (elapsedTime % 7) {
                case 0:
                    System.out.println("Saturday");
                    break;
                case 1:
                    System.out.println("Sunday");
                    break;
                case 2:
                    System.out.println("Monday");
                    break;
                case 3:
                    System.out.println("Tuesday");
                    break;
                case 4:
                    System.out.println("Wednesday");
                    break;
                case 5:
                    System.out.println("Thursday");
                    break;
                case 6:
                    System.out.println("Friday");
                    break;
            }
        }
    }
}
