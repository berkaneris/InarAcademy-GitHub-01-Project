package week_06.assigments;

public class Question_06_01 {
    public static void main(String[] args) {
        final int NUMBERS_PER_LINE = 10;
        for (int i = 1 ; i <= 100 ; i++){
            if (i % NUMBERS_PER_LINE == 0){
                System.out.println(getPentagonalNumber(i));
            }else{
                System.out.print(getPentagonalNumber(i) + " ");
            }
        }

    }
    public static int getPentagonalNumber (int n){
        return n * (3 * n - 1) / 2;
    }
}
