import elements.Element;
import elements.Box;
import helpers.Entries;
import helpers.Timer;
import threads.*;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //obs: ao instanciar um objeto thread, é alocada memória para cada thread executar seu algoritmo de ordenação.
        //por isso, é necessário bastante memória para executar as múltiplas threads e iniciar os testes.
        //Os 6 testes se mostraram estáveis com 16GB de memória RAM.

        Thread heap_sort_thread = new Thread(new HeapSortTest(true));
        Thread intro_sort_thread = new Thread(new IntroSortTest(true));
        Thread selection_sort_thread = new Thread(new SelectionSortTest(true));
        Thread quick_sort_thread = new Thread(new QuickSortTest(true));
        Thread merge_sort_thread = new Thread(new MergeSortTest(true));
        Thread tree_sort_thread = new Thread(new TreeSortTest(true));

        heap_sort_thread.start();
        intro_sort_thread.start();
        merge_sort_thread.start();
        selection_sort_thread.start();
        tree_sort_thread.start();
        quick_sort_thread.start();
    }
}
