package algorithms;

import elements.Element;
public class QuickSort {

    public static Element[] sort(Element[] vector, boolean ascending) {
        return quick(vector, 0, vector.length - 1, ascending);
    }

    public static Element[] quick(Element[] vector, int start, int end, boolean ascending) {
        if (start < end) {
            int pivot = partition(vector, start, end, ascending);

            quick(vector, start, pivot - 1, ascending);
            quick(vector, pivot + 1, end, ascending);
        }

        return vector;
    }

    public static int partition(Element[] vector, int left, int right, boolean ascending) {
        Element pivot = vector[left];
        int i = left;
        int j = right;

        while (i < j) {
            if (ascending) {
                while (vector[i].getKey().compareTo(pivot.getKey()) <= 0 && i < right) {
                    i++;
                }

                while (vector[j].getKey().compareTo(pivot.getKey()) > 0) {
                    j--;
                }
            } else {
                while (vector[i].getKey().compareTo(pivot.getKey()) >= 0 && i < right) {
                    i++;
                }

                while (vector[j].getKey().compareTo(pivot.getKey()) < 0) {
                    j--;
                }
            }

            if (i < j) {
                Element aux = vector[i];
                vector[i] = vector[j];
                vector[j] = aux;
            }
        }

        vector[left] = vector[j];
        vector[j] = pivot;

        return j;
    }

}
