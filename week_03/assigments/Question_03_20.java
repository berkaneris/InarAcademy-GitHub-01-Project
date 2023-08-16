package week_03.assigments;

import java.util.Scanner;

public class Question_03_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
        double temperature = input.nextDouble();
        System.out.print("Enter the wind speed (>=2) in miles per hour: ");
        double speed = input.nextDouble();

       if(temperature >= -58 && temperature <= 41 && speed >= 2 ) {
           double chill = 35.74 + (0.6215 * temperature) - (35.75 * Math.pow(speed, 0.16)) + (0.4275 * temperature * Math.pow(speed, 0.16));
           System.out.println("The input is valid.");
           System.out.print("The wind chill index is ");
           System.out.format("%.5f", chill);
       }
       else if ((temperature < -58 || temperature > 41) && speed >=2){
           System.out.println("The input of temperature is invalid.");
       }
       else if (speed < 2 && temperature >= -58 && temperature <= 41){
           System.out.println("The input of wind speed is invalid");
       }
       else {
           System.out.println("The inputs are invalid");
       }
    }
}
