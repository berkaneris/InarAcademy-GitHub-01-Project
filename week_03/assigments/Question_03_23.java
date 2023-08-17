package week_03.assigments;

import java.util.Scanner;

public class Question_03_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        final double HEIGHT_OF_RECTANGLE = 5;
        final int WIDTH_OF_RECTANGLE = 10;

        if (x <= WIDTH_OF_RECTANGLE / 2 && x >= -WIDTH_OF_RECTANGLE / 2 &&
                y <= HEIGHT_OF_RECTANGLE/ 2 && y >= -HEIGHT_OF_RECTANGLE / 2) {
            System.out.println("Point (" + x + ", " + y + ") is in the rectangle");
        } else {
            System.out.println("Point (" + x + ", " + y + ") is not in the rectangle");
        }
    }
}
