package algorithms;

import interfaces.Sorter;

public class HeapSort<T extends Comparable<T>> implements Sorter<T> {
    private boolean ascending;

    public boolean isAscending() {
        return ascending;
    }

    public void setAscending(boolean ascending) {
        this.ascending = ascending;
    }

    @Override
    public T[] sort(T[] vector, boolean ascending) {
        this.setAscending(ascending);

        int n = vector.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(vector, n, i, ascending);
        }

        for (int i = n - 1; i >= 0; i--) {
            T temp = vector[0];
            vector[0] = vector[i];
            vector[i] = temp;

            heapify(vector, i, 0, ascending);
        }

        return vector;
    }

    private void heapify(T[] vector, int n, int i, boolean ascending) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (isAscending()) {
            if (left < n && ( vector[left]).compareTo(vector[largest]) > 0) {
                largest = left;
            }

            if (right < n && (vector[right]).compareTo(vector[largest]) > 0) {
                largest = right;
            }
        } else {
            if (left < n && (vector[left]).compareTo(vector[largest]) < 0) {
                largest = left;
            }

            if (right < n && (vector[right]).compareTo(vector[largest]) < 0) {
                largest = right;
            }
        }

        if (largest != i) {
            T swap = vector[i];
            vector[i] = vector[largest];
            vector[largest] = swap;

            heapify(vector, n, largest, ascending);
        }
    }
}
