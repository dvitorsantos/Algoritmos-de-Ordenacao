package tests;

import algorithms.HeapSort;
import interfaces.Sorter;

public class HeapSortTest {
    public static void main(String[] args) {
        Sorter<String> sorterString = new HeapSort<>();
        Sorter<Integer> sorterInteger = new HeapSort<>();

        String [] random_words = {"hello", "world", "this", "is", "a", "test"};

        Integer [] random_numbers = {5, 3, 2, 4, 7, 1, 0, 6};

        random_words = sorterString.sort(random_words, true);
        random_numbers = sorterInteger.sort(random_numbers, true);

        for (String i : random_words) {
            System.out.println(i);
        }

        for (Integer i : random_numbers) {
            System.out.println(i);
        }
    }
}
