package week_05.assigments;

import java.util.Scanner;

public class Question_05_37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal integer point: ");
        String point = "";
        String newPoint = "";
        int number = input.nextInt();
        boolean control = true;
        while (control) {
            if ((number / 2) != 1) {
                point = point + (number % 2) ;
                number /= 2;
            }else{
                point = point + (number % 2) ;
                point = point + (number / 2) ;
                control = false;
            }
        }
        for (int i = point.length() - 1; 0 <= i ; i--){
            newPoint = newPoint + point.charAt(i);
        }
        System.out.println("The binary number for the point you entered is: " );
        System.out.println(newPoint);

    }
}
