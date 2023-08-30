package week_05.assigments;

public class Question_05_15 {
    public static void main(String[] args) {
        final int NUMBER_OF_CHAR_PER_LINE = 10;
        int count = 1;
        for (char ch = 33 ; ch <= 126 ; ch++ ){
          if (count % NUMBER_OF_CHAR_PER_LINE == 0){
              System.out.println(ch);
          }
          else {
              System.out.print(ch + " ");
          }
          count++;
        }

    }
}
