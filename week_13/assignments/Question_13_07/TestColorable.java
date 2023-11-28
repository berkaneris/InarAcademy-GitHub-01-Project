package week_13.assignments.Question_13_07;

import week_13.assignments.Question_13_05.Circle;
import week_13.assignments.Question_13_05.GeometricObject;
import week_13.assignments.Question_13_05.Rectangle;

import java.util.ArrayList;

public class TestColorable {
    public static void main(String[] args) {
        ArrayList<GeometricObject> list = new ArrayList<>();
        list.add(new Circle(5));
        list.add(new Rectangle(5, 10));
        list.add(new Circle(2));
        list.add(new Square(5));
        list.add(new Square(0));


        for(int i = 0; i < list.size(); i++){
            System.out.println("Area of Geometric Object in the index " + (i) + " is : " + list.get(i).getArea());
            if(list.get(i) instanceof Colorable){
                ((Square)list.get(i)).howToColor();
            }
            System.out.println("------------------------------------------------");
        }
    }
}
