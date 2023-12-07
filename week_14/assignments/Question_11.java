package week_14.assignments;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class Question_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Java source code file name: ");
        String fileName = input.next();
        File file = new File(fileName);
        try {
              input = new Scanner(file);
              boolean isFileValid = true;
            Stack<Character> symbols = new Stack<>();
            while (input.hasNext()){
                String str = input.nextLine();
                if(!isCorrectSymbols(str , symbols)){
                    isFileValid = false;
                    break;
                }
            }
            if(isFileValid && symbols.size() == 0){
                System.out.println("The source code has correct pairs of grouping symbols.");
            }else{
                System.out.println("The source code has not correct pairs of grouping symbols.");
            }
        }catch (IOException ex){

        }
    }
    public static boolean isCorrectSymbols(String str , Stack<Character> symbols){
        Map<Character , Character> groupingSymbols = new HashMap<>();
        groupingSymbols.put('(' , ')');
        groupingSymbols.put('{' , '}');
        groupingSymbols.put('[' , ']');

        for(int i = 0; i < str.length(); i++){
            if(groupingSymbols.containsKey(str.charAt(i))){
                symbols.push(str.charAt(i));
            }else if(groupingSymbols.containsValue(str.charAt(i))){
                if(groupingSymbols.get(symbols.pop()) != str.charAt(i)){
                 return false;
                }
            }
        }
        return true;
    }
}
