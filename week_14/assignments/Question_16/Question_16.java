package week_14.assignments.Question_16;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the file path:");
        String filePath = input.next();

        File file = new File(filePath);
        try {
            input = new Scanner(file);
            Map<String, Integer> wordList = new HashMap<>();
            while (input.hasNext()) {
                String text = input.nextLine();
                String[] words = text.split("[\\s\\p{Punct}]+");
                countWords(words, wordList);
            }

            printWordList(wordList);

        } catch (IOException ex) {
            System.out.println("This file is not found.");
        }


    }

    public static void countWords(String[] words, Map<String, Integer> wordList) {
        for (int i = 0; i < words.length; i++) {
            String word = words[i].toLowerCase();
            if (word.length() > 0 && Character.isLetter(word.charAt(0))) {
                if (!wordList.containsKey(word)) {
                    wordList.put(word, 1);
                } else {
                    int count = wordList.get(word);
                    count++;
                    wordList.put(word, count);
                }
            }
        }
    }
    public static void printWordList(Map<String , Integer> wordlist){
        System.out.println("Word count:");
        for (Map.Entry<String , Integer> entries: wordlist.entrySet()) {
            System.out.println(entries.getKey() + ": " + entries.getValue());
        }
    }
}
