package week_05.assigments;

import java.util.Scanner;

public class Question_05_29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = input.nextInt();
        System.out.print("Enter the first day of the year: ");
        int dayNumber = input.nextInt();
        String month = "";
        String monday31 = "         1        2       3       4       5       6\n" +
                " 7       8        9      10      11      12      13\n" +
                "14      15       16      17      18      19      20\n" +
                "21      22       23      24      25      26      27\n" +
                "28      29       30      31";
        String tuesday31 = "                  1       2       3       4       5\n" +
                " 6       7        8       9      10      11      12\n" +
                "13      14       15      16      17      18      19\n" +
                "20      21       22      23      24      25      26\n" +
                "27      28       29      30      31";
        String wednesday31 ="                          1       2       3       4\n" +
                " 5       6        7       8       9      10      11\n" +
                "12      13       14      15      16      17      18\n" +
                "19      20       21      22      23      24      25\n" +
                "26      27       28      29      30      31";
        String thursday31 = "                                  1       2       3\n" +
                " 4       5        6       7       8       9      10\n" +
                "11      12       13      14      15      16      17\n" +
                "18      19       20      21      22      23      24\n" +
                "25      26       27      28      29      30      31";
        String friday31 = "                                          1       2\n" +
                " 3       4        5       6       7       8       9\n" +
                "10      11       12      13      14      15      16\n" +
                "17      18       19      20      21      22      23\n" +
                "24      25       26      27      28      29      30\n" +
                "31";
        String saturday31 = "                                                  1\n" +
                " 2       3        4       5       6       7       8\n" +
                " 9      10       11      12      13      14      15\n" +
                "16      17       18      19      20      21      22\n" +
                "23      24       25      26      27      28      29\n" +
                "30      31";
        String sunday31 =" 1       2        3       4       5       6       7\n" +
                " 8       9       10      11      12      13      14\n" +
                "15      16       17      18      19      20      21\n" +
                "22      23       24      25      26      27      28\n" +
                "29      30       31";
        String monday30 = "         1        2       3       4       5       6\n" +
                " 7       8        9      10      11      12      13\n" +
                "14      15       16      17      18      19      20\n" +
                "21      22       23      24      25      26      27\n" +
                "28      29       30";
        String tuesday30 = "                  1       2       3       4       5\n" +
                " 6       7        8       9      10      11      12\n" +
                "13      14       15      16      17      18      19\n" +
                "20      21       22      23      24      25      26\n" +
                "27      28       29      30";
        String wednesday30 ="                          1       2       3       4\n" +
                " 5       6        7       8       9      10      11\n" +
                "12      13       14      15      16      17      18\n" +
                "19      20       21      22      23      24      25\n" +
                "26      27       28      29      30";
        String thursday30 = "                                  1       2       3\n" +
                " 4       5        6       7       8       9      10\n" +
                "11      12       13      14      15      16      17\n" +
                "18      19       20      21      22      23      24\n" +
                "25      26       27      28      29      30";
        String friday30 = "                                          1       2\n" +
                " 3       4        5       6       7       8       9\n" +
                "10      11       12      13      14      15      16\n" +
                "17      18       19      20      21      22      23\n" +
                "24      25       26      27      28      29      30\n" ;
        String saturday30 = "                                                  1\n" +
                " 2       3        4       5       6       7       8\n" +
                " 9      10       11      12      13      14      15\n" +
                "16      17       18      19      20      21      22\n" +
                "23      24       25      26      27      28      29\n" +
                "30";
        String sunday30 =" 1       2        3       4       5       6       7\n" +
                " 8       9       10      11      12      13      14\n" +
                "15      16       17      18      19      20      21\n" +
                "22      23       24      25      26      27      28\n" +
                "29      30";
        String monday29 = "         1        2       3       4       5       6\n" +
                " 7       8        9      10      11      12      13\n" +
                "14      15       16      17      18      19      20\n" +
                "21      22       23      24      25      26      27\n" +
                "28      29";
        String tuesday29 = "                  1       2       3       4       5\n" +
                " 6       7        8       9      10      11      12\n" +
                "13      14       15      16      17      18      19\n" +
                "20      21       22      23      24      25      26\n" +
                "27      28       29";
        String wednesday29 ="                          1       2       3       4\n" +
                " 5       6        7       8       9      10      11\n" +
                "12      13       14      15      16      17      18\n" +
                "19      20       21      22      23      24      25\n" +
                "26      27       28      29";
        String thursday29 = "                                  1       2       3\n" +
                " 4       5        6       7       8       9      10\n" +
                "11      12       13      14      15      16      17\n" +
                "18      19       20      21      22      23      24\n" +
                "25      26       27      28      29";
        String friday29 = "                                          1       2\n" +
                " 3       4        5       6       7       8       9\n" +
                "10      11       12      13      14      15      16\n" +
                "17      18       19      20      21      22      23\n" +
                "24      25       26      27      28      29" ;
        String saturday29 = "                                                  1\n" +
                " 2       3        4       5       6       7       8\n" +
                " 9      10       11      12      13      14      15\n" +
                "16      17       18      19      20      21      22\n" +
                "23      24       25      26      27      28      29\n" ;
        String sunday29 =" 1       2        3       4       5       6       7\n" +
                " 8       9       10      11      12      13      14\n" +
                "15      16       17      18      19      20      21\n" +
                "22      23       24      25      26      27      28\n" +
                "29";
        String monday28 = "         1        2       3       4       5       6\n" +
                " 7       8        9      10      11      12      13\n" +
                "14      15       16      17      18      19      20\n" +
                "21      22       23      24      25      26      27\n" +
                "28";
        String tuesday28 = "                  1       2       3       4       5\n" +
                " 6       7        8       9      10      11      12\n" +
                "13      14       15      16      17      18      19\n" +
                "20      21       22      23      24      25      26\n" +
                "27      28";
        String wednesday28 ="                          1       2       3       4\n" +
                " 5       6        7       8       9      10      11\n" +
                "12      13       14      15      16      17      18\n" +
                "19      20       21      22      23      24      25\n" +
                "26      27       28";
        String thursday28 = "                                  1       2       3\n" +
                " 4       5        6       7       8       9      10\n" +
                "11      12       13      14      15      16      17\n" +
                "18      19       20      21      22      23      24\n" +
                "25      26       27      28";
        String friday28 = "                                          1       2\n" +
                " 3       4        5       6       7       8       9\n" +
                "10      11       12      13      14      15      16\n" +
                "17      18       19      20      21      22      23\n" +
                "24      25       26      27      28" ;
        String saturday28 = "                                                  1\n" +
                " 2       3        4       5       6       7       8\n" +
                " 9      10       11      12      13      14      15\n" +
                "16      17       18      19      20      21      22\n" +
                "23      24       25      26      27      28" ;
        String sunday28 =" 1       2        3       4       5       6       7\n" +
                " 8       9       10      11      12      13      14\n" +
                "15      16       17      18      19      20      21\n" +
                "22      23       24      25      26      27      28\n";


        for (int i = 1 ; i <= 12 ; i++){
            switch(i){
                case 1 : month = "January";break;
                case 2 : month = "February";break;
                case 3 : month = "March";break;
                case 4 : month = "April";break;
                case 5 : month = "May";break;
                case 6 : month = "June";break;
                case 7 : month = "July";break;
                case 8 : month = "August";break;
                case 9 : month = "September";break;
                case 10 : month = "October";break;
                case 11 : month = "November";break;
                case 12 : month = "December";
            }
            System.out.println("                  " + month + " " + year + "               ");
            System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
            System.out.println("Sun     Mon     Tue     Wed     Thu     Fri     Sat");
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
                if (dayNumber == 1) {
                    switch (i) {
                        case 1: System.out.println(monday31); break;
                        case 2: System.out.println(thursday29); break;
                        case 3: System.out.println(friday31); break;
                        case 4: System.out.println(monday30); break;
                        case 5: System.out.println(wednesday31); break;
                        case 6: System.out.println(saturday30); break;
                        case 7: System.out.println(monday31); break;
                        case 8: System.out.println(thursday31); break;
                        case 9: System.out.println(sunday30); break;
                        case 10: System.out.println(tuesday31); break;
                        case 11: System.out.println(friday30); break;
                        case 12: System.out.println(sunday31);
                    }
                }else if (dayNumber == 2) {
                    switch (i) {
                        case 1: System.out.println(tuesday31); break;
                        case 2: System.out.println(friday29); break;
                        case 3: System.out.println(saturday31); break;
                        case 4: System.out.println(tuesday30); break;
                        case 5: System.out.println(thursday31); break;
                        case 6: System.out.println(sunday30); break;
                        case 7: System.out.println(tuesday31); break;
                        case 8: System.out.println(friday31); break;
                        case 9: System.out.println(monday30); break;
                        case 10: System.out.println(wednesday31); break;
                        case 11: System.out.println(saturday30); break;
                        case 12: System.out.println(monday31);
                    }
                }else if (dayNumber == 3) {
                    switch (i) {
                        case 1: System.out.println(wednesday31); break;
                        case 2: System.out.println(saturday29); break;
                        case 3: System.out.println(sunday31); break;
                        case 4: System.out.println(wednesday30); break;
                        case 5: System.out.println(friday31); break;
                        case 6: System.out.println(monday30); break;
                        case 7: System.out.println(wednesday31); break;
                        case 8: System.out.println(saturday31); break;
                        case 9: System.out.println(tuesday30); break;
                        case 10: System.out.println(thursday31); break;
                        case 11: System.out.println(sunday30); break;
                        case 12: System.out.println(tuesday31);
                    }
                }else if (dayNumber == 4) {
                    switch (i) {
                        case 1: System.out.println(thursday31); break;
                        case 2: System.out.println(sunday29); break;
                        case 3: System.out.println(monday31); break;
                        case 4: System.out.println(thursday30); break;
                        case 5: System.out.println(saturday31); break;
                        case 6: System.out.println(tuesday30); break;
                        case 7: System.out.println(thursday31); break;
                        case 8: System.out.println(sunday31); break;
                        case 9: System.out.println(wednesday30); break;
                        case 10: System.out.println(friday31); break;
                        case 11: System.out.println(monday30); break;
                        case 12: System.out.println(wednesday31);
                    }
                }else if (dayNumber == 5) {
                    switch (i) {
                        case 1: System.out.println(friday31); break;
                        case 2: System.out.println(monday29); break;
                        case 3: System.out.println(tuesday31); break;
                        case 4: System.out.println(friday30); break;
                        case 5: System.out.println(sunday31); break;
                        case 6: System.out.println(wednesday30); break;
                        case 7: System.out.println(friday31); break;
                        case 8: System.out.println(monday31); break;
                        case 9: System.out.println(thursday30); break;
                        case 10: System.out.println(saturday31); break;
                        case 11: System.out.println(tuesday30); break;
                        case 12: System.out.println(thursday31);
                    }
                }else if (dayNumber == 6) {
                    switch (i) {
                        case 1: System.out.println(saturday31); break;
                        case 2: System.out.println(tuesday29); break;
                        case 3: System.out.println(wednesday31); break;
                        case 4: System.out.println(saturday30); break;
                        case 5: System.out.println(monday31); break;
                        case 6: System.out.println(thursday30); break;
                        case 7: System.out.println(saturday31); break;
                        case 8: System.out.println(tuesday31); break;
                        case 9: System.out.println(friday30); break;
                        case 10: System.out.println(sunday31); break;
                        case 11: System.out.println(wednesday30); break;
                        case 12: System.out.println(friday31);
                    }
                }else if (dayNumber == 7) {
                    switch (i) {
                        case 1: System.out.println(sunday31); break;
                        case 2: System.out.println(wednesday29); break;
                        case 3: System.out.println(thursday31); break;
                        case 4: System.out.println(sunday30); break;
                        case 5: System.out.println(tuesday31); break;
                        case 6: System.out.println(friday30); break;
                        case 7: System.out.println(sunday31); break;
                        case 8: System.out.println(wednesday31); break;
                        case 9: System.out.println(saturday30); break;
                        case 10: System.out.println(monday31); break;
                        case 11: System.out.println(thursday30); break;
                        case 12: System.out.println(saturday31);
                    }
                }
            }
            else{
                if (dayNumber == 1) {
                    switch (i) {
                        case 1: System.out.println(monday31); break;
                        case 2: System.out.println(thursday28); break;
                        case 3: System.out.println(thursday31); break;
                        case 4: System.out.println(sunday30); break;
                        case 5: System.out.println(tuesday31); break;
                        case 6: System.out.println(friday30); break;
                        case 7: System.out.println(sunday31); break;
                        case 8: System.out.println(wednesday31); break;
                        case 9: System.out.println(saturday30); break;
                        case 10: System.out.println(monday31); break;
                        case 11: System.out.println(thursday30); break;
                        case 12: System.out.println(saturday31);
                    }
                }else if (dayNumber == 2) {
                    switch (i) {
                        case 1: System.out.println(tuesday31); break;
                        case 2: System.out.println(friday28); break;
                        case 3: System.out.println(friday31); break;
                        case 4: System.out.println(monday30); break;
                        case 5: System.out.println(wednesday31); break;
                        case 6: System.out.println(saturday30); break;
                        case 7: System.out.println(monday31); break;
                        case 8: System.out.println(thursday31); break;
                        case 9: System.out.println(sunday30); break;
                        case 10: System.out.println(tuesday31); break;
                        case 11: System.out.println(friday30); break;
                        case 12: System.out.println(sunday31);
                    }
                }else if (dayNumber == 3) {
                    switch (i) {
                        case 1: System.out.println(wednesday31); break;
                        case 2: System.out.println(saturday28); break;
                        case 3: System.out.println(saturday31); break;
                        case 4: System.out.println(tuesday30); break;
                        case 5: System.out.println(thursday31); break;
                        case 6: System.out.println(sunday30); break;
                        case 7: System.out.println(tuesday31); break;
                        case 8: System.out.println(friday31); break;
                        case 9: System.out.println(monday30); break;
                        case 10: System.out.println(wednesday31); break;
                        case 11: System.out.println(saturday30); break;
                        case 12: System.out.println(monday31);
                    }
                }else if (dayNumber == 4) {
                    switch (i) {
                        case 1: System.out.println(thursday31); break;
                        case 2: System.out.println(sunday28); break;
                        case 3: System.out.println(sunday31); break;
                        case 4: System.out.println(wednesday30); break;
                        case 5: System.out.println(friday31); break;
                        case 6: System.out.println(monday30); break;
                        case 7: System.out.println(wednesday31); break;
                        case 8: System.out.println(saturday31); break;
                        case 9: System.out.println(tuesday30); break;
                        case 10: System.out.println(thursday31); break;
                        case 11: System.out.println(sunday30); break;
                        case 12: System.out.println(tuesday31);
                    }
                }else if (dayNumber == 5) {
                    switch (i) {
                        case 1: System.out.println(friday31); break;
                        case 2: System.out.println(monday28); break;
                        case 3: System.out.println(monday31); break;
                        case 4: System.out.println(thursday30); break;
                        case 5: System.out.println(saturday31); break;
                        case 6: System.out.println(tuesday30); break;
                        case 7: System.out.println(thursday31); break;
                        case 8: System.out.println(sunday31); break;
                        case 9: System.out.println(wednesday30); break;
                        case 10: System.out.println(friday31); break;
                        case 11: System.out.println(monday30); break;
                        case 12: System.out.println(wednesday31);
                    }
                }else if (dayNumber == 6) {
                    switch (i) {
                        case 1: System.out.println(saturday31); break;
                        case 2: System.out.println(tuesday28); break;
                        case 3: System.out.println(tuesday31); break;
                        case 4: System.out.println(friday30); break;
                        case 5: System.out.println(sunday31); break;
                        case 6: System.out.println(wednesday30); break;
                        case 7: System.out.println(friday31); break;
                        case 8: System.out.println(monday31); break;
                        case 9: System.out.println(thursday30); break;
                        case 10: System.out.println(saturday31); break;
                        case 11: System.out.println(tuesday30); break;
                        case 12: System.out.println(thursday31);
                    }
                }else if (dayNumber == 7) {
                    switch (i) {
                        case 1: System.out.println(sunday31); break;
                        case 2: System.out.println(wednesday28); break;
                        case 3: System.out.println(wednesday31); break;
                        case 4: System.out.println(saturday30); break;
                        case 5: System.out.println(monday31); break;
                        case 6: System.out.println(thursday30); break;
                        case 7: System.out.println(saturday31); break;
                        case 8: System.out.println(tuesday31); break;
                        case 9: System.out.println(friday30); break;
                        case 10: System.out.println(sunday31); break;
                        case 11: System.out.println(wednesday30); break;
                        case 12: System.out.println(friday31);
                    }
                }
            }
        }
    }
}
