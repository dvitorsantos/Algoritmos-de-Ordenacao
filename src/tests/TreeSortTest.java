package tests;

import algorithms.TreeSort;
import elements.Element;

public class TreeSortTest {
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

        Element[] sorted = TreeSort.sort(vector, false);

        for (Element element : sorted) {
            System.out.println(element.getKey() + " " + element.getValue());
        }
    }
}
