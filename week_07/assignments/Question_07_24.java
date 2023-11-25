package week_07.assigments;

public class Question_07_24 {
    public static void main(String[] args) {
        int[] deck = new int[52];
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
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

// pick four card which is all of them are from different suits
        String [] selectedSuit = new String[4];
        String [] selectedRank = new String[4];
        for(int i = 0; i < selectedSuit.length; i++){
            selectedSuit[i] = "";
            selectedRank[i] = "";
        }
        int count1 = 0;
        int count2 = 0;
        while(count1 < 4) {
            int number =(int)(Math.random() * deck.length);
            String suit = suits[deck[number] / 13];
            String rank = ranks[deck[number] % 13];
            count2++;

            if(isInSuit(selectedSuit , suit)) {
                selectedSuit[count1] = suit;
                selectedRank[count1] = rank;
                count1++;
            }
        }
        for (int i = 0; i < selectedSuit.length; i++){
            System.out.println(selectedRank[i] + " of " + selectedSuit[i]);
        }
        System.out.println("Number of picks: " + count2);
    }
    public static boolean isInSuit (String [] array , String suit){
        boolean isInSuit = true;
        for(int i = 0; i < array.length; i++){
            if (array[i].contains(suit)){
                isInSuit = false;
                break;
            }
        }
        return isInSuit;
    }
}
