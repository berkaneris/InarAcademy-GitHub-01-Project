package week_14.assignments;

import java.util.*;

public class Question_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> words = new ArrayList<>();

        System.out.print("Enter words (enter -1 to finish):");
        String word = "";
        do{
            word = input.next();
            if(!word.equals("-1")){
                words.add(word);
            }
        }while(!word.equals("-1"));


        List<List<String>> anagramGroups = groupAnagrams(words);

        System.out.println("Original list of words: " + words);
        System.out.println("Anagram groups: " + anagramGroups);
    }
    public static List<List<String>> groupAnagrams(List<String> words) {
        Map<String, List<String>> anagramMap = new HashMap<>();

        // Group words by their sorted character order
        for (int i = 0; i < words.size(); i++) {
            char[] charArray = words.get(i).toCharArray();
            Arrays.sort(charArray);
            String sortedWord = new String(charArray);

            // Add the word to the corresponding anagram group
            if (anagramMap.containsKey(sortedWord)) {
                anagramMap.get(sortedWord).add(words.get(i));
            } else {
                List<String> group = new ArrayList<>();
                group.add(words.get(i));
                anagramMap.put(sortedWord, group);
            }
        }

        // Convert the values of the map to a List to return
        return new ArrayList<>(anagramMap.values());
    }

}
