package week_08.assigments;

public class Question_08_18 {
    public static void main(String[] args) {
        int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};
        shuffle(m);
    }
    public static void shuffle(int[][] m){

        for (int i = 0; i <m.length; i++) {
            // Generate an index randomly
            int index = (int)(Math.random() * m.length);
            int tempX = m[i][0];
            int tempY = m[i][1];
            m[i][0] = m[index][0];
            m[i][1] = m[index][1];
            m[index][0] = tempX;
            m[index][1] = tempY;
        }

        for(int row = 0; row < m.length; row++){
            System.out.println("{" + m[row][0] + ", " + m[row][1] + "} ");
        }
    }
}
