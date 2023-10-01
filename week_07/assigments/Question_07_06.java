package week_07.assigments;

public class Question_07_06 {
    public static void main(String[] args) {
     int [] primeNumbers = new int[50];
     primeNumbers[0]=2;
     int number = 3;
     int i =1;
     while ( i < primeNumbers.length){
          boolean isPrime = true;
         for (int k = 0; primeNumbers[k] <= Math.sqrt(number); k++ ){
               if (number % primeNumbers[k] == 0){
                   isPrime = false;
                   break;
               }
         }
         if(isPrime){
             primeNumbers[i] = number;
             i++;
         }
         number++;
     }
     for ( i = 0; i < primeNumbers.length; i++){
         if (i % 10 == 9 )
         System.out.printf("%5d\n" , primeNumbers[i]);
         else
             System.out.printf("%5d" , primeNumbers[i]);
     }
    }

}
