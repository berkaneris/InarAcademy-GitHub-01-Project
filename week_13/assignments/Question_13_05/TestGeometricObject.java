package week_13.assignments.Question_13_05;



public class TestGeometricObject {
    public static void main(String[] args) {

        System.out.println("The larger of the two circles is : ");
        System.out.println(Circle.max(new Circle(5), new Circle(4)));
        System.out.println("\nThe larger of the two rectangle is : ");
        System.out.println(Rectangle.max(new Rectangle(15, 12), new Rectangle(6, 4)));


    }
}
