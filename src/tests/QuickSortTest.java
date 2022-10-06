package tests;

import algorithms.QuickSort;
import interfaces.Sorter;

public class QuickSortTest {
    public static void main(String[] args) {
        Sorter<Integer> sorter = new QuickSort<>();

        Integer[] vector = { 5, 3, 2, 4, 7, 1, 0, 6 };

        vector = sorter.sort(vector, true);

        for (Integer i : vector) {
            System.out.println(i);
        }
    }
}
