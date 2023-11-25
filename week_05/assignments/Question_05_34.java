package week_05.assigments;

import java.util.Scanner;

public class Question_05_34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int winComputer = 0;
        int winUser = 0;
        boolean control = true;

        while(control) {

            System.out.print("scissor (0), rock (1), paper (2): ");
            int selectedNumber = input.nextInt();
            int generatedNumber = (int) (Math.random() * 3);


            if (selectedNumber == 0 && generatedNumber == 2) {
                System.out.println("The computer is paper.You are scissor.You won");
                winUser++;
            } else if (selectedNumber == 0 && generatedNumber == 1) {
                System.out.println("The computer is rock.You are scissor.You lose");
                winComputer++;
            } else if (selectedNumber == 0 && generatedNumber == 0) {
                System.out.println("The computer is scissor.You are scissor too.It is a draw");
            } else if (selectedNumber == 1 && generatedNumber == 0) {
                System.out.println("The computer is scissor.You are rock.You won");
                winUser++;
            } else if (selectedNumber == 1 && generatedNumber == 2) {
                System.out.println("The computer is paper.You are rock.You lose");
                winComputer++;
            } else if (selectedNumber == 1 && generatedNumber == 1) {
                System.out.println("The computer is rock.You are rock too.It is a draw");
            } else if (selectedNumber == 2 && generatedNumber == 0) {
                System.out.println("The computer is scissor.You are paper.You lose");
                winComputer++;
            } else if (selectedNumber == 2 && generatedNumber == 1) {
                System.out.println("The computer is rock.You are paper.You won");
                winUser++;
            } else if (selectedNumber == 2 && generatedNumber == 2) {
                System.out.println("The computer is paper.You are paper too.It is a draw");
            } else {
                System.out.println("You enter an invalid value.");
            }
            System.out.println("Computer: " + winComputer + " - " + "You: " + winUser);
            if((winComputer - winUser) == 2){
                System.out.println("Computer won the game");
                control = false;
            }else if((winUser - winComputer) == 2){
                System.out.println("You won the game");
                control = false;
            }
        }
    }
}
