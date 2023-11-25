package week_03.assigments;

import java.util.Scanner;

public class Question_03_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter r1's center x-, y-coordinates, width, and height: ");
        double r1_x = input.nextDouble();
        double r1_y = input.nextDouble();
        double r1_width = input.nextDouble();
        double r1_height = input.nextDouble();
        System.out.print("Enter r2's center x-, y-coordinates, width, and height: ");
        double r2_x = input.nextDouble();
        double r2_y = input.nextDouble();
        double r2_width = input.nextDouble();
        double r2_height = input.nextDouble();

        double r1X = r1_x + r1_width / 2;
        double r1Y = r1_y + r1_height / 2;
        double r1_X = r1_x - r1_width / 2;
        double r1_Y = r1_y - r1_height / 2;
        double r2X = r2_x + r2_width / 2;
        double r2Y = r2_y + r2_height / 2;
        double r2_X = r2_x - r2_width / 2;
        double r2_Y = r2_y - r2_height / 2;

        if (r1X >= r2X && r1_X <= r2X && r1X >= r2_X && r1_X <= r2_X &&
                r1Y >= r2Y && r1_Y <= r2Y && r1Y >= r2_Y && r1_Y <= r2_Y ){
            System.out.println("r2 is inside r1");
        }
        else if (r2X >= r1X && r2_X <= r1X && r2X >= r1_X && r2_X <= r1_X &&
                r2Y >= r1Y && r2_Y <= r1Y && r2Y >= r1_Y && r2_Y <= r1_Y ){
            System.out.println("r1 is inside r2");
        }
        else if (r1X >= r2X && r1_X <= r2X || r1X >= r2_X && r1_X <= r2_X ||
                r1Y >= r2Y && r1_Y <= r2Y || r1Y >= r2_Y && r1_Y <= r2_Y ){
            System.out.println("r2 overlaps r1");
        }
        else if (r2X >= r1X && r2_X <= r1X || r2X >= r1_X && r2_X <= r1_X ||
                r2Y >= r1Y && r2_Y <= r1Y || r2Y >= r1_Y && r2_Y <= r1_Y ) {
            System.out.println("r1 overlaps r2");
        }
        else {
            System.out.println("r2 does not overlap r1");
        }
    }
}
