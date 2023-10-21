package week_08.assigments;

import java.util.Scanner;

public class Question_08_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of banks and the limit: ");
        int numberOfBanks = input.nextInt();
        int limit = input.nextInt();
        int [] banks = new int[numberOfBanks];
        double [][] borrowers = new double[numberOfBanks][numberOfBanks];

        for(int row = 0; row < banks.length; row++){
            System.out.print("Enter the bank " + row + " inputs: ");
            banks[row] = input.nextInt();
            int numberOfBorrowers = input.nextInt();
            for(int column = 0; column < numberOfBorrowers; column++){
                int borrower = input.nextInt();
                borrowers[row][borrower] = input.nextDouble();
            }
        }
       printUnsafeBanks(banks , borrowers , limit);


    }
    public static void printUnsafeBanks(int [] banks , double [][] borrowers , int limit){

        double [] totalAssets = new double[banks.length];
        for(int row = 0; row < banks.length; row++){
            totalAssets[row] = banks[row];
            for(int column = 0; column < borrowers[row].length; column++){
                totalAssets[row] += borrowers[row][column];
            }
            if(totalAssets[row] < limit){
                boolean isChange = false;
                for(int i = 0; i < banks.length; i++){
                    if(borrowers[i][row] != 0) {
                        borrowers[i][row] = 0;
                        isChange = true;
                    }
                }
                if(isChange){
                    row = 0;
                }
            }
        }
        System.out.print("Unsafe banks are ");
        for(int i = 0; i < totalAssets.length; i++){
            if(totalAssets[i] < limit){
                System.out.print(i + " ");
            }
        }
    }

}
