package week_13.assignments.Question_13_05;

public class Circle extends GeometricObject {
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
//        this.color = color; // Illegal
//        this.filled = filled; // Illegal

        /*
                 This is wrong, because the private data fields color and filled in the GeometricObject
                 class cannot be accessed in any class other than in the GeometricObject class itself. The
                 only way to read and modify color and filled is through their getter and setter methods.
         */

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
    public boolean equals(Object obj) throws ClassCastException {
        if (obj instanceof Circle) {
            return this.getRadius() == ((Circle) obj).getRadius();
        }
        throw new ClassCastException();
    }


}
