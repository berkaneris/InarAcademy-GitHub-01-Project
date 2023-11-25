package week_05.assigments;

import java.util.Scanner;

public class Question_05_49 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        int vowels = 0;
        int consonants = 0;

        for(int i = 0; i < str.length(); i++){
            if (('A' <= str.charAt(i) && str.charAt(i) <= 'Z') || ('a' <= str.charAt(i) && str.charAt(i) <= 'z')) {
                if (Character.toUpperCase(str.charAt(i)) == 'A' || Character.toUpperCase(str.charAt(i)) == 'E'
                || Character.toUpperCase(str.charAt(i)) == 'I' || Character.toUpperCase(str.charAt(i)) == 'O'
                        || Character.toUpperCase(str.charAt(i)) == 'U'){
                    vowels++;
                }else{
                    consonants++;
                }
            }
        }
        System.out.println("The number of vowels is " + vowels);
        System.out.println("The number of consonants is " + consonants);
    }
}
