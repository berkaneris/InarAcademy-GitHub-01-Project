package week_06.assigments;

import java.util.Scanner;

public class Question_06_20 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        System.out.println("The number of letters in the string " + countLetters(str));
    }
    public static int countLetters(String s){
        int countLetter = 0;
        for (int i = 0; i < s.length(); i++){
            if (('A' <= s.charAt(i) && s.charAt(i) <= 'Z') || ('a' <= s.charAt(i) && s.charAt(i) <= 'z')){
                countLetter++;
            }
        }
        return countLetter;
    }

}
