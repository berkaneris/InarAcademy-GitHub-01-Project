package week_10.assigments;

import java.util.Arrays;

public class Question_10_25 {
    public static void main(String[] args) {

        String [] strings = split("?Java#inar#aca#demy!", "#!");
        System.out.print("[");
        for (int i = 0; i < strings.length; i++) {
            if(i != strings.length - 1){
                System.out.print(strings[i] + ", ");
            }else{
                System.out.print(strings[i]);
            }
        }
        System.out.print("]");
    }
    public static String[] split(String s, String regex){
        String [] splittedString = new String[s.length()];
        Arrays.fill(splittedString , "");
        int count = 0;
        int beginIndex = 0;



        for(int i = 0; i < s.length(); i++){
            for(int k = 0; k < regex.length(); k++){
                if(s.charAt(i) == regex.charAt(k)){
                    if(beginIndex != i) {
                        splittedString[count++] = s.substring(beginIndex, i);
                    }
                    beginIndex = i + 1;
                }
            }
        }

        if(beginIndex != s.length()) {
            splittedString[count++] = s.substring(beginIndex);
        }
        String [] newSplittedString = new String[count];

        System.arraycopy(splittedString , 0 , newSplittedString , 0 , newSplittedString.length);

        return newSplittedString;
    }
}
