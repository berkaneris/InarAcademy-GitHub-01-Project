package week_07.assigments;

public class Question_07_23 {
    public static void main(String[] args) {
        boolean[] lockers = new boolean[100];

        for (int i = 1; i <= 100; i++) {
            for (int k = i; k <= 100; k++) {
                if ((k) % (i) == 0) {
                    lockers[k - 1] = !lockers[k - 1];
                }
            }
        }

        for (int i = 0; i < lockers.length; i++) {
            if (lockers[i]) {
                System.out.print("L" + (i + 1) + " ");
            }
        }

    }
}
