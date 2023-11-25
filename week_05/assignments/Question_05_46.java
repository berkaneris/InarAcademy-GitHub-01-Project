package week_05.assigments;

import java.util.Scanner;

public class Question_05_46 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        int length = str.length();
        System.out.print("The reversed string is ");
        for(int i = length - 1; 0 <= i; i--){
            System.out.print(str.charAt(i) + "");
        }
    }
}
