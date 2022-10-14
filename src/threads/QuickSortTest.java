package threads;

import algorithms.IntroSort;
import algorithms.QuickSort;
import elements.Element;
import helpers.Tester;
import helpers.Timer;

public class QuickSortTest extends Tester implements Runnable {
    private boolean ascending;

    private Timer timer;

    public QuickSortTest(Element[] small_integer, Element[] medium_integer, Element[] big_integer,
                         Element[] small_double, Element[] medium_double, Element[] big_double,
                         Element[] small_string, Element[] medium_string, Element[] big_string,
                         boolean ascending) {
        this.timer = new Timer();
        this.ascending = ascending;
        this.setSmall_integer_entrie(small_integer);
        this.setMedium_integer_entrie(medium_integer);
        this.setBig_integer_entrie(big_integer);
        this.setSmall_double_entrie(small_double);
        this.setMedium_double_entrie(medium_double);
        this.setBig_double_entrie(big_double);
        this.setSmall_string_entrie(small_string);
        this.setMedium_string_entrie(medium_string);
        this.setBig_string_entrie(big_string);
    }

    public boolean isAscending() {
        return ascending;
    }

    public void setAscending(boolean ascending) {
        this.ascending = ascending;
    }

    @Override
    public void run() {
        this.test(this.getSmall_integer_entrie());
        this.test(this.getMedium_integer_entrie());
        this.test(this.getBig_integer_entrie());
        this.test(this.getSmall_double_entrie());
        this.test(this.getMedium_double_entrie());
        this.test(this.getBig_double_entrie());
        this.test(this.getSmall_string_entrie());
        this.test(this.getMedium_string_entrie());
        this.test(this.getBig_string_entrie());
    }

    public void test(Element[] vector) {
        this.timer.start();
        QuickSort.sort(vector, this.isAscending());
        this.timer.stop();

        System.out.println("(" + vector[0].getKey().getClass().getSimpleName() + ") QuickSort with " + vector.length + " elements in " + this.timer.getElapsedTime() + "ms.");
    }
}
