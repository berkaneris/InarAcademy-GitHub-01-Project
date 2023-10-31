package week_09.assigments;

import week_07.SelectionSort;

public class TestStopWatch {
    public static void main(String[] args) {
        double [] list = new double[100000];

        for(int i = 0; i < list.length; i++){
            list[i] = (Math.random() * 100000);
        }

        StopWatch counter = new StopWatch();
        counter.start();

        SelectionSort.selectionSort(list);
        counter.stop();

        System.out.println("The execution time of sorting 100,000 numbers using selection sort: " + counter.getElapsedTime() +
                " milliseconds");
    }
}
