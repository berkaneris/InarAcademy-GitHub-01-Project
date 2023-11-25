package week_03.assigments;

import java.util.Scanner;

public class Question_03_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("scissor (0), rock (1), paper (2): ");
        int selectedNumber = input.nextInt();
        int generatedNumber = (int)(Math.random() * 3);

        if (selectedNumber == 0 && generatedNumber == 2){
            System.out.println("The computer is paper.You are scissor.You won");
        }
        else if (selectedNumber == 0 && generatedNumber == 1){
            System.out.println("The computer is rock.You are scissor.You lose");
        }
        else if (selectedNumber == 0 && generatedNumber == 0){
            System.out.println("The computer is scissor.You are scissor too.It is a draw");
        }
        else if (selectedNumber == 1 && generatedNumber == 0){
            System.out.println("The computer is scissor.You are rock.You won");
        }
        else if (selectedNumber == 1 && generatedNumber == 2){
            System.out.println("The computer is paper.You are rock.You lose");
        }
        else if (selectedNumber == 1 && generatedNumber == 1){
            System.out.println("The computer is rock.You are rock too.It is a draw");
        }
        else if (selectedNumber == 2 && generatedNumber == 0){
            System.out.println("The computer is scissor.You are paper.You lose");
        }
        else if (selectedNumber == 2 && generatedNumber == 1){
            System.out.println("The computer is rock.You are paper.You win");
        }
        else if (selectedNumber == 2 && generatedNumber == 2){
            System.out.println("The computer is paper.You are paper too.It is a draw");
        }
        else {
            System.out.println("You enter an invalid value.");
        }

    }
}
