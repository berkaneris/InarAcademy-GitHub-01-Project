package week_12.assigments.Question_12_17;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Question_12_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String yesOrNo = "y";
        String word;
        char[] guessWord;


        while (yesOrNo.equalsIgnoreCase("y")) {
            try {

                // select a word from String array
                word = selectWord();

                // create an array for the guessed letter
                guessWord = new char[word.length()];


                // count the misses
                int countMiss = 0;
                Arrays.fill(guessWord, '*');

                int count = 0;
                while (count < guessWord.length) {
                    printWord(guessWord);

                    // take the guessed letter from user
                    String str = input.next();
                    char letter = Character.toLowerCase(str.charAt(0));

                    // check the letter
                    if (isInWord(letter, word) && !isInArray(letter, guessWord)) {
                        for (int i = 0; i < word.length(); i++) {
                            if (letter == word.charAt(i)) {
                                guessWord[i] = letter;
                                count++;
                            }
                        }
                    } else if (isInArray(letter, guessWord)) {
                        System.out.println("     " + letter + " is already in the word");
                    } else {
                        System.out.println("     " + letter + " is not in the word");
                        countMiss++;

                    }
                }
                System.out.println("The word is " + word + ". You missed " + countMiss + " time");
                System.out.println("Do you want to guess another word? Enter y or n > ");
                yesOrNo = input.next();
            } catch (IOException ex) {
                System.out.println("This is an exception");
            }
        }
    }

    public static String selectWord() throws IOException {
        ArrayList<String> list = new ArrayList<>();

        File file = new File("C:\\Users\\asus\\workspace\\inar-java\\src\\week_12\\assigments\\Question_12_17\\hangman.txt");
        Scanner input = new Scanner(file);

        while (input.hasNext()) {
            list.add(input.next());
        }
        input.close();

        int number = (int) (Math.random() * list.size());


        return list.get(number);
    }

    public static void printWord(char[] ch) {
        System.out.print("(Guess) Enter a letter in word ");
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]);
        }
        System.out.print(" > ");
    }

    public static boolean isInWord(char ch, String word) {
        boolean isIn = false;
        for (int i = 0; i < word.length(); i++) {
            if (ch == word.charAt(i)) {
                isIn = true;
                return isIn;
            }
        }
        return isIn;
    }

    public static boolean isInArray(char ch, char[] array) {
        boolean isIn = false;
        for (int i = 0; i < array.length; i++) {
            if (ch == array[i]) {
                isIn = true;
            }
        }
        return isIn;
    }


}
