package week_03.assigments;

import java.util.Scanner;

public class Question_03_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        final int X_1 = 0; // x1 is the center x coordinate of the circle
        final int Y_1 = 0; // y1 is the center y coordinate of the circle
        final int RADIUS = 10; // the radius of the circle
        double radius = Math.sqrt(Math.pow(x - X_1 , 2) + Math.pow(y - Y_1 , 2));

        if ( radius < RADIUS ){
            System.out.println("Point (" + x + ", " + y + ") is in the circle" );
        }
        else {
            System.out.println("Point (" + x + ", " + y + ") is not in the circle" );
        }
    }
}
