package week_04.assigments;

public class Question_04_25 {
    public static void main(String[] args) {
        char ch = (char) (int) (Math.random() * 26 + 65);
        char ch1 = (char) (int) (Math.random() * 26 + 65);
        char ch2 = (char) (int) (Math.random() * 26 + 65);
        int number = (int) (Math.random() * 9000 + 1000) ;
        System.out.println("The plate number is " + ch + ch1 + ch2 + number );
    }
}
