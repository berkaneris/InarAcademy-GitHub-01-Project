package week_02.assigments;

import java.util.Scanner;

public class Question_02_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of years: ");
        double years = input.nextDouble();
        final long CURRENT_POPULATION = 312032486;
        double population = CURRENT_POPULATION + years * (long)((365 * 24 * 60 * 60 / 7.0) - (365 * 24 * 60 * 60 / 13.0) +
                (365 * 24 * 60 * 60 / 45.0));
        System.out.println("The population in " + years + " years is " + population);

    }
}
