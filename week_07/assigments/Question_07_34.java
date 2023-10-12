package week_07.assigments;

import java.util.Arrays;
import java.util.Scanner;

public class Question_07_34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        System.out.println(sort(str));
    }
    public static String sort(String s){
      char [] array = new char[s.length()];
      for (int i = 0; i < array.length; i++){
          array[i] = s.charAt(i);
      }
        Arrays.sort(array);
      String newStr = "";
      for(int i = 0; i < array.length; i++){
          newStr += array[i];
      }
      return newStr;
    }
}
