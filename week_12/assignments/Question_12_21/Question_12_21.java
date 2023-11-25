package week_12.assigments.Question_12_21;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Question_12_21 {
    public static void main(String[] args) {
       File file = new File("C:\\Users\\asus\\workspace\\inar-java\\src\\week_12\\assigments\\Question_12_21\\SortedStrings");
       if(!file.exists()){
           System.out.println("There is no file");
           System.exit(1);
       }
       try{
           ArrayList<String> list = new ArrayList<>();
           ArrayList<String> newList = new ArrayList<>();
           Scanner input = new Scanner(file);
           while (input.hasNext()){
               list.add(input.next());
               newList.add("");
           }
           input.close();

           Collections.copy(newList , list);
           Collections.sort(newList);


           ArrayList<Integer> notSortedWords = new ArrayList<>();
           for(int i = 0; i < list.size(); i++){
               if(!list.get(i).equals(newList.get(i))){
                   notSortedWords.add(i);
               }if(notSortedWords.size() == 2){
                   break;
               }
           }
           System.out.println("File\n" + file.getAbsolutePath());
           if(notSortedWords.isEmpty()){
               System.out.println("The list is sorted");
           }else{
               System.out.println("The strings " + notSortedWords.get(0) + " and " + notSortedWords.get(1) + " are out of order");
           }

       }catch (IOException ex){
           System.out.println("There is an error");
       }
    }
}
