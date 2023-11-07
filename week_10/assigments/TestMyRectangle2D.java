package week_10.assigments;

public class TestMyRectangle2D {
    public static void main(String[] args) {
        MyRectangle2D r1 = new MyRectangle2D(2,2,5.5,4.9);
        System.out.println("Area: " + r1.getArea() +
                           "\nPerimeter: " + r1.getPerimeter());

        System.out.println(r1.contains(3,3) ? "contains the point (3, 3)." : "");

        if (!r1.contains(new MyRectangle2D(4,5,10.5,3.2))){
            System.out.print("does not ");
        }
        System.out.println("contain the rectangle with points (4, 5, 10.5, 3.2)");

        if(!r1.overlaps(new MyRectangle2D(3,5,2.3,5.4))){
            System.out.print("does not");
        }
        System.out.println("overlap the rectangle with points (3, 5, 2.3, 5.4)");
    }
}
