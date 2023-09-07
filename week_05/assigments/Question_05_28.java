package week_05.assigments;

import java.util.Scanner;

public class Question_05_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = input.nextInt();
        System.out.print("Enter the first day of the year: ");
        int dayNumber = input.nextInt();
        String month = "";
        String day = "";

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
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
                if (dayNumber == 1) {
                    switch (i) {
                        case 1: day = "Monday"; break;
                        case 2: day = "Thursday"; break;
                        case 3: day = "Friday"; break;
                        case 4: day = "Monday"; break;
                        case 5: day = "Wednesday"; break;
                        case 6: day = "Saturday"; break;
                        case 7: day = "Monday"; break;
                        case 8: day = "Thursday"; break;
                        case 9: day = "Sunday"; break;
                        case 10: day = "Tuesday"; break;
                        case 11: day = "Friday"; break;
                        case 12: day = "Sunday";
                    }
                }else if (dayNumber == 2) {
                    switch (i) {
                        case 1: day = "Tuesday"; break;
                        case 2: day = "Friday"; break;
                        case 3: day = "Saturday"; break;
                        case 4: day = "Tuesday"; break;
                        case 5: day = "Thursday"; break;
                        case 6: day = "Sunday"; break;
                        case 7: day = "Tuesday"; break;
                        case 8: day = "Friday"; break;
                        case 9: day = "Monday"; break;
                        case 10: day = "Wednesday"; break;
                        case 11: day = "Saturday"; break;
                        case 12: day = "Monday";
                    }
                }else if (dayNumber == 3) {
                    switch (i) {
                        case 1: day = "Wednesday"; break;
                        case 2: day = "Saturday"; break;
                        case 3: day = "Sunday"; break;
                        case 4: day = "Wednesday"; break;
                        case 5: day = "Friday"; break;
                        case 6: day = "Monday"; break;
                        case 7: day = "Wednesday"; break;
                        case 8: day = "Saturday"; break;
                        case 9: day = "Tuesday"; break;
                        case 10: day = "Thursday"; break;
                        case 11: day = "Sunday"; break;
                        case 12: day = "Tuesday";
                    }
                }else if (dayNumber == 4) {
                    switch (i) {
                        case 1: day = "Thursday"; break;
                        case 2: day = "Sunday"; break;
                        case 3: day = "Monday"; break;
                        case 4: day = "Thursday"; break;
                        case 5: day = "Saturday"; break;
                        case 6: day = "Tuesday"; break;
                        case 7: day = "Thursday"; break;
                        case 8: day = "Sunday"; break;
                        case 9: day = "Wednesday"; break;
                        case 10: day = "Friday"; break;
                        case 11: day = "Monday"; break;
                        case 12: day = "Wednesday";
                    }
                }else if (dayNumber == 5) {
                    switch (i) {
                        case 1: day = "Friday"; break;
                        case 2: day = "Monday"; break;
                        case 3: day = "Tuesday"; break;
                        case 4: day = "Friday"; break;
                        case 5: day = "Sunday"; break;
                        case 6: day = "Wednesday"; break;
                        case 7: day = "Friday"; break;
                        case 8: day = "Monday"; break;
                        case 9: day = "Thursday"; break;
                        case 10: day = "Saturday"; break;
                        case 11: day = "Tuesday"; break;
                        case 12: day = "Thursday";
                    }
                }else if (dayNumber == 6) {
                    switch (i) {
                        case 1: day = "Saturday"; break;
                        case 2: day = "Tuesday"; break;
                        case 3: day = "Wednesday"; break;
                        case 4: day = "Saturday"; break;
                        case 5: day = "Monday"; break;
                        case 6: day = "Thursday"; break;
                        case 7: day = "Saturday"; break;
                        case 8: day = "Tuesday"; break;
                        case 9: day = "Friday"; break;
                        case 10: day = "Sunday"; break;
                        case 11: day = "Wednesday"; break;
                        case 12: day = "Friday";
                    }
                }else if (dayNumber == 7) {
                    switch (i) {
                        case 1: day = "Sunday"; break;
                        case 2: day = "Wednesday"; break;
                        case 3: day = "Thursday"; break;
                        case 4: day = "Sunday"; break;
                        case 5: day = "Tuesday"; break;
                        case 6: day = "Friday"; break;
                        case 7: day = "Sunday"; break;
                        case 8: day = "Wednesday"; break;
                        case 9: day = "Saturday"; break;
                        case 10: day = "Monday"; break;
                        case 11: day = "Thursday"; break;
                        case 12: day = "Saturday";
                    }
                }
            }
            else{
                if (dayNumber == 1) {
                    switch (i) {
                        case 1: day = "Monday"; break;
                        case 2: day = "Thursday"; break;
                        case 3: day = "Thursday"; break;
                        case 4: day = "Sunday"; break;
                        case 5: day = "Tuesday"; break;
                        case 6: day = "Friday"; break;
                        case 7: day = "Sunday"; break;
                        case 8: day = "Wednesday"; break;
                        case 9: day = "Saturday"; break;
                        case 10: day = "Monday"; break;
                        case 11: day = "Thursday"; break;
                        case 12: day = "Saturday";
                    }
                }else if (dayNumber == 2) {
                    switch (i) {
                        case 1: day = "Tuesday"; break;
                        case 2: day = "Friday"; break;
                        case 3: day = "Friday"; break;
                        case 4: day = "Monday"; break;
                        case 5: day = "Wednesday"; break;
                        case 6: day = "Saturday"; break;
                        case 7: day = "Monday"; break;
                        case 8: day = "Thursday"; break;
                        case 9: day = "Sunday"; break;
                        case 10: day = "Tuesday"; break;
                        case 11: day = "Friday"; break;
                        case 12: day = "Sunday";
                    }
                }else if (dayNumber == 3) {
                    switch (i) {
                        case 1: day = "Wednesday"; break;
                        case 2: day = "Saturday"; break;
                        case 3: day = "Saturday"; break;
                        case 4: day = "Tuesday"; break;
                        case 5: day = "Thursday"; break;
                        case 6: day = "Sunday"; break;
                        case 7: day = "Tuesday"; break;
                        case 8: day = "Friday"; break;
                        case 9: day = "Monday"; break;
                        case 10: day = "Wednesday"; break;
                        case 11: day = "Saturday"; break;
                        case 12: day = "Monday";
                    }
                }else if (dayNumber == 4) {
                    switch (i) {
                        case 1: day = "Thursday"; break;
                        case 2: day = "Sunday"; break;
                        case 3: day = "Sunday"; break;
                        case 4: day = "Wednesday"; break;
                        case 5: day = "Friday"; break;
                        case 6: day = "Monday"; break;
                        case 7: day = "Wednesday"; break;
                        case 8: day = "Saturday"; break;
                        case 9: day = "Tuesday"; break;
                        case 10: day = "Thursday"; break;
                        case 11: day = "Sunday"; break;
                        case 12: day = "Tuesday";
                    }
                }else if (dayNumber == 5) {
                    switch (i) {
                        case 1: day = "Friday"; break;
                        case 2: day = "Monday"; break;
                        case 3: day = "Monday"; break;
                        case 4: day = "Thursday"; break;
                        case 5: day = "Saturday"; break;
                        case 6: day = "Tuesday"; break;
                        case 7: day = "Thursday"; break;
                        case 8: day = "Sunday"; break;
                        case 9: day = "Wednesday"; break;
                        case 10: day = "Friday"; break;
                        case 11: day = "Monday"; break;
                        case 12: day = "Wednesday";
                    }
                }else if (dayNumber == 6) {
                    switch (i) {
                        case 1: day = "Saturday"; break;
                        case 2: day = "Tuesday"; break;
                        case 3: day = "Tuesday"; break;
                        case 4: day = "Friday"; break;
                        case 5: day = "Sunday"; break;
                        case 6: day = "Wednesday"; break;
                        case 7: day = "Friday"; break;
                        case 8: day = "Monday"; break;
                        case 9: day = "Thursday"; break;
                        case 10: day = "Saturday"; break;
                        case 11: day = "Tuesday"; break;
                        case 12: day = "Thursday";
                    }
                }else if (dayNumber == 7) {
                    switch (i) {
                        case 1: day = "Sunday"; break;
                        case 2: day = "Wednesday"; break;
                        case 3: day = "Wednesday"; break;
                        case 4: day = "Saturday"; break;
                        case 5: day = "Monday"; break;
                        case 6: day = "Thursday"; break;
                        case 7: day = "Saturday"; break;
                        case 8: day = "Tuesday"; break;
                        case 9: day = "Friday"; break;
                        case 10: day = "Sunday"; break;
                        case 11: day = "Wednesday"; break;
                        case 12: day = "Friday";
                    }
                }
            }

            System.out.println(month + " 1, " + year + " is "+ day);

        }

    }
}
