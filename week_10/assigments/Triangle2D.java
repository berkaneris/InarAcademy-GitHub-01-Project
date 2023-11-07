package week_10.assigments;

public class Triangle2D {
    private MyPoint p1;
    private MyPoint p2;
    private MyPoint p3;

    public Triangle2D() {
        this(new MyPoint(0,0) , new MyPoint(1,1), new MyPoint(2,5));
    }

    public Triangle2D(MyPoint p1 , MyPoint p2 , MyPoint p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }
    public MyPoint getP1(){
        return p1;
    }
    public void setP1(MyPoint p1){
        this.p1 = p1;
    }
    public MyPoint getP2(){
        return p2;
    }
    public void setP2(MyPoint p2){
        this.p2 = p2;
    }
    public MyPoint getP3(){
        return p2;
    }
    public void setP3(MyPoint p3){
        this.p3 = p3;
    }

    public double getArea(){
        return Math.abs((p1.getX() * (p2.getY() - p3.getY()) + p2.getX() * (p3.getY() - p1.getY()) + p3.getX() * (p1.getY()-p2.getY()))/2) ;

    }
    public double getPerimeter(){
        double side1 = Math.pow(Math.pow((p2.getX() - p1.getX()), 2) + Math.pow((p2.getY() - p1.getY()), 2), 0.5);
        double side2 = Math.pow(Math.pow((p2.getX() - p3.getX()), 2) + Math.pow((p2.getY() - p3.getY()), 2), 0.5);
        double side3 = Math.pow(Math.pow((p1.getX() - p3.getX()), 2) + Math.pow((p1.getY() - p3.getY()), 2), 0.5);

        return side1 + side2 + side3;
    }
    public boolean contains(MyPoint p){
        double areaPP1P2 = Math.abs((p.getX() * (p1.getY() - p2.getY()) + p1.getX() * (p2.getY() - p.getY()) + p2.getX() * (p.getY()-p1.getY()))/2) ;
        double areaPP2P3 = Math.abs((p.getX() * (p2.getY() - p3.getY()) + p2.getX() * (p3.getY() - p.getY()) + p3.getX() * (p.getY()-p2.getY()))/2) ;
        double areaPP1P3 = Math.abs((p.getX() * (p1.getY() - p3.getY()) + p1.getX() * (p3.getY() - p.getY()) + p3.getX() * (p.getY()-p1.getY()))/2) ;

        return (areaPP1P2 + areaPP2P3 + areaPP1P3) == this.getArea();
    }
    public boolean contains(Triangle2D t){
        return (contains(t.getP1()) && contains(t.getP2()) && contains(t.getP3()));
    }
    public boolean overlaps(Triangle2D t){
        return (contains(t.getP1()) || contains(t.getP2()) || contains(t.getP3())) || (t.contains(this.getP1()) || t.contains(this.getP2()) || t.contains(this.getP3()));
    }
}
