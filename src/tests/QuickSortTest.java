package tests;

import algorithms.QuickSort;
import elements.Element;

public class QuickSortTest {
    public static void main(String[] args) {
        Element<Integer, String>[] vector = new Element[] {
                new Element<>(4, "D"),
                new Element<>(8, "H"),
                new Element<>(3, "C"),
                new Element<>(1, "A"),
                new Element<>(5, "E"),
                new Element<>(6, "F"),
                new Element<>(2, "B"),
                new Element<>(7, "G")
        };

        vector = QuickSort.sort(vector, true);

        for (Element i : vector) {
            System.out.println(i.getKey() + " " + i.getValue());
        }
    }
}
