package week_03.assigments;



public class Question_03_24 {
    public static void main(String[] args) {
        int rank = (int)(Math.random() * 13 + 1); // Generate number for (Ace, 2, 3, 4, 5, 6, 7, 8, 9, 10, Jack, Queen, King)
        int suit = (int)(Math.random() * 4 + 1); // Generate number for  (Clubs, Diamonds, Hearts, Spades)

        if (suit == 1 ) {
            if (rank == 1){
                System.out.println("The card you picked is Ace of Clubs ");
            }
            else if (rank == 11){
                System.out.println("The card you picked is Jack of Clubs ");
            }
            else if (rank == 12){
                System.out.println("The card you picked is Queen of Clubs ");
            }
            else if (rank == 13){
                System.out.println("The card you picked is King of Clubs ");
            }
            else {
                System.out.println("The card you picked is " + rank + " of Clubs");
            }
        }
        else if (suit == 2 ) {
            if (rank == 1){
                System.out.println("The card you picked is Ace of Diamonds ");
            }
            else if (rank == 11){
                System.out.println("The card you picked is Jack of Diamonds ");
            }
            else if (rank == 12){
                System.out.println("The card you picked is Queen of Diamonds ");
            }
            else if (rank == 13){
                System.out.println("The card you picked is King of Diamonds ");
            }
            else {
                System.out.println("The card you picked is " + rank + " of Diamonds");
            }
        }
        else if (suit == 3 ) {
            if (rank == 1){
                System.out.println("The card you picked is Ace of Hearts ");
            }
            else if (rank == 11){
                System.out.println("The card you picked is Jack of Hearts ");
            }
            else if (rank == 12){
                System.out.println("The card you picked is Queen of Hearts ");
            }
            else if (rank == 13){
                System.out.println("The card you picked is King of Hearts ");
            }
            else {
                System.out.println("The card you picked is " + rank + " of Hearts");
            }
        }
        else if (suit == 4 ) {
            if (rank == 1){
                System.out.println("The card you picked is Ace of Spades ");
            }
            else if (rank == 11){
                System.out.println("The card you picked is Jack of Spades ");
            }
            else if (rank == 12){
                System.out.println("The card you picked is Queen of Spades ");
            }
            else if (rank == 13){
                System.out.println("The card you picked is King of Spades ");
            }
            else {
                System.out.println("The card you picked is " + rank + " of Spades");
            }
        }

    }
}
