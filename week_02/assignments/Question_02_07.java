package week_02.assigments;

import java.util.Scanner;

public class Question_02_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        long minutes = input.nextLong();
        long years = minutes / (365 * 24 * 60);
        long remainder = minutes % (365 * 24 * 60);
        long days = remainder / (24 * 60);
        System.out.println(minutes + " minutes is approximately " +
                years + " years " + " and " + days + " days");


    }
}
