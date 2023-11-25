package week_04.assigments;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Question_04_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the bounding circle: ");
        double radius = input.nextDouble();
        double x1 = radius * Math.cos(Math.PI / 10);
        double y1 = radius * Math.sin(Math.PI / 10);
        double x2 = radius * Math.cos(Math.PI / 10 * 5);
        double y2 = radius * Math.sin(Math.PI / 10 * 5);
        double x3 = radius * Math.cos(Math.PI / 10 * 9);
        double y3 = radius * Math.sin(Math.PI / 10 * 9);
        double x4 = radius * Math.cos(Math.PI / 10 * 13);
        double y4 = radius * Math.sin(Math.PI / 10 * 13);
        double x5 = radius * Math.cos(Math.PI / 10 * 17);
        double y5 = radius * Math.sin(Math.PI / 10 * 17);

        System.out.println("The coordinates of five points on the pentagon are");
        System.out.printf("( %.4f " ,x1 );
        System.out.print(", ");
        System.out.printf("%.4f " , y1 );
        System.out.println(")");
        System.out.printf("( %.9f " ,x2 );
        System.out.print(", ");
        System.out.printf("%.0f " , y2 );
        System.out.println(")");
        System.out.printf("( %.4f " ,x3 );
        System.out.print(", ");
        System.out.printf("%.4f " , y3 );
        System.out.println(")");
        System.out.printf("( %.4f " ,x4 );
        System.out.print(", ");
        System.out.printf("%.4f " , y4 );
        System.out.println(")");
        System.out.printf("( %.4f " ,x5 );
        System.out.print(", ");
        System.out.printf("%.3f " , y5 );
        System.out.println(")");


    }
}
