package week_05.assigments;

public class Question_05_19 {
    public static void main(String[] args) {
        int line = 32;

        for (int i = 0 ; i <= 7 ;i ++){
            System.out.printf("%" + line + "s" , "");
            line -= 4;
            for (int k = 0  ; k <= i  ; k ++ ){
                System.out.printf("%4d" ,(int)Math.pow(2 , k) );
            }
            for (int l = i ; 1 <= l ; l --) {
                System.out.printf("%4d" ,(int) Math.pow(2, l - 1) );
            }
            System.out.println();
        }
    }
}
