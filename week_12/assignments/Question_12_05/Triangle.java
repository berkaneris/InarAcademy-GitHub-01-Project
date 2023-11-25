package week_12.assigments.Question_12_05;

import week_11.SimpleGeometricObject;


public class Triangle extends SimpleGeometricObject {

    private double side1 = 1;
    private double side2 = 1;
    private double side3 = 1;
    public Triangle() {

    }
    public Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
        if(side1 + side2 <= side3 || side2 + side3 <= side1 || side1 + side3 <= side2){
            throw new IllegalTriangleException("The sum of any two sides must be greater than the remaining side");
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public double getSide1(){
        return side1;
    }
    public double getSide2(){
        return side2;
    }
    public double getSide3(){
        return side3;
    }
    public double getArea(){
        double side = (side1 + side2 + side3) / 2;
        return Math.pow(side * (side - side1) * (side - side2) * (side - side3), 0.5);
    }
    public double getPerimeter(){
        return side1 + side2 + side3;
    }
    @Override
    public String toString(){
        return "Triangle: side1 = " + side1 + " side2 = " + side2 +
                " side3 = " + side3;
    }
}
