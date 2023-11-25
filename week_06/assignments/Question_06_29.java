package week_06.assigments;

public class Question_06_29 {
    public static void main(String[] args) {
        for (int i = 2; i + 2 < 1000; i++){
            if(isTwinPrimes(i)){
                System.out.println("(" + i + ", " + (i + 2) + ")");
            }
        }
    }
    public static boolean isTwinPrimes (int number){
        if(Question_06_26.isPrimeNumber(number) && Question_06_26.isPrimeNumber(number + 2)){
            return true;
        }else{
            return false;
        }
    }
}
