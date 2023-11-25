package week_12.assigments.Question_12_09;

import java.util.Scanner;

public class BinaryToDecWithException2 {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a binary number: ");
        try {
            String bin = input.nextLine();
            System.out.println("The decimal value for binary number "
                    + bin + " is " + binToDecimal(bin));
        }catch (BinaryFormatException ex){
            System.out.println(ex);
        }
    }
    public static int binToDecimal(String bin) throws BinaryFormatException{
        int decimalNumber = 0;

        for(int i = 0; i < bin.length(); i++){
            if(bin.charAt(i) != '0' && bin.charAt(i) != '1'){
                throw new BinaryFormatException("It is not a binary string.!");
            }
            decimalNumber += Integer.parseInt(bin.charAt(i) + "") * (int)(Math.pow(2 , bin.length() - 1 - i));
        }
        return decimalNumber;
    }
}

