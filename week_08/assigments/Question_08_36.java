package week_08.assigments;

import java.util.Scanner;

public class Question_08_36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number n: ");
        int number = input.nextInt();
        String [][] letters = new String[number][number];

        System.out.println("Enter " + number + " rows of letters separated by spaces:");

        for(int row = 0; row < letters.length; row++){
            for(int column = 0; column < letters[row].length; column++){
                letters[row][column] = input.next().toUpperCase();
                if(!isLengthOne(letters[row][column])){
                    System.out.println("You entered invalid input.");
                    System.exit(1);
                }
                if(!(65 <= letters[row][column].charAt(0) && letters[row][column].charAt(0) < (65 + number))){
                    System.out.println("Wrong input: the letters must be from A to " + (char)(64 + number) );
                    System.exit(1);
                }
            }
        }
        System.out.print("The input array is ");
        if(isLettersUniqueInRows(letters) && isLettersUniqueInColumns(letters)){
            System.out.println("a Latin square");
        }else{
            System.out.println("not a Latin square");
        }
    }
    public static boolean isLengthOne(String str){
        if(str.length() != 1){
            return false;
        }
        return true;
    }
    public static boolean isLettersUniqueInRows(String [][] letters){

        for(int row = 0; row < letters.length; row++){
            int [] count = new int[letters.length];
            for(int column = 0; column < letters[row].length; column++){
                int number = letters[row][column].charAt(0) - 65;
                count[number]++;
            }
            for(int i = 0; i < count.length; i++){
                if(count[i] != 1){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean isLettersUniqueInColumns(String [][] letters){
        for(int column = 0; column < letters[0].length; column++){
            int [] count = new int[letters.length];
            for(int row = 0; row < letters.length; row++){
                int number = letters[row][column].charAt(0) - 65;
                count[number]++;
            }
            for(int i = 0; i < count.length; i++){
                if(count[i] != 1){
                    return false;
                }
            }
        }
        return true;
    }

}
