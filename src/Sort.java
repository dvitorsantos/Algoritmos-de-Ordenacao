public class Sort<T extends Comparable<T>> {
    private boolean ascending;

    public Sort() {
        this.ascending = true;
    }

    @Deprecated
    public Sort(boolean ascending) {
        this.ascending = ascending;
    }

    public boolean isAscending() {
        return ascending;
    }

    public void setAscending(boolean ascending) {
        this.ascending = ascending;
    }

    public T[] selectionSort(T[] vector) {
        for (int i = 0; i < vector.length; i++) {
            int min = i;

            for (int j = i + 1; j < vector.length; j++) {
                if (this.ascending ? vector[j].compareTo(vector[min]) < 0 : vector[j].compareTo(vector[min]) > 0) {
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

    public T[] quickSort(T[] vector, int start, int end) {
        if (start < end) {
            int pivot = partition(vector, start, end);

            quickSort(vector, start, pivot - 1);
            quickSort(vector, pivot + 1, end);
        }

        return vector;
    }

    //    função que particiona o vetor para quicksort
    //    vector: vetor a ser particionado
    //    start: posição inicial do vetor
    //    end: posição final do vetor
    public int partition(T[] vector, int left, int right) {
        T pivot = vector[left];
        int i = left;
        int j = right;

        while (i < j) {
            if (this.ascending) {
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

