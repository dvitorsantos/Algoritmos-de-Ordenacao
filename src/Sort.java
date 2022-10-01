public class Sort<T extends Comparable<T>>{
   public int ordenar;
  
    public void setOrdem(int ordem){
      ordenar=ordem;
    }
    
    public int getOrdem(int ordem){
      return ordenar;
    }

    public T[] selectionSort(T[] vector) {
      
        if(ordenar==1){
      
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
        }
      if(ordenar==2){
      
        for (int i = 0; i < vector.length; i++) {
            int min = i;

            for (int j = i + 1; j < vector.length; j++) {
                if ((vector[j].compareTo(vector[min])) > 0) {
                    min = j;
                }
            }

            T aux = vector[i]; 
            vector[i] = vector[min];
            vector[min] = aux;
        }
        }

    return vector;
   }

 }

