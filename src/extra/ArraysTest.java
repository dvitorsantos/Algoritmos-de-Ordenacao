package extra;

import elements.Box;
import elements.Element;
import helpers.Entries;
import helpers.Timer;

import java.util.Arrays;

public class ArraysTest {
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
        timer.start();
        Arrays.sort(small_integer_entrie, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));
        timer.stop();
        System.out.println("Arrays.sort(small_integer_entrie) took " + timer.getElapsedTime() + "ms");

        timer.start();
        Arrays.sort(medium_integer_entrie, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));
        timer.stop();
        System.out.println("Arrays.sort(medium_integer_entrie) took " + timer.getElapsedTime() + "ms");

        timer.start();
        Arrays.sort(big_integer_entrie, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));
        timer.stop();
        System.out.println("Arrays.sort(big_integer_entrie) took " + timer.getElapsedTime() + "ms");

        timer.start();
        Arrays.sort(small_double_entrie, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));
        timer.stop();
        System.out.println("Arrays.sort(small_double_entrie) took " + timer.getElapsedTime() + "ms");

        timer.start();
        Arrays.sort(medium_double_entrie, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));
        timer.stop();
        System.out.println("Arrays.sort(medium_double_entrie) took " + timer.getElapsedTime() + "ms");

        timer.start();
        Arrays.sort(big_double_entrie, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));
        timer.stop();
        System.out.println("Arrays.sort(big_double_entrie) took " + timer.getElapsedTime() + "ms");

        timer.start();
        Arrays.sort(small_string_entrie, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));
        timer.stop();
        System.out.println("Arrays.sort(small_string_entrie) took " + timer.getElapsedTime() + "ms");

        timer.start();
        Arrays.sort(medium_string_entrie, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));
        timer.stop();
        System.out.println("Arrays.sort(medium_string_entrie) took " + timer.getElapsedTime() + "ms");

        timer.start();
        Arrays.sort(big_string_entrie, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));
        timer.stop();
        System.out.println("Arrays.sort(big_string_entrie) took " + timer.getElapsedTime() + "ms");
    }
}
