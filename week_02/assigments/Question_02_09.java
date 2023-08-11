package week_02.assigments;


import java.util.Scanner;

public class Question_02_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter v0, v1, and t: ");
        double v0 = input.nextDouble();// take v0
        double v1 = input.nextDouble();// take v1
        double t = input.nextDouble();// take t
        double averageAcceleration=(v1-v0)/t;
        System.out.println("The average acceleration is " + (int)(averageAcceleration*10000)/10000.0);
    }

}
