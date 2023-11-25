package week_06.assigments;

public class Question_06_28 {
    public static void main(String[] args) {
        System.out.println("p                    2^p-1");
        System.out.println("------------------------------");
        for (int i = 2; i <= 31; i++){
            if (isMersennePrime(i)){
                System.out.printf("%-21d%-5d" , i , (int)(Math.pow(2 , i) - 1));
                System.out.println();
            }
        }
    }
    public static boolean isMersennePrime (int number){
        int checkNum = (int)(Math.pow(2 , number) - 1);
        if (Question_06_26.isPrimeNumber(checkNum) && Question_06_26.isPrimeNumber(number)){
            return true;
        }
        else{
            return false;
        }
    }
}
