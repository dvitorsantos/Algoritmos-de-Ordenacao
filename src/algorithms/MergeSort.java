package algorithms;

import interfaces.Sorter;

public class MergeSort<T extends Comparable<T>> implements Sorter<T> {

    @Override
    public T[] sort(T[] vector, boolean ascending) {
        mergeSort(vector, 0, vector.length - 1, ascending);
        return vector;
    }

    private void mergeSort(T[] vector, int left, int right, boolean ascending) {
        if (left < right) {
            int middle = (left + right) / 2;
            mergeSort(vector, left, middle, ascending);
            mergeSort(vector, middle + 1, right, ascending);
            merge(vector, left, middle, right, ascending);
        }
    }

    private void merge(T[] vector, int left, int middle, int right, boolean ascending) {
        int n1 = middle - left + 1;
        int n2 = right - middle;

        T[] leftVector = (T[]) new Comparable[n1];
        T[] rightVector = (T[]) new Comparable[n2];

        for (int i = 0; i < n1; i++) {
            leftVector[i] = vector[left + i];
        }

        for (int i = 0; i < n2; i++) {
            rightVector[i] = vector[middle + 1 + i];
        }

        int i = 0;
        int j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (ascending) {
                if (leftVector[i].compareTo(rightVector[j]) <= 0) {
                    vector[k] = leftVector[i];
                    i++;
                } else {
                    vector[k] = rightVector[j];
                    j++;
                }
            } else {
                if (leftVector[i].compareTo(rightVector[j]) >= 0) {
                    vector[k] = leftVector[i];
                    i++;
                } else {
                    vector[k] = rightVector[j];
                    j++;
                }
            }
            k++;
        }

        while (i < n1) {
            vector[k] = leftVector[i];
            i++;
            k++;
        }

        while (j < n2) {
            vector[k] = rightVector[j];
            j++;
            k++;
        }
    }
}
