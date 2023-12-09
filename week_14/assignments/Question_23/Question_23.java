package week_14.assignments.Question_23;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Question_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the path of the text file: ");
        String filePath = input.next();
        File file = new File(filePath);

        try{
            Map<String , Integer> wordList = new TreeMap<>();
            input = new Scanner(file);
            while (input.hasNext()){
                String word = input.next();
                if(!wordList.containsKey(word)){
                    wordList.put(word , 1);
                }else{
                    int value = wordList.get(word);
                    value++;
                    wordList.put(word , value);
                }
            }
            for (Map.Entry<String , Integer> entries: wordList.entrySet()) {
                if(entries.getValue() == 1){
                    System.out.println(entries.getKey());
                }
            }

        }catch (IOException ex){
            System.out.println("This file is not found.");
        }
    }
}
