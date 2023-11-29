package week_13.assignments.Question_13_11;

import week_13.GeometricObject;

public class Octagon extends GeometricObject implements Comparable<Octagon> , Cloneable{
    private double side;

    public Octagon(double side) {
        this.side = side;
    }

    public Octagon(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea(){
        return (2 + (4 / Math.sqrt(2))) * Math.pow(side , 2);
    }
    @Override
    public double getPerimeter(){
        return 8 * side;
    }
    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    @Override
    public int compareTo(Octagon o) {
        if(this.getArea() > o.getArea()){
            return 1;
        }else if(this.getArea() == o.getArea()){
            return 0;
        }else{
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Area: " + getArea() +
                "\nPerimeter: " + getPerimeter() ;
    }
}
