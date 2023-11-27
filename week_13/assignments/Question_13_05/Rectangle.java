package week_13.assignments.Question_13_05;

public class Rectangle extends GeometricObject {
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
    public boolean equals(Object obj) throws ClassCastException{
        if(obj instanceof Rectangle) {
            return this.getArea() == ((Rectangle) obj).getArea();
        }
        throw new ClassCastException();
    }
    @Override
    public String toString(){
        return super.toString() + "\nWidth: " + width +
                                  "\nHeight: " + height +
                                  "\nArea: " + getArea() +
                                  "\nPerimeter: " + getPerimeter();
    }
}
