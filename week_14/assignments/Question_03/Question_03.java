package week_14.assignments.Question_03;

import java.text.DecimalFormat;
import java.util.Arrays;

public class Question_03 {
    public static void main(String[] args) {
        Point[] points = new Point[100];

        for(int i = 0; i < points.length; i++){
            points[i] = new Point(Math.random() * 100 , Math.random() * 100);
        }
        Arrays.sort(points);
        System.out.println("Compare with compareTo:\n" + Arrays.toString(points));
        Arrays.sort(points , new CompareY());
        System.out.println("Compare with comparatorY:\n" + Arrays.toString(points));
    }
}
