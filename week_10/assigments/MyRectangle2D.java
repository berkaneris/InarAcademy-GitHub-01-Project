package week_10.assigments;

import java.awt.geom.Line2D;

public class MyRectangle2D {
    private double x;
    private double y;

    private double width;
    private double height;

    public MyRectangle2D() {
        this(0, 0, 1, 1);
    }

    public MyRectangle2D(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public boolean contains(double x, double y) {
        if ((this.getX() - (width / 2) < x && x < this.getX() + (width / 2)) &&
                (this.getY() - (height / 2) < y && y < this.getY() + (height / 2))) {
            return true;
        }
        return false;
    }

    public boolean contains(MyRectangle2D r) {
        if (contains(r.getX() + r.getWidth() / 2, r.getY() + r.getHeight() / 2) &&
                contains(r.getX() - r.getWidth() / 2, r.getY() + r.getHeight() / 2) &&
                contains(r.getX() + r.getWidth() / 2, r.getY() - r.getHeight() / 2) &&
                contains(r.getX() - r.getWidth() / 2, r.getY() - r.getHeight() / 2)) {
            return true;
        }
        return false;
    }

    public boolean overlaps(MyRectangle2D r) {
        double p1X = getX() + getWidth() / 2;
        double p1Y = getY() + getHeight() / 2;
        double p2X = getX() + getWidth() / 2;
        double p2Y = getY() - getHeight() / 2;
        double p3X = getX() - getWidth() / 2;
        double p3Y = getY() - getHeight() / 2;
        double p4X = getX() - getWidth() / 2;
        double p4Y = getY() + getHeight() / 2;

        double r_p1X = r.getX() + r.getWidth() / 2;
        double r_p1Y = r.getY() + r.getHeight() / 2;
        double r_p2X = r.getX() + r.getWidth() / 2;
        double r_p2Y = r.getY() - r.getHeight() / 2;
        double r_p3X = r.getX() - r.getWidth() / 2;
        double r_p3Y = r.getY() - r.getHeight() / 2;
        double r_p4X = r.getX() - r.getWidth() / 2;
        double r_p4Y = r.getY() + r.getHeight() / 2;

        return Line2D.linesIntersect(p1X, p1Y, p2X, p2Y, r_p1X, r_p1Y, r_p2X, r_p2Y) ||
                Line2D.linesIntersect(p1X, p1Y, p2X, p2Y, r_p2X, r_p2Y, r_p3X, r_p3Y) ||
                Line2D.linesIntersect(p1X, p1Y, p2X, p2Y, r_p3X, r_p3Y, r_p4X, r_p4Y) ||
                Line2D.linesIntersect(p1X, p1Y, p2X, p2Y, r_p4X, r_p4Y, r_p1X, r_p1Y) ||
                Line2D.linesIntersect(p2X, p2Y, p3X, p3Y, r_p1X, r_p1Y, r_p2X, r_p2Y) ||
                Line2D.linesIntersect(p2X, p2Y, p3X, p3Y, r_p2X, r_p2Y, r_p3X, r_p3Y) ||
                Line2D.linesIntersect(p2X, p2Y, p3X, p3Y, r_p3X, r_p3Y, r_p4X, r_p4Y) ||
                Line2D.linesIntersect(p2X, p2Y, p3X, p3Y, r_p4X, r_p4Y, r_p1X, r_p1Y) ||
                Line2D.linesIntersect(p3X, p3Y, p4X, p4Y, r_p1X, r_p1Y, r_p2X, r_p2Y) ||
                Line2D.linesIntersect(p3X, p3Y, p4X, p4Y, r_p2X, r_p2Y, r_p3X, r_p3Y) ||
                Line2D.linesIntersect(p3X, p3Y, p4X, p4Y, r_p3X, r_p3Y, r_p4X, r_p4Y) ||
                Line2D.linesIntersect(p3X, p3Y, p4X, p4Y, r_p4X, r_p4Y, r_p1X, r_p1Y) ||
                Line2D.linesIntersect(p4X, p4Y, p1X, p1Y, r_p1X, r_p1Y, r_p2X, r_p2Y) ||
                Line2D.linesIntersect(p4X, p4Y, p1X, p1Y, r_p2X, r_p2Y, r_p3X, r_p3Y) ||
                Line2D.linesIntersect(p4X, p4Y, p1X, p1Y, r_p3X, r_p3Y, r_p4X, r_p4Y) ||
                Line2D.linesIntersect(p4X, p4Y, p1X, p1Y, r_p4X, r_p4Y, r_p1X, r_p1Y) ;


    }
}
