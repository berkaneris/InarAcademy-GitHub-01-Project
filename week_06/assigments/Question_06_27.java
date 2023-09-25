package week_06.assigments;

public class Question_06_27 {
    public static void main(String[] args) {
        final int NUMBER_OF_PER_LINES = 10;
        final int NUMBER_OF_PRIME = 100;
        int count = 0;
        int number = 2;
        while (count < NUMBER_OF_PRIME){
            if (isEmirp(number)){
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
    public static boolean isEmirp (int number){
        if(Question_06_26.isPrimeNumber(number)) {
            String num = number + "";
            String reverseNum = "";
            for (int i = num.length() - 1; i >= 0; i--) {
                reverseNum += num.charAt(i);
            }
            if (Question_06_26.isPrimeNumber(Integer.parseInt(reverseNum)) && !(Question_06_26.isPalindromic(Integer.parseInt(reverseNum)))) {
                return true;
            } else {
                return false;
            }
        }
        else{
            return false;
        }
    }
}
