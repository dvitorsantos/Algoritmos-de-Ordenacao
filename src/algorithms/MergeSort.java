package algorithms;

import elements.Element;

public class MergeSort {
    public static Element[] sort(Element[] vector, boolean ascending) {
        mergeSort(vector, 0, vector.length - 1, ascending);
        return vector;
    }

    private static void mergeSort(Element[] vector, int left, int right, boolean ascending) {
        if (left < right) {
            int middle = (left + right) / 2;
            mergeSort(vector, left, middle, ascending);
            mergeSort(vector, middle + 1, right, ascending);
            merge(vector, left, middle, right, ascending);
        }
    }

    private static void merge(Element[] vector, int left, int middle, int right, boolean ascending) {
        Element[] aux = new Element[vector.length];
        for (int i = left; i <= right; i++) {
            aux[i] = vector[i];
        }

        int i = left;
        int j = middle + 1;
        int k = left;

        while (i <= middle && j <= right) {
            if (ascending) {
                if (aux[i].getKey().compareTo(aux[j].getKey()) <= 0) {
                    vector[k] = aux[i];
                    i++;
                } else {
                    vector[k] = aux[j];
                    j++;
                }
            } else {
                if (aux[i].getKey().compareTo(aux[j].getKey()) >= 0) {
                    vector[k] = aux[i];
                    i++;
                } else {
                    vector[k] = aux[j];
                    j++;
                }
            }

            k++;
        }

        while (i <= middle) {
            vector[k] = aux[i];
            k++;
            i++;
        }
    }
}
