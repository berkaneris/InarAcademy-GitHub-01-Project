package week_06.assigments;

import java.util.Scanner;

public class Question_06_37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        System.out.print("Enter the width of the number: ");
        int width = input.nextInt();
        System.out.println(format(number , width));
    }
    public static String format(int number, int width){
        String num = number + "";
        String output = "";
        for (int i = num.length(); i < width; i++){
            num = "0" + num;
        }
        return num;
    }
}
