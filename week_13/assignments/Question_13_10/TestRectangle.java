package week_13.assignments.Question_13_10;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(5,3);
        Rectangle rectangle2 = new Rectangle(3,5);
        Rectangle rectangle3 = new Rectangle(6,4);
        System.out.println("Rectangle1 Area :" + rectangle1.getArea() +
                           "\nRectangle2 Area :" + rectangle2.getArea() +
                           "\nRectangle3 Area :" + rectangle3.getArea());
        System.out.print("Rectangle1 is ");
        if(!rectangle1.equals(rectangle2)){
            System.out.print("not ");
        }
        System.out.println("equal to Rectangle2");
        System.out.print("Rectangle1 is ");
        if(!rectangle1.equals(rectangle3)){
            System.out.print("not ");
        }
        System.out.println("equal to Rectangle3");
    }
}
