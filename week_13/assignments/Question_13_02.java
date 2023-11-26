package week_13.assignments;

import java.util.ArrayList;


public class Question_13_02 {
    public static void main(String[] args) {

        ArrayList<Number> list = new ArrayList<>();

        while (list.size() < 7) {
            double num = (int)((Math.random() * 100) * 100) / 100.0;
            if (!list.contains(num)) {
                list.add(num);
            }
        }

        System.out.println("Before shuffle..\n" + list);
        shuffle(list);
        System.out.println("After shuffle..\n" + list);

    }

    public static void shuffle(ArrayList<Number> list) {

        for (int i = 0; i < list.size(); i++) {
            // Generate an index randomly
            int index = (int) (Math.random() * list.size());
            Number temp = list.get(i);
            list.add(i, list.get(index));
            list.remove(i + 1);
            list.add(index, temp);
            list.remove(index + 1);

        }
    }

}
