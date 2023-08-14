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
            System.out.print("Today is Sunday and ");
            switch (elapsedTime % 7) {
                case 0:
                    System.out.println("the future day is Sunday");
                    break;
                case 1:
                    System.out.println("the future day is Monday");
                    break;
                case 2:
                    System.out.println("the future day is Tuesday");
                    break;
                case 3:
                    System.out.println("the future day is Wednesday");
                    break;
                case 4:
                    System.out.println("the future day is Thursday");
                    break;
                case 5:
                    System.out.println("the future day is Friday");
                    break;
                case 6:
                    System.out.println("the future day is Saturday");
                    break;
            }
        } else if (today % 7 == 1) {
            System.out.print("Today is Monday and ");
            switch (elapsedTime % 7) {
                case 0:
                    System.out.println("the future day is Monday");
                    break;
                case 1:
                    System.out.println("the future day is Tuesday");
                    break;
                case 2:
                    System.out.println("the future day is Wednesday");
                    break;
                case 3:
                    System.out.println("the future day is Thursday");
                    break;
                case 4:
                    System.out.println("the future day is Friday");
                    break;
                case 5:
                    System.out.println("the future day is Saturday");
                    break;
                case 6:
                    System.out.println("the future day is Sunday");
                    break;
            }
        }
        else if (today % 7 == 2) {
            System.out.print("Today is Tuesday and ");
            switch (elapsedTime % 7) {
                case 0:
                    System.out.println("the future day is Tuesday");
                    break;
                case 1:
                    System.out.println("the future day is Wednesday");
                    break;
                case 2:
                    System.out.println("the future day is Thursday");
                    break;
                case 3:
                    System.out.println("the future day is Friday");
                    break;
                case 4:
                    System.out.println("the future day is Saturday");
                    break;
                case 5:
                    System.out.println("the future day is Sunday");
                    break;
                case 6:
                    System.out.println("the future day is Monday");
                    break;
            }
        }
        else if (today % 7 == 3) {
            System.out.print("Today is Wednesday and ");
            switch (elapsedTime % 7) {
                case 0:
                    System.out.println("the future day is Wednesday");
                    break;
                case 1:
                    System.out.println("the future day is Thursday");
                    break;
                case 2:
                    System.out.println("the future day is Friday");
                    break;
                case 3:
                    System.out.println("the future day is Saturday");
                    break;
                case 4:
                    System.out.println("the future day is Sunday");
                    break;
                case 5:
                    System.out.println("the future day is Monday");
                    break;
                case 6:
                    System.out.println("the future day is Tuesday");
                    break;
            }
        }
        else if (today % 7 == 4) {
            System.out.print("Today is Thursday and ");
            switch (elapsedTime % 7) {
                case 0:
                    System.out.println("the future day is Thursday");
                    break;
                case 1:
                    System.out.println("the future day is Friday");
                    break;
                case 2:
                    System.out.println("the future day is Saturday");
                    break;
                case 3:
                    System.out.println("the future day is Sunday");
                    break;
                case 4:
                    System.out.println("the future day is Monday");
                    break;
                case 5:
                    System.out.println("the future day is Tuesday");
                    break;
                case 6:
                    System.out.println("the future day is Wednesday");
                    break;
            }
        }
        else if (today % 7 == 5) {
            System.out.print("Today is Friday and ");
            switch (elapsedTime % 7) {
                case 0:
                    System.out.println("the future day is Friday");
                    break;
                case 1:
                    System.out.println("the future day is Saturday");
                    break;
                case 2:
                    System.out.println("the future day is Sunday");
                    break;
                case 3:
                    System.out.println("the future day is Monday");
                    break;
                case 4:
                    System.out.println("the future day is Tuesday");
                    break;
                case 5:
                    System.out.println("the future day is Wednesday");
                    break;
                case 6:
                    System.out.println("the future day is Thursday");
                    break;
            }
        }
        else if (today % 7 == 6) {
            System.out.print("Today is Saturday and ");
            switch (elapsedTime % 7) {
                case 0:
                    System.out.println("the future day is Saturday");
                    break;
                case 1:
                    System.out.println("the future day is Sunday");
                    break;
                case 2:
                    System.out.println("the future day is Monday");
                    break;
                case 3:
                    System.out.println("the future day is Tuesday");
                    break;
                case 4:
                    System.out.println("the future day is Wednesday");
                    break;
                case 5:
                    System.out.println("the future day is Thursday");
                    break;
                case 6:
                    System.out.println("the future day is Friday");
                    break;
            }
        }
    }
}
