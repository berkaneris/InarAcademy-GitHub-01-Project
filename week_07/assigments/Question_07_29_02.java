package week_07.assigments;

public class Question_07_29_02 {
    public static void main(String[] args) {
        int[] deck = new int[52];
        // String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9",
                "10", "Jack", "Queen", "King"};

        // Initialize the cards
        for (int i = 0; i < deck.length; i++)
            deck[i] = i;

        // Shuffle the cards
        for (int i = 0; i < deck.length; i++) {
            // Generate an index randomly
            int index = (int)(Math.random() * deck.length);
            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }


        String [] card = new String[4];
        int sum = 0;

        for(int i = 0; i < 4; i++){
             card[i] = ranks[deck[i] % 13];
            if (card[i].equals("Ace")){
                sum += 1;
            }else if (card[i].equals("Jack")){
                sum += 11;
            }else if (card[i].equals("Queen")){
                sum += 12;
            }else if (card[i].equals("King")){
                sum += 13;
            }else {
                sum += Integer.parseInt(card[i]);
            }

        }

        if(sum >= 24){
            System.out.print("The number of picks that yields the sum of 24: ");
            for (String e: card) {
                System.out.print(e + " ");
            }
        }

    }
}
