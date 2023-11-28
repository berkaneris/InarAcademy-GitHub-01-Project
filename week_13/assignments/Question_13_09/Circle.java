package week_13.assignments.Question_13_09;

import week_13.GeometricObject;


public class Circle extends GeometricObject implements Comparable<Circle>{
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    /**
     * Return radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Set a new radius
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Return area
     */
    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    /**
     * Return diameter
     */
    public double getDiameter() {
        return 2 * radius;
    }

    /**
     * Return perimeter
     */
    @Override
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    /**
     * Print the circle info
     */
    public void printCircle() {
        System.out.println("The circle is created " + getDateCreated() +
                " and the radius is " + radius);
    }

    @Override
    public String toString() {
        return super.toString() + "\nRadius: " + radius +
                "\nArea: " + getArea() +
                "\nPerimeter: " + getPerimeter();
    }


    @Override
    public int compareTo(Circle o) {
        if(this.radius > o.radius){
            return 1;
        }else if(this.radius == o.radius){
            return 0;
        }else{
            return -1;
        }
    }
    @Override
    public boolean equals(Object obj) throws ClassCastException{
        if(obj instanceof Circle){
            return this.compareTo((Circle) obj) == 0;
        }
        throw new ClassCastException();
    }
}

