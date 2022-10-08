package algorithms;

import elements.Element;

public class SelectionSort {
    public static Element[] sort(Element[] vector, boolean ascending) {
        for (int i = 0; i < vector.length; i++) {
            int min = i;

            for (int j = i + 1; j < vector.length; j++) {
                if (ascending ?
                        vector[j].getKey().compareTo(vector[min].getKey()) < 0 :
                        vector[j].getKey().compareTo(vector[min].getKey()) > 0) {
                    min = j;
                }
            }

            Element temp = vector[i];
            vector[i] = vector[min];
            vector[min] = temp;
        }

        return vector;
    }
}
