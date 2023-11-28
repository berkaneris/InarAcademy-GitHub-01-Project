package week_13.assignments.Question_13_09;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(6);
        Circle circle3 = new Circle(5);
        System.out.println("Circle1 radius: " + circle1.getRadius() +
                           "\nCircle2 radius: " + circle2.getRadius() +
                           "\nCircle3 radius: " + circle3.getRadius());
        System.out.print("Circle1 is ");
        if(!circle1.equals(circle2)){
            System.out.print("not ");
        }
        System.out.println("equal to circle2");
        System.out.print("Circle1 is ");
        if(!circle1.equals(circle3)){
            System.out.print("not ");
        }
        System.out.println("equal to circle3");
    }
}
