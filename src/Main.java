import algorithms.HeapSort;
import algorithms.SelectionSort;
import elements.Element;
import elements.Box;
import helpers.Entries;
import helpers.Timer;
import threads.*;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Element<Integer, Box> small_integer_entrie[] = Entries.integerEntrie(1000, 0, 1000);
        Element<Integer, Box> medium_integer_entrie[] = Entries.integerEntrie(100000, 0, 100000);
        Element<Integer, Box> big_integer_entrie[] = Entries.integerEntrie(1000000, 0, 1000000);

        Element<Double, Box> small_double_entrie[] = Entries.doubleEntrie(1000, 0, 1000);
        Element<Double, Box> medium_double_entrie[] = Entries.doubleEntrie(100000, 0, 100000);
        Element<Double, Box> big_double_entrie[] = Entries.doubleEntrie(1000000, 0, 1000000);

        Element<String, Box> small_string_entrie[] = Entries.stringEntrie(1000, 10);
        Element<String, Box> medium_string_entrie[] = Entries.stringEntrie(100000, 10);
        Element<String, Box> big_string_entrie[] = Entries.stringEntrie(1000000, 10);

        Thread heap_sort_thread = new Thread(new HeapSortTest(small_integer_entrie, medium_integer_entrie, big_integer_entrie,
                                                                small_double_entrie, medium_double_entrie, big_double_entrie,
                                                                small_string_entrie, medium_string_entrie, big_string_entrie, true));
        Thread intro_sort_thread = new Thread(new IntroSortTest(small_integer_entrie, medium_integer_entrie, big_integer_entrie,
                                                                small_double_entrie, medium_double_entrie, big_double_entrie,
                                                                small_string_entrie, medium_string_entrie, big_string_entrie, true));
        Thread selection_sort_thread = new Thread(new SelectionSortTest(small_integer_entrie, medium_integer_entrie, big_integer_entrie,
                                                                small_double_entrie, medium_double_entrie, big_double_entrie,
                                                                small_string_entrie, medium_string_entrie, big_string_entrie, true));
        Thread quick_sort_thread = new Thread(new QuickSortTest(small_integer_entrie, medium_integer_entrie, big_integer_entrie,
                                                                small_double_entrie, medium_double_entrie, big_double_entrie,
                                                                small_string_entrie, medium_string_entrie, big_string_entrie, true));
        Thread merge_sort_thread = new Thread(new MergeSortTest(small_integer_entrie, medium_integer_entrie, big_integer_entrie,
                                                                small_double_entrie, medium_double_entrie, big_double_entrie,
                                                                small_string_entrie, medium_string_entrie, big_string_entrie, true));
        Thread tree_sort_thread = new Thread(new TreeSortTest(small_integer_entrie, medium_integer_entrie, big_integer_entrie,
                                                                small_double_entrie, medium_double_entrie, big_double_entrie,
                                                                small_string_entrie, medium_string_entrie, big_string_entrie, true));

        heap_sort_thread.start();
        intro_sort_thread.start();
        merge_sort_thread.start();
        selection_sort_thread.start();
        tree_sort_thread.start();
        quick_sort_thread.start();
    }
}
