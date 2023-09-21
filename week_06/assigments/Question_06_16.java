package week_06.assigments;

public class Question_06_16 {
    public static void main(String[] args) {
     int total = 0;
     int i;
        for ( i = 2000; i < 2021; i++){
            total += numberOfDaysInAYear(i);
            System.out.println(i + " year has " + numberOfDaysInAYear(i) + " days.");
        }
        System.out.println("The total days between 2000 and " + i + " are " + total );
    }
    public static int numberOfDaysInAYear(int year){
        int numberOfDays ;
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
            numberOfDays = 366;
        }else{
            numberOfDays = 365;
        }
        return numberOfDays;
    }
}
