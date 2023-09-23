package week_06.assigments;

import java.util.Scanner;

public class Question_06_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        System.out.print("Enter a character: ");
        String str1 = input.nextLine();
        if (str1.length() != 1){
            System.out.println("The character you entered is invalid.");
        }else{
            System.out.println("The character you entered is used " + count(str , str1.charAt(0)) + " time in the string.");
        }

    }

    public static int count(String str, char a) {
        int countChar = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.toLowerCase().charAt(i) == Character.toLowerCase(a)) {
                countChar++;
            }
        }
        return countChar;
    }

}
