package week_06.assigments;

public class Question_06_11 {
    public static void main(String[] args) {
        System.out.println(" Sales Amount          Commission");
        System.out.println("----------------------------------");
        for (double salesAmount = 10000; salesAmount <=100000; salesAmount += 5000){
            System.out.printf(" %-12.0f%18.1f" , salesAmount , computeCommission(salesAmount));
            System.out.println();
        }
    }
    public static double computeCommission(double salesAmount){
        double commission;
        if (0 <= salesAmount && salesAmount <= 5000 ){
            commission = salesAmount * 8 / 100;
        }else if (salesAmount <= 10000){
            commission =  5000 * 8.0 / 100 + (salesAmount - 5000) * 10 / 100;
        }else{
            commission =  5000 * 8.0 / 100 + 5000 * 10.0 / 100 + (salesAmount - 10000) * 12 / 100;
        }
        return commission;
    }
}
