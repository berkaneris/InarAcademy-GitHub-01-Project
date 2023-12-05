package week_14.assignments;

import java.util.*;

public class Question_02 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < 50; i++){
            list.add((int)(Math.random() * 100));
        }
        System.out.println("Generated Arraylist:\n" + list);

        Set<Integer> list1 = new TreeSet<>(list);
        list = new ArrayList<>(list1);

        System.out.println("ArrayList after removing duplicates:\n " + list);
    }
}
