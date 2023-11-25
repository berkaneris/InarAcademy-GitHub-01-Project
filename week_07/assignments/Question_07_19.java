package week_07.assigments;
import java.util.Arrays;
import java.util.Scanner;

public class Question_07_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list: ");
        int number = input.nextInt();
        int [] list = new int[number];
        for (int i = 0; i < list.length; i++){
            list[i] = input.nextInt();
        }
        if (isSorted(list)){
            System.out.println("The list is already sorted");
        }else{
            System.out.println("The list is not sorted");
        }
    }
    public static boolean isSorted(int[] list){
       int [] newList = new int[list.length];
       for (int i = 0; i < list.length; i++){
           newList[i] = list[i];
       }
       Arrays.sort(newList);
       if (Arrays.equals(newList , list)){
           return true;
       }else{
           return false;
       }
    }
}
