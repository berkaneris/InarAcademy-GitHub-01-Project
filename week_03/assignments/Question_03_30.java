package week_03.assigments;

import java.util.Scanner;

public class Question_03_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the time zone offset to GMT: ");
        int offset = input.nextInt();
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = (totalHours + offset) % 24;

        if (currentHour > 12){
            currentHour = currentHour % 12;
            System.out.println("The Current time is " + currentHour + ":"
                    + currentMinute + ":" + currentSecond + " PM");
        }
        else if (currentHour < 12 && currentHour != 0){
            currentHour = currentHour % 12;
            System.out.println("The Current time is " + currentHour + ":"
                    + currentMinute + ":" + currentSecond + " AM");
        }
        else if (currentHour == 12){
            System.out.println("The Current time is " + currentHour + ":"
                    + currentMinute + ":" + currentSecond + " PM");
        }
        else  {
            currentHour = 12;
            System.out.println("The Current time is " + currentHour + ":"
                    + currentMinute + ":" + currentSecond + " AM");
        }
    }
}
