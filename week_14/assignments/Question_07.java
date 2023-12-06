package week_14.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question_07 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < 10; i++){
            list.add((int)(Math.random() * 100));
        }
        System.out.println("Generated List: " + list);
        int k = (int)(Math.random() * 10 + 1);
        System.out.println("What is the " + k + ". greatest number");
        Collections.sort(list);
        Collections.reverse(list);
        System.out.println("The " + k + "th largest element is: " + list.get(k - 1));
    }
}
