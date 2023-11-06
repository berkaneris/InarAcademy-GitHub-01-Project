package week_10.assigments;

public class Circle2D {
    private double x;
    private double y;
    private double radius;
    public Circle2D(){
        this(0,0,1);
    }
    public Circle2D(double x, double y, double radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public double getRadius(){
        return radius;
    }
    public double getArea(){
        return Math.PI * Math.pow(radius , 2);
    }
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }
    public boolean contains(double x , double y){
        double distance = Math.sqrt(Math.pow(this.x - x , 2) + Math.pow(this.y - y , 2));
        return distance <= radius;
    }
    public boolean contains(Circle2D circle){
        double distance = Math.sqrt(Math.pow(this.x - circle.getX() , 2) + Math.pow(this.y - circle.getY() , 2));
        return distance <= Math.abs(this.radius - circle.getRadius()) && this.radius > circle.getRadius();
    }
    public boolean overlaps(Circle2D circle){
        double distance = Math.sqrt(Math.pow(this.x - circle.getX() , 2) + Math.pow(this.y - circle.getY() , 2));
        return !contains(circle) && distance <= this.radius + circle.getRadius();
    }
}
