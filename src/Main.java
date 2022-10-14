import algorithms.SelectionSort;
import elements.Element;
import elements.Box;
import helpers.Entries;
import helpers.Timer;

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

        Timer timer = new Timer();

        //SELECTION SORT

        timer.start("SelectionSort - Small Integer Entrie");
        SelectionSort.sort(small_integer_entrie, true);
        timer.stop();

        timer.start("SelectionSort - Medium Integer Entrie");
        SelectionSort.sort(medium_integer_entrie, true);
        timer.stop();

        timer.start("SelectionSort - Big Integer Entrie");
        SelectionSort.sort(big_integer_entrie, true);
        timer.stop();

        timer.start("SelectionSort - Small Double Entrie");
        SelectionSort.sort(small_double_entrie, true);
        timer.stop();

        timer.start("SelectionSort - Medium Double Entrie");
        SelectionSort.sort(medium_double_entrie, true);
        timer.stop();

        timer.start("SelectionSort - Big Double Entrie");
        SelectionSort.sort(big_double_entrie, true);
        timer.stop();

        timer.start("SelectionSort - Small String Entrie");
        SelectionSort.sort(small_string_entrie, true);
        timer.stop();

        timer.start("SelectionSort - Medium String Entrie");
        SelectionSort.sort(medium_string_entrie, true);
        timer.stop();

        timer.start("SelectionSort - Big String Entrie");
        SelectionSort.sort(big_string_entrie, true);
        timer.stop();
    }
}
