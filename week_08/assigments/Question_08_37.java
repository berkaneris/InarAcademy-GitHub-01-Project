package week_08.assigments;

import java.util.Scanner;

public class Question_08_37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [][] statesAndCapitals = {{"Alabama" , "Montgomery"} , {"Alaska" , "Juneau"} , {"Arizona" , "Phoenix"},
                                         {"Arkansas" , "Little Rock"} , {"California" , "Sacramento"} , {"Colorado" , "Denver"},
                                         {"Connecticut" , "Hartford"} , {"Delaware" , "Dover"} , {"Florida" , "Tallahassee"},
                                         {"Georgia" , "Atlanta"} , {"Hawaii" , "Honolulu"} , {"Idaho" , "Boise"}};

        int correctCount = 0;
        for(int i = 0; i < statesAndCapitals.length; i++){
            System.out.print("What is the capital of " + statesAndCapitals[i][0] + "? ");
            String answer = input.nextLine();
            if(answer.equalsIgnoreCase(statesAndCapitals[i][1])){
                System.out.println("Your answer is correct");
                correctCount++;
            }else{
                System.out.println("The correct answer should be " + statesAndCapitals[i][1] );
            }
        }
        System.out.println("The correct count is " + correctCount);
    }
}
