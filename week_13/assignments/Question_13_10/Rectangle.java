package week_13.assignments.Question_13_10;

import week_13.GeometricObject;

public class Rectangle extends GeometricObject implements Comparable<Rectangle>{
    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(
            double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(
            double width, double height, String color, boolean filled) {
        this.width = width;
        this.height = height;
        setColor(color);
        setFilled(filled);
    }

    /**
     * Return width
     */
    public double getWidth() {
        return width;
    }

    /**
     * Set a new width
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * Return height
     */
    public double getHeight() {
        return height;
    }

    /**
     * Set a new height
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Return area
     */
    public double getArea() {
        return width * height;
    }

    /**
     * Return perimeter
     */
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public int compareTo(Rectangle o) {
       if(this.getArea() > o.getArea()){
           return 1;
       }else if(this.getArea() == o.getArea()){
           return 0;
       }else{
           return -1;
       }
    }
    @Override
    public boolean equals(Object obj) throws ClassCastException{
        if(obj instanceof Rectangle){
            return this.compareTo((Rectangle) obj) == 0;
        }
        throw new ClassCastException();
    }
}


