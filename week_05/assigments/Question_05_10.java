package week_05.assigments;

public class Question_05_10 {
    public static void main(String[] args) {
        final int NUMBER_OF_PRIMES_PER_LINE = 10; // Display 10 per line
        int count = 0;
        System.out.println("The numbers from 100 to 1,000, ten per line, that are divisible by 5 and 6:");

        for (int number = 120 ; number < 1000 ; number += 30) {
            count++;
            if (count % NUMBER_OF_PRIMES_PER_LINE == 0){
                System.out.println(number);
            }else{
                System.out.print(number + " ");
            }
        }

    }
}
