package week_12.assigments;

import java.util.ArrayList;

public class Question_12_10 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        int i = 1;
        boolean isEmpty = true;
        while (isEmpty) {
            try {
                String word = new String(i + "Ali");
                i++;
                list.add(word);
            } catch (OutOfMemoryError ex) {
                System.out.println("OutOfMemoryException occurs! : Java heap space");
                isEmpty = false;
            }
        }
    }
}
