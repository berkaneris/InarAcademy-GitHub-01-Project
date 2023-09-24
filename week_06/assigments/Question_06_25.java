package week_06.assigments;

import java.util.Scanner;

public class Question_06_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter milliseconds: ");
        long milliSeconds = input.nextLong();
        System.out.println("hours:minutes:seconds: " + convertMillis(milliSeconds));
    }
    public static String convertMillis(long millis){
        long second = millis / 1000;
        long currentSecond = second % 60;
        long minutes = second / 60;
        long currentMinutes = minutes % 60;
        long hours = minutes / 60;


        return hours + ":" + currentMinutes + ":" + currentSecond;
    }
}
