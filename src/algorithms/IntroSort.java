package algorithms;

import elements.Element;

public class IntroSort {
    public static Element[] sort(Element[] vector, boolean ascending) {
        return intro(vector, 0, vector.length - 1, 0, ascending);
    }

    private static Element[] intro(Element[] vector, int start, int end, int depth, boolean ascending) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i].getKey() + " ");
        }
        System.out.println(" - depth: " + depth + " - start: " + start + " - end: " + end + " - vector_depth: " + getDepth(vector.length));

        if (start < end) {
            if (depth > getDepth(vector.length)) {
                HeapSort.sort(vector, ascending);
            } else {
                int pivot = QuickSort.partition(vector, start, end, ascending);

                intro(vector, start, pivot - 1, depth + 1, ascending);
                intro(vector, pivot + 1, end, depth + 1, ascending);
            }
        }

        return vector;
    }

    private static int getDepth(int n) {
        return 2 * (int) Math.floor(Math.log(n));
    }
}
