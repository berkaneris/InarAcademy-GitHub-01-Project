package week_12.assignments;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Question_12_29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a filename: ");
        String fileName = input.nextLine();
        File file = new File(fileName);
        int [] countLetters = new int[26];
        try{
            input = new Scanner(file);
            while (input.hasNext()){
              String line = input.nextLine();
              for(int i = 0; i < line.length(); i++){
                  if(Character.isLetter(line.charAt(i))){
                      countLetters[Character.toUpperCase(line.charAt(i)) - 'A']++;
                  }
              }
            }
            for(int i = 0; i < countLetters.length; i++){
                System.out.println("Number of " + (char)(65 + i) + "'s: " + countLetters[i]);
            }
        }catch (IOException ex){
            System.out.println("This is an exception");
        }
    }
}
