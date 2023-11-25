package week_06.assigments;

import java.util.Scanner;

public class Question_06_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String password = input.nextLine();
        if (checkPassword(password)){
            System.out.println("Valid Password");
        }
        else{
            System.out.println("Invalid Password");
        }
    }
    public static boolean checkPassword (String str){
        int digit = 0;
        // A password must have at least eight characters.
        if (str.length() < 8){
           return false;
        }
        //A password consists of only letters and digits.
        for (int i = 0; i < str.length(); i++){
            if ( 'A' > str.charAt(i) && str.charAt(i) > 'Z' || 'a' > str.charAt(i) && str.charAt(i) > 'z'
                    || '0' > str.charAt(i) && str.charAt(i) > '9'){
              return false;
            }
        }
        //A password must contain at least two digits.
        for (int i = 0; i < str.length(); i++) {
            if ('0' <= str.charAt(i) && str.charAt(i) <= '9') {
                digit++;
                if (digit == 2) {return true;}
            }
        }
        return false;
    }
}
