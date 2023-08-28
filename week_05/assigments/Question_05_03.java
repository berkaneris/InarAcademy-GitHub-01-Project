package week_05.assigments;

public class Question_05_03 {
    public static void main(String[] args) {
        System.out.println("Kilograms        Pounds");

        for (int i = 1 ; i < 200 ; i += 2) {
            System.out.printf("%-17d%6.1f" , i , i * 2.2);
            System.out.println();
        }
    }
}
