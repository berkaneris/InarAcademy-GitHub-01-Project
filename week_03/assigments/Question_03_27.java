package week_03.assigments;

import java.util.Scanner;

public class Question_03_27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a point's x- and y-coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        /* (y1 - y2)x - (x1 - x2)y = (y1 - y2)x1 - (x1 - x2)y1 using with this formula
         we can obtain the equation of the triangle right angle edge */

        if ((100 * x + 200 * y <= 20000) && x >= 0 && x <= 200 && y >= 0 && y <= 100 ){
            System.out.println("The point is in the triangle");
        }
        else {
            System.out.println("The point is not in the triangle");
        }
    }
}
