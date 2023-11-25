package week_06.assigments;

public class Question_06_08 {
    public static void main(String[] args) {
        System.out.println("Celsius          Fahrenheit          |          Fahrenheit          Celsius");
        System.out.println("---------------------------------------------------------------------------");
        for (double i = 40.0 , k = 120.0 ; i >= 31 && k >= 30; i-- , k -= 10){
            System.out.printf("%-17.1f%-20.1f%-11s%-20.1f%-7.2f" , i , celsiusToFahrenheit(i) ,"|", (k), fahrenheitToCelsius(k));
            System.out.println();
    }
    }
    public static double celsiusToFahrenheit(double celsius){
        return (9.0 / 5) * celsius + 32;
    }
    public static double fahrenheitToCelsius(double fahrenheit){
        return  (5.0 / 9) * (fahrenheit - 32);

    }
}
