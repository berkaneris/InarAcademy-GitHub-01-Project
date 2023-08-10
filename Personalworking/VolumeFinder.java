package Personalworking;


import java.util.Scanner;

public class VolumeFinder {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius and length of a cylinder: ");
        double radius, length, area, volume;
        radius = input.nextDouble();
        length = input.nextDouble();
        area = radius * radius * Math.PI;
        volume = area * length;
        System.out.println("The area is " + (int) (area * 10000) / 10000.0);
        System.out.println("The volume is " + (int) (volume * 10) / 10.0);
    }
}
