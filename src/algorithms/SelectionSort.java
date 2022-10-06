package algorithms;

import interfaces.Sorter;

public class SelectionSort<T extends Comparable<T>> implements Sorter<T> {
    private boolean ascending;

    public boolean isAscending() {
        return ascending;
    }

    public void setAscending(boolean ascending) {
        this.ascending = ascending;
    }

    public T[] sort(T[] vector, boolean ascending) {
        this.setAscending(ascending);

        for (int i = 0; i < vector.length; i++) {
            int min = i;

            for (int j = i + 1; j < vector.length; j++) {
                if (this.isAscending() ? vector[j].compareTo(vector[min]) < 0 : vector[j].compareTo(vector[min]) > 0) {
                    min = j;
                }
            }

            //troca os valores
            T aux = vector[i];
            vector[i] = vector[min];
            vector[min] = aux;
        }

        return vector;
    }
}
