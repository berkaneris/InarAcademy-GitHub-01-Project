package week_06.assigments;

import java.util.Scanner;

public class Question_06_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a integer number: ");
        int number = input.nextInt();
        reverse(number);

    }
    public static void reverse(int number) {
        String num = "";
        while (number != 0){
            num += number % 10;
            number /= 10;
        }
        System.out.println(Integer.parseInt(num));
    }

}
