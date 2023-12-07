package week_14.assignments;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Question_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.next();
        int result = findFirstNonRepeatingCharacter(str);
        if(result != -1){
            System.out.printf("The first non-repeating character is '%c' : %d. character of the string" , str.charAt(result) , (result + 1));
        }else{
            System.out.println("The all characters are repeating");
        }


    }
    public static Integer findFirstNonRepeatingCharacter (String str){
        Integer index = -1;
        Map<Character , Integer> list = new LinkedHashMap<>();
        for(int i = 0; i < str.length(); i++){
            if(!list.containsKey(str.charAt(i))){
                list.put(str.charAt(i) , 1);
            }else{
                int count = list.get(str.charAt(i));
                count++;
                list.put(str.charAt(i) , count);
            }
        }
        for (int i= 0; i < str.length(); i++) {
            if(list.get(str.charAt(i)) == 1){
            index = i;
            break;
            }
        }
        return index;

    }
}
