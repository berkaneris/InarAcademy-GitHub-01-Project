package week_14.assignments.Question_03;

public class Point implements Comparable<Point>{
    private double x;
    private double y;
    public Point(){

    }
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
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

    @Override
    public int compareTo(Point o) {
        if(this.x > o.x){
            return 1;
        }else if(this.x < o.x){
            return -1;
        }else if(this.x == o.x && this.y > o.y){
            return 1;
        }else if(this.x == o.x && this.y < o.y){
            return -1;
        }else{
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + String.format("%.2f",x) +
                ", y=" + String.format("%.2f",y) +
                '}';
    }
}
