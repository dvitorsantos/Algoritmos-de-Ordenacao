package algorithms;

import interfaces.Sorter;

public class QuickSort<T extends Comparable<T>> implements Sorter<T> {
    private boolean ascending;

    public boolean isAscending() {
        return ascending;
    }

    public void setAscending(boolean ascending) {
        this.ascending = ascending;
    }

    public T[] sort(T[] vector, boolean ascending) {
        this.setAscending(ascending);
        return quick(vector, 0, vector.length - 1);
    }

    public T[] quick(T[] vector, int start, int end) {
        if (start < end) {
            int pivot = partition(vector, start, end);

            quick(vector, start, pivot - 1);
            quick(vector, pivot + 1, end);
        }

        return vector;
    }

    public int partition(T[] vector, int left, int right) {
        T pivot = vector[left];
        int i = left;
        int j = right;

        while (i < j) {
            if (this.isAscending()) {
                while (vector[i].compareTo(pivot) <= 0 && i < right) {
                    i++;
                }

                while (vector[j].compareTo(pivot) > 0) {
                    j--;
                }
            } else {
                while (vector[i].compareTo(pivot) >= 0 && i < right) {
                    i++;
                }

                while (vector[j].compareTo(pivot) < 0) {
                    j--;
                }
            }

            if (i < j) {
                T aux = vector[i];
                vector[i] = vector[j];
                vector[j] = aux;
            }
        }

        vector[left] = vector[j];
        vector[j] = pivot;

        return j;
    }

}
