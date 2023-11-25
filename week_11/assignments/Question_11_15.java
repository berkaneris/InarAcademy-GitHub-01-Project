package week_11.assigments;


import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of the points: ");
        int n = input.nextInt();


        ArrayList<Point2D> points = new ArrayList<>();
        System.out.println("Enter the coordinates of the points: ");
        for (int i = 1; i <= n; i++) {
            double x = input.nextDouble();
            double y = input.nextDouble();
            points.add(new Point2D.Double(x, y));
        }

        System.out.println("The total area is: " + calculateConvexPolygonArea(points));


    }

    public static double calculateConvexPolygonArea(ArrayList<Point2D> points) {
        int n = points.size();
        double area = 0;

        for (int i = 0; i < n - 1 ; i++) {
            area += (points.get(i).getX() * points.get(i + 1).getY()) - (points.get(i + 1).getX() * points.get(i).getY());
        }
        area += (points.get(points.size() - 1).getX() * points.get(0).getY()) - (points.get(0).getX() * points.get(points.size() - 1).getY());


        area = Math.abs(area) / 2;
        return area;
    }


}

