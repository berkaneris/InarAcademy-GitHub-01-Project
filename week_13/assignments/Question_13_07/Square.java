package week_13.assignments.Question_13_07;

import week_13.assignments.Question_13_05.GeometricObject;

public class Square extends GeometricObject implements Colorable{
    private double side;

    public Square(){

    }

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, boolean filled, double side) {
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
        return Math.pow(side, 2);
    }
    @Override
    public double getPerimeter(){
        return 4 * side;
    }
    @Override
    public void howToColor(){
        System.out.println("Color all four sides");
    }

}
