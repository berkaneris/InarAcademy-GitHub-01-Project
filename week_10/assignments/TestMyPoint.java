package week_10.assigments;

public class TestMyPoint {
    public static void main(String[] args) {
        MyPoint myPoint1 = new MyPoint(0 , 0);
        MyPoint myPoint2 = new MyPoint(10 , 30.5);

        System.out.printf("The distance between (%.1f, %.1f) and (%.1f, %.1f) is: %.14f" , myPoint1.getX(), myPoint1.getY(),
                myPoint2.getX(), myPoint2.getY(),myPoint1.distance(myPoint2));
    }
}
