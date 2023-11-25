package week_05.assigments;

public class Question_05_33 {
    public static void main(String[] args) {
        System.out.println("The perfect numbers less than 10000 are");
        for(int i = 2; i < 10000 ; i++){
              int number = 0;
              for (int k = 1 ; k <= (i / 2) ; k++){
                  if (i % k == 0){
                      number += k;
                  }
              }
              if(number == i){
                  System.out.println(i);
              }
          }
    }
}
