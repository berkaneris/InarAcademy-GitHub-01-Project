package week_06.assigments;

public class Question_06_26 {
    public static void main(String[] args) {
     final int NUMBER_OF_PER_LINES = 10;
     final int NUMBER_OF_PRIME = 100;
     int count = 0;
     int number = 2;
     while (count < NUMBER_OF_PRIME){
         if (isPrimeNumber(number) && isPalindromic(number)){
             count++;
             if (count % NUMBER_OF_PER_LINES == 0){
                 System.out.println(number);
             }else{
                 System.out.print(number + " ");
             }
         }
         number++;
     }
    }
    public static boolean isPrimeNumber (int number){
        int count = 0;
        for (int i = 2; i <= (number / 2); i++){
            if (number % i == 0){
                count++;
            }
        }
        return count == 0;
    }
    public static boolean isPalindromic (int number){
        String num = number + "";
        boolean isPalindrome = true;
        for(int i = 0 , k = num.length() - 1 ; k > i ; i++ , k--){
            if (num.charAt(i) != num.charAt(k)){
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }
}
