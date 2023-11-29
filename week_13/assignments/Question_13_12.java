package week_13.assignments;

import week_13.assignments.Question_13_05.Circle;
import week_13.assignments.Question_13_05.GeometricObject;
import week_13.assignments.Question_13_05.Rectangle;

public class Question_13_12 {
    public static void main(String[] args) {
        GeometricObject[] list = new GeometricObject[4];
        for(int i = 0; i < list.length; i++){
            if(i < 2){
                list[i] = new Circle((i + 4.5) * 1.4);
            }else{
                list[i] = new Rectangle(i * 3.2 , (i * 6.7) / 2.1);
            }
        }
        System.out.println("Total area of Geometric Objects: " + sumArea(list));
    }
    public static double sumArea(GeometricObject[] a){
        double sumOfAreas = 0;


        for(int i = 0; i < a.length; i++){

                sumOfAreas += a[i].getArea();
        }
        return sumOfAreas;
    }
}
