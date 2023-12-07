package week_14.assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


public class Question_13 {
    public static void main(String[] args) {
        List<Integer> arraylist = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            arraylist.add((int)(Math.random() * 3));
        }
        System.out.println("Generated integers: " + arraylist);
        System.out.println("Elements appearing more than n/3 times: " + findElements(arraylist));
    }
    public static List<Integer> findElements(List<Integer> arraylist){
        Map<Integer , Integer> list = new TreeMap<>();
        List<Integer> result = new ArrayList<>();

        for(int i = 0; i < arraylist.size(); i++){
            if(!list.containsKey(arraylist.get(i))){
                list.put(arraylist.get(i) , 1);
            }else{
               int count = list.get(arraylist.get(i));
               count++;
               list.put(arraylist.get(i) , count);
            }
        }
        for(Map.Entry<Integer , Integer> entries : list.entrySet()){
            if(entries.getValue() > (arraylist.size() / 3)){
                result.add(entries.getKey());
            }
        }
        return result;
    }
}
