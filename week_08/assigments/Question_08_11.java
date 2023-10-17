package week_08.assigments;

import java.util.Scanner;

public class Question_08_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 511: ");
        int number = input.nextInt();
        String binaryNumber = findBinaryValue(number);

        char [][] matrix = new char[3][3];
        int count = 0;
        for(int row = 0; row < matrix.length; row++){
            for(int column = 0; column < matrix[row].length; column++){
                if(binaryNumber.charAt(count) == '0'){
                    matrix[row][column] = 'H';
                }else{
                    matrix[row][column] = 'T';
                }
                count++;
            }
        }
        for(int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }

    }
    public static String findBinaryValue(int number){
        String binary = "";
        while (number >= 2){
            binary = (number % 2) + binary;
            number /= 2;
        }
        binary = number + binary;

        if(binary.length() < 9){
            for(int i = binary.length(); i < 9; i++){
                binary = "0" + binary;
            }
        }
        return binary;
    }
}
