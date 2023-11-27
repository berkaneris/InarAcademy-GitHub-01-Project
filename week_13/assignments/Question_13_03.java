package week_13.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Question_13_03 {
    public static void main(String[] args) {

        ArrayList<Number> list = new ArrayList<>();
        list.add(1);
        list.add(1.5);
        list.add(10);
        list.add(1.53);
        list.add(5);
        list.add(12.5);
        list.add(65);
        System.out.println(list);
        sort(list);
        System.out.println(list);;



    }
    public static void sort(ArrayList<Number> list){

        for(int i = 0; i < list.size() - 1; i++){
            Number currentMin = list.get(i);
            int currentMinIndex = i;

            for(int k = i + 1; k < list.size(); k++){
                if(currentMin.doubleValue() > list.get(k).doubleValue()){
                    currentMin = list.get(k);
                    currentMinIndex = k;
                }
            }
            if(currentMinIndex != i){
                list.remove(currentMinIndex);
                list.add(currentMinIndex , list.get(i));
                list.remove(i);
                list.add(i, currentMin);
            }

        }

    }
}
