package week_13.assignments.Question_13_06;

public class TestComparableCircle {
    public static void main(String[] args) {
        ComparableCircle circle1 = new ComparableCircle(16.5 , "blue" , true);
        ComparableCircle circle2 = new ComparableCircle(20.3 , "purple" , true);
        System.out.println("ComparableCircle1:\n" + circle1);
        System.out.println("\nComparableCircle2:\n" + circle2);

        if (circle1.compareTo(circle2) > 0) {
            System.out.print("\nComparableCircle1 ");
        } else if (circle2.compareTo(circle1) > 0) {
            System.out.print("\nComparableCircle2 ");
        }
        if(circle1.compareTo(circle2) != 0) {
            System.out.println("is the larger of the two Circles");
        }
    }
}
