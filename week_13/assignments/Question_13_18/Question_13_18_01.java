package week_13.assignments.Question_13_18;

import week_13.Rational;

public class Question_13_18_01 {
    public static void main(String[] args) {
        Rational rational = new Rational(1,2);

        for(int i = 2; i <= 99; i++){
            rational = rational.add(new Rational(i , i + 1));
        }
        System.out.println(rational);
    }
}
