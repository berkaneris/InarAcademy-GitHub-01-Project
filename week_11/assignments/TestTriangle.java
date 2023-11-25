package week_11.assigments;


import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three side of the triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        input.nextLine();
        System.out.print("Enter a color: ");
        String color = input.nextLine();
        System.out.print("Is the triangle filled (true / false)? ");
        String value = input.next();
        boolean isFilled = Boolean.parseBoolean(value);


        Triangle triangle = new Triangle(side1 , side2 , side3);
        triangle.setColor(color);
        triangle.setFilled(isFilled);

        System.out.print("Triangle: side1 = " + triangle.getSide1() + "side2 = " + triangle.getSide2() + "side3 = " + triangle.getSide3() +
                           "\nArea: " + triangle.getArea() +
                           "\nPerimeter: " + triangle.getPerimeter() +
                           "\nColor: " + triangle.getColor() + "\nTriangle " );
        System.out.print((triangle.getFilled()) ? "is filled." : "is empty.");

    }
}
