package algorithms;

import elements.Element;
public class HeapSort {
    public static Element[] sort(Element[] vector, boolean ascending) {

        int n = vector.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(vector, n, i, ascending);
        }

        for (int i = n - 1; i >= 0; i--) {
            Element temp = vector[0];
            vector[0] = vector[i];
            vector[i] = temp;

            heapify(vector, i, 0, ascending);
        }

        return vector;
    }

    private static void heapify(Element[] vector, int n, int i, boolean ascending) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (ascending) {
            if (left < n && ( vector[left]).getKey().compareTo(vector[largest].getKey()) > 0) {
                largest = left;
            }

            if (right < n && (vector[right]).getKey().compareTo(vector[largest].getKey()) > 0) {
                largest = right;
            }
        } else {
            if (left < n && (vector[left]).getKey().compareTo(vector[largest].getKey()) < 0) {
                largest = left;
            }

            if (right < n && (vector[right]).getKey().compareTo(vector[largest].getKey()) < 0) {
                largest = right;
            }
        }

        if (largest != i) {
            Element swap = vector[i];
            vector[i] = vector[largest];
            vector[largest] = swap;

            heapify(vector, n, largest, ascending);
        }
    }
}
