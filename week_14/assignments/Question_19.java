package week_14.assignments;

import java.util.*;

public class Question_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Dna Sequence: ");
        String dna = input.next();
        Map<String,Integer> sequences = new LinkedHashMap<>();
        for(int i = 0; i < dna.length() - 4; i++){
            addSequence(sequences , dna.substring(i , i+5));
        }
        List<String> sqn = new ArrayList<>();
        for (Map.Entry<String,Integer> entries: sequences.entrySet()) {
            if(entries.getValue() > 1){
                sqn.add(entries.getKey());
            }
        }
        System.out.println("Repeated 5-letter sequences: " + sqn);

    }
    public static void addSequence(Map<String,Integer> sequences , String subStr){
        if(!sequences.containsKey(subStr)){
            sequences.put(subStr , 1);
        }else{
            int count = sequences.get(subStr);
            count++;
            sequences.put(subStr , count);
        }
    }


}
