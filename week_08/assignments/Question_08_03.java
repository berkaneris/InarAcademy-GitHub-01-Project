package week_08.assigments;


public class Question_08_03 {
    public static void main(String[] args) {

        // Students' answers to the questions
        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

        // Key to the questions
        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        int [] correctForStudent = new int[answers.length];
        String [] nameStudent = new String[answers.length];

        // Grade all answers
        for (int i = 0; i < answers.length; i++) {
            // Grade one student
            int correctCount = 0;
            for (int j = 0; j < answers[i].length; j++) {
                if (answers[i][j] == keys[j])
                    correctCount++;
            }
            correctForStudent[i] = correctCount;
            nameStudent[i] = "Student " + i;
        }
        printSortedList(correctForStudent , nameStudent);

    }
    public static void printSortedList (int [] array , String [] name){
        for (int i = 0; i < array.length - 1; i++) {
            // Find the minimum in the list[i...list.length-1]
            int currentMin = array[i];
            int currentMinIndex = i;
            String currentMinName = name[i];

            for (int j = i + 1; j < array.length; j++) {
                if (currentMin > array[j]) {
                    currentMin = array[j];
                    currentMinName = name[j];
                    currentMinIndex = j;
                }
            }

            // Swap list[i] with list[currentMinIndex] if necessary
            if (currentMinIndex != i) {
                array[currentMinIndex] = array[i];
                name[currentMinIndex] = name[i];
                array[i] = currentMin;
                name[i] = currentMinName;
            }
        }
        for (int i = 0; i < array.length; i++){
            System.out.println(name[i] + "'s correct count is " + array[i]);
        }
    }
}
