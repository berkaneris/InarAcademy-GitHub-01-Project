package Personalworking;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a degree in Celcius: ");
        double celsiusdegree= input.nextDouble();
        double fahrenheit=(9.0/5) * celsiusdegree +32;
        System.out.println(celsiusdegree + " Celsius is " + fahrenheit +
                " Fahrenheit" );
    }
}
