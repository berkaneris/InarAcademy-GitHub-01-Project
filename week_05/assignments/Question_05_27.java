package week_05.assigments;

public class Question_05_27 {
    public static void main(String[] args) {
        final int NUMBER_OF_LEAP_YEARS_PER_LINE = 10;
        int count = 0;
        int leapYears = 0;
        for (int i = 101 ; i <= 2100 ; i++){
            if (i % 4 == 0 && i % 100 == 0 && i % 400 != 0 ){

            }
            else if (i % 4 == 0){
                leapYears++;
                count++;
                if (count % NUMBER_OF_LEAP_YEARS_PER_LINE == 0){
                    System.out.println(i);
                }else {
                    System.out.print(i + " ");
                }
            }
        }
        System.out.println();
        System.out.println("The total number of leap years are " + leapYears );
    }
}
