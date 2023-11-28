package week_13.assignments.Question_13_06;

import week_13.Circle;
import week_13.GeometricObject;


public class ComparableCircle extends Circle implements Comparable<ComparableCircle>{

    public ComparableCircle(){

    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    @Override
    public int compareTo(ComparableCircle object){
        return Double.compare(this.getArea(), object.getArea());
    }




}
