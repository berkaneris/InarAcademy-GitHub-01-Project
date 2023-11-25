package week_12.assigments.Question_12_04;

public class Question_12_04 {
    public static void main(String[] args) {
        try {
            LoanWithException loan = new LoanWithException(3.5 , 5 , 0);
        }catch (IllegalArgumentException ex){
            System.out.println("Wrong input! Please greater than 0 (zero)");
        }
    }
}
