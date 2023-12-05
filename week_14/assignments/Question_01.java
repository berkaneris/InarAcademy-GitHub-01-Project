package week_14.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question_01 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            list.add((int)(Math.random() * 100));
        }
        System.out.println("Generated integers: " + list);
        Collections.reverse(list);
        System.out.println("Reversed list: " + list);
    }
}
