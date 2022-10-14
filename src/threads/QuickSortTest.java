package threads;

import algorithms.IntroSort;
import algorithms.QuickSort;
import elements.Element;
import helpers.Tester;
import helpers.Timer;

public class QuickSortTest extends Tester implements Runnable {
    private boolean ascending;

    private Timer timer;

    public QuickSortTest(boolean ascending) {
        this.timer = new Timer();
        this.ascending = ascending;
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
