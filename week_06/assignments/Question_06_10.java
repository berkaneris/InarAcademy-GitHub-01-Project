package week_06.assigments;

public class Question_06_10 {
    public static void main(String[] args) {
    final int NUMBER_PER_LINE = 10;
    int count = 0;
        for (int i = 2; i < 10000; i++){
        if(isPrime(i)){
            count++;
            if (count % NUMBER_PER_LINE == 0){
                System.out.println(i);
            }else{
                System.out.print(i + " ");
            }
        }
    }
        System.out.println();
        System.out.println("The number of prime numbers less than 10000 is: " + count);

    }
    public static boolean isPrime(int number) {
         for (int divisor = 2; divisor <= number / 2; divisor++) {
             if (number % divisor == 0) { // If true, number is not prime
                 return false; // Number is not a prime
             }
         }

         return true; // Number is prime
    }
}
