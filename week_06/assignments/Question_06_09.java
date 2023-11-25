package week_06.assigments;

public class Question_06_09 {
    public static void main(String[] args) {
        System.out.println("Feet          Meters          |          Meters          Feet       ");
        System.out.println("----------------------------------------------------------------------");
        for (double i = 1 , k = 20; i <= 10 && k <= 65; i++ , k += 5){
            System.out.printf("%4.1f%10s%-16.3f%-11s%-16.1f%8.3f" , i , "" ,footToMeter(i) , "|" , k , meterToFoot(k));
            System.out.println();
        }
    }

    public static double footToMeter(double foot) {
        return 0.305 * foot;
    }

    public static double meterToFoot(double meter) {
        return 3.279 * meter;
    }
}
