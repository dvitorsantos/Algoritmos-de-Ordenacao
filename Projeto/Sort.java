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
    
        public T[] HeapSort(T[]vector) {     

            int n = vector.length;

            for (int i = n / 2 - 1; i >= 0; i--) {
                heapify(vector, n, i);
            }

            for (int i = n - 1; i >= 0; i--) {
                T temp = vector[0];
                vector[0] = vector[i];
                vector[i] = temp;

                heapify(vector, i, 0);
            }

            return vector;
        }

      private void heapify(T[] vector, int n, int i) {
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

                heapify(vector, n, largest);
            }
      }

    	    public T[] MergeSort(T[] vector, int left, int right) {
    	        mergeSort(vector, 0, vector.length - 1);
    	        return vector;
    	    }

    	    private void mergeSort(T[] vector, int left, int right) {
    	        if (left < right) {
    	            int middle = (left + right) / 2;
    	            mergeSort(vector, left, middle);
    	            mergeSort(vector, middle + 1, right);
    	            merge(vector, left, middle, right);
    	        }
    	    }

    	    private void merge(T[] vector, int left, int middle, int right) {
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


   
  
 


