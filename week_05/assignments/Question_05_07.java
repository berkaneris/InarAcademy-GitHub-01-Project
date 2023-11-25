package week_05.assigments;

public class Question_05_07 {
    public static void main(String[] args) {
        double tuition = 10000;
        double rate = 0.05;
        double total = 0;
        int year;
        for(year = 0 ; year < 10 ; year++){
            tuition += (tuition * rate);
            System.out.printf("%.3f for %d.years",tuition , year + 1);
            System.out.println();
        }
        for(year = 0 ; year < 4 ; year++){
            tuition += (tuition * rate);
            total += tuition;
        }
        System.out.printf("the total cost of four years’ worth of tuition after the tenth year is %.3f", total);

    }
}
