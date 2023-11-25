package week_11.assigments;

import week_10.Loan;
import week_11.Circle;

import java.util.ArrayList;
import java.util.Date;

public class Question_11_06 {
    public static void main(String[] args) {
        ArrayList<Object> objects = new ArrayList<>();
        Loan loan = new Loan(2.5,1,1000);
        Date date = new Date();
        String str = new String("InarAcademy");
        Circle circle = new Circle();
        objects.add(loan);
        objects.add(date);
        objects.add(str);
        objects.add(circle);

        for (int i = 0; i < objects.size(); i++) {
            System.out.println(objects.get(i).toString());
            System.out.println("-----------------------");
        }
    }
}
