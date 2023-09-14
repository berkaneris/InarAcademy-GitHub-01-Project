package week_05.assigments;

import java.util.Scanner;

public class Question_05_50 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        int upperCase = 0;

        for(int i = 0; i < str.length(); i++){
            if (('A' <= str.charAt(i) && str.charAt(i) <= 'Z')){
                upperCase++;
            }
        }
        System.out.println("The number of uppercase letters is " + upperCase);
    }
}
