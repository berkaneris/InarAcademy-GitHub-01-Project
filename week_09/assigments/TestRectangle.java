package week_09.assigments;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(4 , 40);
        Rectangle rectangle2 = new Rectangle(3.5 , 35.9);

        System.out.println("--Rectangle 1--");

        System.out.printf("%-9s%-1s%-5.1f" , "Width" , ": " , rectangle1.width);
        System.out.printf("\n%-9s%-1s%-5.1f" , "Height" , ": " , rectangle1.height);
        System.out.printf("\n%-9s%-1s%-5.1f" , "Area" , ": " , rectangle1.getArea());
        System.out.printf("\n%-9s%-1s%-5.1f\n" , "Perimeter" , ": " , rectangle1.getPerimeter());

        System.out.println("\n--Rectangle 2--");

        System.out.printf("%-9s%-1s%-5.1f" , "Width" , ": " , rectangle2.width);
        System.out.printf("\n%-9s%-1s%-5.1f" , "Height" , ": " , rectangle2.height);
        System.out.printf("\n%-9s%-1s%-5.1f" , "Area" , ": " , rectangle2.getArea());
        System.out.printf("\n%-9s%-1s%-5.1f\n" , "Perimeter" , ": " , rectangle2.getPerimeter());
    }
}
