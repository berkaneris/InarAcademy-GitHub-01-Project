package week_05.assigments;

public class Question_05_40 {
    public static void main(String[] args) {
     int heads = 0;
     int tails = 0;
        for (int i = 0 ; i < 1000000 ; i ++){
         int number = (int)(Math.random() * 2); // flipping the coin process
         if (number == 0){
             heads++;
         }
         else {
             tails++;
         }
     }
        System.out.println("Heads are " + heads);
        System.out.println("Tails are " + tails);
    }
}
