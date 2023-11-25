package week_06.assigments;

import java.util.Scanner;

public class Question_06_21 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("Enter a string: ");
       String str = input.nextLine();
       str = str.toLowerCase();
       String output = "";
        Question_06_21 que21 = new Question_06_21();
       for (int i = 0; i < str.length(); i++){
           if (('a' <= str.charAt(i) && str.charAt(i) <= 'z')){
              output += que21.getNumber(str.charAt(i));
           }else{
               output += str.charAt(i);
           }
       }
        System.out.println(output);

    }
    public static int getNumber(char lowercaseLetter){
        if (lowercaseLetter == 'a' || lowercaseLetter == 'b' || lowercaseLetter == 'c' ){
            return 2;
        } else if (lowercaseLetter == 'd' || lowercaseLetter == 'e' || lowercaseLetter == 'f') {
            return 3;
        }else if (lowercaseLetter == 'g' || lowercaseLetter == 'h' || lowercaseLetter == 'i') {
            return 4;
        }else if (lowercaseLetter == 'j' || lowercaseLetter == 'k' || lowercaseLetter == 'l') {
            return 5;
        }else if (lowercaseLetter == 'm' || lowercaseLetter == 'n' || lowercaseLetter == 'o') {
            return 6;
        }else if (lowercaseLetter == 'p' || lowercaseLetter == 'q' || lowercaseLetter == 'r' || lowercaseLetter == 's') {
            return 7;
        }else if (lowercaseLetter == 't' || lowercaseLetter == 'u' || lowercaseLetter == 'v' ) {
            return 8;
        }else if (lowercaseLetter == 'w' || lowercaseLetter == 'x' || lowercaseLetter == 'y' || lowercaseLetter == 'z') {
            return 9;
        }else {
            return 0;
        }
    }
}
