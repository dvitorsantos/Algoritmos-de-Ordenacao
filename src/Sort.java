public class Sort<T extends Comparable<T>>{
    public T[] selectionSort(T[] vector) {
        for (int i = 0; i < vector.length; i++) {
            int min = i;

            for (int j = i + 1; j < vector.length; j++) {
                if ((vector[j].compareTo(vector[min])) < 0) {
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
