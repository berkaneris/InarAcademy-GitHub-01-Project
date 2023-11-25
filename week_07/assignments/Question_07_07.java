package week_07.assigments;

public class Question_07_07 {
    public static void main(String[] args) {
      int [] counts = new int[10];
      for (int i = 0; i < 100; i++){
          int number = (int)(Math.random() * 10);
          counts[number]++;
      }
        System.out.println("Count for each number between 0 and 9:");
      for(int i = 0; i < counts.length; i++){
          System.out.println( i + "s: " + counts[i]);
      }
    }
}
