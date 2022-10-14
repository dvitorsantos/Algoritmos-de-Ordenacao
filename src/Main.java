import java.util.Scanner;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import algorithms.SelectionSort;
import elements.Element;
import algorithms.MergeSort;
import elements.Box;
import helpers.Entries;
import helpers.Timer;
import algorithms.HeapSort;
import algorithms.IntroSort;
import algorithms.QuickSort;
import algorithms.TreeSort;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Random gerador = new Random();

        int contador = 1, ordem, tamanho;
        Timer timer = new Timer();
        
        Element<Integer, Box> small_integer_entrie[] = Entries.integerEntrie(1000, 1000000000, 2000000000);
        Element<Integer, Box> medium_integer_entrie[] = Entries.integerEntrie(100000, 1000000000, 2000000000);
        Element<Integer, Box> big_integer_entrie[] = Entries.integerEntrie(1000000, 1000000000, 2000000000);

        Element<Double, Box> small_double_entrie[] = Entries.doubleEntrie(1000, 1000000000, 2000000000);
        Element<Double, Box> medium_double_entrie[] = Entries.doubleEntrie(100000, 1000000000, 2000000000);
        Element<Double, Box> big_double_entrie[] = Entries.doubleEntrie(1000000, 1000000000, 2000000000);

        Element<String, Box> small_string_entrie[] = Entries.stringEntrie(1000, 10);
        Element<String, Box> medium_string_entrie[] = Entries.stringEntrie(100000, 10);
        Element<String, Box> big_string_entrie[] = Entries.stringEntrie(1000000, 10);

        while (contador == 1) {

            System.out.println("\n1-Teste Pequeno (Mil Elementos)");
            System.out.println("2-Teste Médio (Cem Mil Elementos)");
            System.out.println("3-Teste Grande (Um Milhão de Elementos)");
            System.out.println("4-Encerrar Execução do Programa");
            

            int variavel = entrada.nextInt();
            int formato, ordenar;
            boolean ordemDeOrdenacao = true;

            System.out.print("\nPressione Um para Ordenar em Ordem Crescente ou Dois para Decrescente:");

            if (entrada.nextInt() == 2) {
                ordemDeOrdenacao = false;
            }

            System.out.println("\nPressione um para Integer dois para Double ou três para String:");

            formato = entrada.nextInt();

            System.out.println("\n1-Selection Sort\n2-Quick Sort\n3-Merge Sort\n4-Heap Sort\n5-Intro Sort\n6-Tree Sort");
          
            ordenar = entrada.nextInt();

            switch (variavel) {
                case 1:
                    if (formato == 1) {
                    	if (ordenar==1) {
		                    timer.start();
		                    SelectionSort.sort(small_integer_entrie, ordemDeOrdenacao);
		                    timer.stop();
		                    for (Element i : small_integer_entrie) {
		                        System.out.println(i.getKey() + " " + i.getValue());
                            }
		                    timer.getElapsedTime();
                    	}
                    	else if (ordenar==2) {
	                    	timer.start();
	                        QuickSort.sort(small_integer_entrie, ordemDeOrdenacao);
	                        timer.stop();
	                        for (Element i : small_integer_entrie) {
	                            System.out.println(i.getKey() + " " + i.getValue());
                            }
	                        timer.getElapsedTime();
                    	}
                    	else if (ordenar==3) {
	                    	timer.start();
	                        MergeSort.sort(small_integer_entrie, ordemDeOrdenacao);
	                        timer.stop();
	                        for (Element i : small_integer_entrie) {
	                            System.out.println(i.getKey() + " " + i.getValue());
                            }
	                        timer.getElapsedTime();
                    	}
                    	else if (ordenar==4) {
	                    	timer.start();
	                        HeapSort.sort(small_integer_entrie, ordemDeOrdenacao);
	                        timer.stop();
	                        for (Element i : small_integer_entrie) {
	                            System.out.println(i.getKey() + " " + i.getValue());
                            }
	                        timer.getElapsedTime();
                    	}
                    	else if (ordenar==5) {
	                    	timer.start();
	                        IntroSort.sort(small_integer_entrie, ordemDeOrdenacao);
	                        timer.stop();
	                        for (Element i : small_integer_entrie) {
	                            System.out.println(i.getKey() + " " + i.getValue());
                            }
	                        timer.getElapsedTime();
                    	}
                    	else if (ordenar==6) {
	                    	timer.start();
	                        TreeSort.sort(small_integer_entrie, ordemDeOrdenacao);
	                        timer.stop();
	                        for (Element i : small_integer_entrie) {
	                            System.out.println(i.getKey() + " " + i.getValue());
                            }
	                        timer.getElapsedTime();
                    	}
                    	else {
                    	    System.out.println("Informe Um Valor Válido!");
                    	    main(args);
                    	}
                     }
                    else if (formato == 2) {
                    	if (ordenar==1) {
		                    timer.start();
		                    SelectionSort.sort(small_double_entrie, ordemDeOrdenacao);
		                    timer.stop();
		                    for (Element i : small_double_entrie) {
		                        System.out.println(i.getKey() + " " + i.getValue());
                            }
		                    timer.getElapsedTime();
                    	}
                    	else if (ordenar==2) {
	                    	timer.start();
	                        QuickSort.sort(small_double_entrie, ordemDeOrdenacao);
	                        timer.stop();
	                        for (Element i : small_double_entrie) {
	                            System.out.println(i.getKey() + " " + i.getValue());
                            }
	                        timer.getElapsedTime();
                    	}
                    	else if (ordenar==3) {
	                    	timer.start();
	                        MergeSort.sort(small_double_entrie, ordemDeOrdenacao);
	                        timer.stop();
	                        for (Element i : small_double_entrie) {
	                            System.out.println(i.getKey() + " " + i.getValue());
                            }
	                        timer.getElapsedTime();
                    	}
                    	else if (ordenar==4) {
	                    	timer.start();
	                        HeapSort.sort(small_double_entrie, ordemDeOrdenacao);
	                        timer.stop();
	                        for (Element i : small_double_entrie) {
	                            System.out.println(i.getKey() + " " + i.getValue());
                            }
	                        timer.getElapsedTime();
                    	}
                    	else if (ordenar==5) {
	                    	timer.start();
	                        IntroSort.sort(small_double_entrie, ordemDeOrdenacao);
	                        timer.stop();
	                        for (Element i : small_double_entrie) {
	                            System.out.println(i.getKey() + " " + i.getValue());
                            }
	                        timer.getElapsedTime();
                    	}
                    	else if (ordenar==6) {
	                    	timer.start();
	                        TreeSort.sort(small_double_entrie, ordemDeOrdenacao);
	                        timer.stop();
	                        for (Element i : small_double_entrie) {
	                            System.out.println(i.getKey() + " " + i.getValue());
                            }
	                        timer.getElapsedTime();
                    	}
                    	else {
                    	    System.out.println("Informe Um Valor Válido!");
                    	    main(args);
                    	}
                     }
                    else if (formato == 3) {
                    	if (ordenar==1) {
		                    timer.start();
		                    SelectionSort.sort(small_string_entrie, ordemDeOrdenacao);
		                    timer.stop();
		                    for (Element i : small_string_entrie) {
		                        System.out.println(i.getKey() + " " + i.getValue());
                            }
		                    timer.getElapsedTime();
                    	}
                    	else if (ordenar==2) {
	                    	timer.start();
	                        QuickSort.sort(small_string_entrie, ordemDeOrdenacao);
	                        timer.stop();
	                        for (Element i : small_string_entrie) {
	                            System.out.println(i.getKey() + " " + i.getValue());
                            }
	                        timer.getElapsedTime();
                    	}
                    	else if (ordenar==3) {
	                    	timer.start();
	                        MergeSort.sort(small_string_entrie, ordemDeOrdenacao);
	                        timer.stop();
	                        for (Element i : small_string_entrie) {
	                            System.out.println(i.getKey() + " " + i.getValue());
                            }
	                        timer.getElapsedTime();
                    	}
                    	else if (ordenar==4) {
	                    	timer.start();
	                        HeapSort.sort(small_string_entrie, ordemDeOrdenacao);
	                        timer.stop();
	                        for (Element i : small_string_entrie) {
	                            System.out.println(i.getKey() + " " + i.getValue());
                            }
	                        timer.getElapsedTime();
                    	}
                    	else if (ordenar==5) {
	                    	timer.start();
	                        IntroSort.sort(small_string_entrie, ordemDeOrdenacao);
	                        timer.stop();
	                        for (Element i : small_string_entrie) {
	                            System.out.println(i.getKey() + " " + i.getValue());
                            }
	                        timer.getElapsedTime();
                    	}
                    	else if (ordenar==6) {
	                    	timer.start();
	                        TreeSort.sort(small_string_entrie, ordemDeOrdenacao);
	                        timer.stop();
	                        for (Element i : small_string_entrie) {
	                            System.out.println(i.getKey() + " " + i.getValue());
                            }
	                        timer.getElapsedTime();
                    	}
                    	else {
                    	    System.out.println("Informe Um Valor Válido!");
                    	    main(args);
                    	}
                     }
                    else {
                    	System.out.println("Informe Um Valor Válido!");
                	    main(args);
                    }
                    break;
                    
                case 2:
                	
                	if (formato == 1) {
                    	if (ordenar==1) {
		                    timer.start();
		                    SelectionSort.sort(medium_integer_entrie, ordemDeOrdenacao);
		                    timer.stop();
		                    for (Element i : medium_integer_entrie) {
		                        System.out.println(i.getKey() + " " + i.getValue());
                            }
		                    timer.getElapsedTime();
                    	}
                    	else if (ordenar==2) {
	                    	timer.start();
	                        QuickSort.sort(medium_integer_entrie, ordemDeOrdenacao);
	                        timer.stop();
	                        for (Element i : medium_integer_entrie) {
	                            System.out.println(i.getKey() + " " + i.getValue());
                            }
	                        timer.getElapsedTime();
                    	}
                    	else if (ordenar==3) {
	                    	timer.start();
	                        MergeSort.sort(medium_integer_entrie, ordemDeOrdenacao);
	                        timer.stop();
	                        for (Element i : medium_integer_entrie) {
	                            System.out.println(i.getKey() + " " + i.getValue());
                            }
	                        timer.getElapsedTime();
                    	}
                    	else if (ordenar==4) {
	                    	timer.start();
	                        HeapSort.sort(medium_integer_entrie, ordemDeOrdenacao);
	                        timer.stop();
	                        for (Element i : medium_integer_entrie) {
	                            System.out.println(i.getKey() + " " + i.getValue());
                            }
	                        timer.getElapsedTime();
                    	}
                    	else if (ordenar==5) {
	                    	timer.start();
	                        IntroSort.sort(medium_integer_entrie, ordemDeOrdenacao);
	                        timer.stop();
	                        for (Element i : medium_integer_entrie) {
	                            System.out.println(i.getKey() + " " + i.getValue());
                            }
	                        timer.getElapsedTime();
                    	}
                    	else if (ordenar==6) {
	                    	timer.start();
	                        TreeSort.sort(medium_integer_entrie, ordemDeOrdenacao);
	                        timer.stop();
	                        for (Element i : medium_integer_entrie) {
	                            System.out.println(i.getKey() + " " + i.getValue());
                            }
	                        timer.getElapsedTime();
                    	}
                    	else {
                    	    System.out.println("Informe Um Valor Válido!");
                    	    main(args);
                    	}
                     }
                    else if (formato == 2) {
                    	if (ordenar==1) {
		                    timer.start();
		                    SelectionSort.sort(medium_double_entrie, ordemDeOrdenacao);
		                    timer.stop();
		                    for (Element i : medium_double_entrie) {
		                        System.out.println(i.getKey() + " " + i.getValue());
                            }
		                    timer.getElapsedTime();
                    	}
                    	else if (ordenar==2) {
	                    	timer.start();
	                        QuickSort.sort(medium_double_entrie, ordemDeOrdenacao);
	                        timer.stop();
	                        for (Element i : medium_double_entrie) {
	                            System.out.println(i.getKey() + " " + i.getValue());
                            }
	                        timer.getElapsedTime();
                    	}
                    	else if (ordenar==3) {
	                    	timer.start();
	                        MergeSort.sort(medium_double_entrie, ordemDeOrdenacao);
	                        timer.stop();
	                        for (Element i : medium_double_entrie) {
	                            System.out.println(i.getKey() + " " + i.getValue());
                            }
	                        timer.getElapsedTime();
                    	}
                    	else if (ordenar==4) {
	                    	timer.start();
	                        HeapSort.sort(medium_double_entrie, ordemDeOrdenacao);
	                        timer.stop();
	                        for (Element i : medium_double_entrie) {
	                            System.out.println(i.getKey() + " " + i.getValue());
                            }
	                        timer.getElapsedTime();
                    	}
                    	else if (ordenar==5) {
	                    	timer.start();
	                        IntroSort.sort(medium_double_entrie, ordemDeOrdenacao);
	                        timer.stop();
	                        for (Element i : medium_double_entrie) {
	                            System.out.println(i.getKey() + " " + i.getValue());
                            }
	                        timer.getElapsedTime();
                    	}
                    	else if (ordenar==6) {
	                    	timer.start();
	                        TreeSort.sort(medium_double_entrie, ordemDeOrdenacao);
	                        timer.stop();
	                        for (Element i : medium_double_entrie) {
	                            System.out.println(i.getKey() + " " + i.getValue());
                            }
	                        timer.getElapsedTime();
                    	}
                    	else {
                    	    System.out.println("Informe Um Valor Válido!");
                    	    main(args);
                    	}
                     }
                    else if (formato == 3) {
                    	if (ordenar==1) {
		                    timer.start();
		                    SelectionSort.sort(medium_string_entrie, ordemDeOrdenacao);
		                    timer.stop();
		                    for (Element i : medium_string_entrie) {
		                        System.out.println(i.getKey() + " " + i.getValue());
                            }
		                    timer.getElapsedTime();
                    	}
                    	else if (ordenar==2) {
	                    	timer.start();
	                        QuickSort.sort(medium_string_entrie, ordemDeOrdenacao);
	                        timer.stop();
	                        for (Element i : medium_string_entrie) {
	                            System.out.println(i.getKey() + " " + i.getValue());
                            }
	                        timer.getElapsedTime();
                    	}
                    	else if (ordenar==3) {
	                    	timer.start();
	                        MergeSort.sort(medium_string_entrie, ordemDeOrdenacao);
	                        timer.stop();
	                        for (Element i : medium_string_entrie) {
	                            System.out.println(i.getKey() + " " + i.getValue());
                            }
	                        timer.getElapsedTime();
                    	}
                    	else if (ordenar==4) {
	                    	timer.start();
	                        HeapSort.sort(medium_string_entrie, ordemDeOrdenacao);
	                        timer.stop();
	                        for (Element i : medium_string_entrie) {
	                            System.out.println(i.getKey() + " " + i.getValue());
                            }
	                        timer.getElapsedTime();
                    	}
                    	else if (ordenar==5) {
	                    	timer.start();
	                        IntroSort.sort(medium_string_entrie, ordemDeOrdenacao);
	                        timer.stop();
	                        for (Element i : medium_string_entrie) {
	                            System.out.println(i.getKey() + " " + i.getValue());
                            }
	                        timer.getElapsedTime();
                    	}
                    	else if (ordenar==6) {
	                    	timer.start();
	                        TreeSort.sort(medium_string_entrie, ordemDeOrdenacao);
	                        timer.stop();
	                        for (Element i : medium_string_entrie) {
	                            System.out.println(i.getKey() + " " + i.getValue());
                            }
	                        timer.getElapsedTime();
                    	}
                    	else {
                    	    System.out.println("Informe Um Valor Válido!");
                    	    main(args);
                    	}
                     }
                    else {
                    	System.out.println("Informe Um Valor Válido!");
                	    main(args);
                    }
                	break;
                	
                case 3:
                	
                	if (formato == 1) {
                    	if (ordenar==1) {
		                    timer.start();
		                    SelectionSort.sort(big_integer_entrie, ordemDeOrdenacao);
		                    timer.stop();
		                    for (Element i : big_integer_entrie) {
		                        System.out.println(i.getKey() + " " + i.getValue());
                            }
		                    timer.getElapsedTime();
                    	}
                    	else if (ordenar==2) {
	                    	timer.start();
	                        QuickSort.sort(big_integer_entrie, ordemDeOrdenacao);
	                        timer.stop();
	                        for (Element i : big_integer_entrie) {
	                            System.out.println(i.getKey() + " " + i.getValue());
                            }
	                        timer.getElapsedTime();
                    	}
                    	else if (ordenar==3) {
	                    	timer.start();
	                        MergeSort.sort(big_integer_entrie, ordemDeOrdenacao);
	                        timer.stop();
	                        for (Element i : big_integer_entrie) {
	                            System.out.println(i.getKey() + " " + i.getValue());
                            }
	                        timer.getElapsedTime();
                    	}
                    	else if (ordenar==4) {
	                    	timer.start();
	                        HeapSort.sort(big_integer_entrie, ordemDeOrdenacao);
	                        timer.stop();
	                        for (Element i : big_integer_entrie) {
	                            System.out.println(i.getKey() + " " + i.getValue());
                            }
	                        timer.getElapsedTime();
                    	}
                    	else if (ordenar==5) {
	                    	timer.start();
	                        IntroSort.sort(big_integer_entrie, ordemDeOrdenacao);
	                        timer.stop();
	                        for (Element i : big_integer_entrie) {
	                            System.out.println(i.getKey() + " " + i.getValue());
                            }
	                        timer.getElapsedTime();
                    	}
                    	else if (ordenar==6) {
	                    	timer.start();
	                        TreeSort.sort(big_integer_entrie, ordemDeOrdenacao);
	                        timer.stop();
	                        for (Element i : big_integer_entrie) {
	                            System.out.println(i.getKey() + " " + i.getValue());
                            }
	                        timer.getElapsedTime();
                    	}
                    	else {
                    	    System.out.println("Informe Um Valor Válido!");
                    	    main(args);
                    	}
                     }
                    else if (formato == 2) {
                    	if (ordenar==1) {
		                    timer.start();
		                    SelectionSort.sort(big_double_entrie, ordemDeOrdenacao);
		                    timer.stop();
		                    for (Element i : big_double_entrie) {
		                        System.out.println(i.getKey() + " " + i.getValue());
                            }
		                    timer.getElapsedTime();
                    	}
                    	else if (ordenar==2) {
	                    	timer.start();
	                        QuickSort.sort(big_double_entrie, ordemDeOrdenacao);
	                        timer.stop();
	                        for (Element i : big_double_entrie) {
	                            System.out.println(i.getKey() + " " + i.getValue());
                            }
	                        timer.getElapsedTime();
                    	}
                    	else if (ordenar==3) {
	                    	timer.start();
	                        MergeSort.sort(big_double_entrie, ordemDeOrdenacao);
	                        timer.stop();
	                        for (Element i : big_double_entrie) {
	                            System.out.println(i.getKey() + " " + i.getValue());
                            }
	                        timer.getElapsedTime();
                    	}
                    	else if (ordenar==4) {
	                    	timer.start();
	                        HeapSort.sort(big_double_entrie, ordemDeOrdenacao);
	                        timer.stop();
	                        for (Element i : big_double_entrie) {
	                            System.out.println(i.getKey() + " " + i.getValue());
                            }
	                        timer.getElapsedTime();
                    	}
                    	else if (ordenar==5) {
	                    	timer.start();
	                        IntroSort.sort(big_double_entrie, ordemDeOrdenacao);
	                        timer.stop();
	                        for (Element i : big_double_entrie) {
	                            System.out.println(i.getKey() + " " + i.getValue());
                            }
	                        timer.getElapsedTime();
                    	}
                    	else if (ordenar==6) {
	                    	timer.start();
	                        TreeSort.sort(big_double_entrie, ordemDeOrdenacao);
	                        timer.stop();
	                        for (Element i : big_double_entrie) {
	                            System.out.println(i.getKey() + " " + i.getValue());
                            }
	                        timer.getElapsedTime();
                    	}
                    	else {
                    	    System.out.println("Informe Um Valor Válido!");
                    	    main(args);
                    	}
                     }
                    else if (formato == 3) {
                    	if (ordenar==1) {
		                    timer.start();
		                    SelectionSort.sort(big_string_entrie, ordemDeOrdenacao);
		                    timer.stop();
		                    for (Element i : big_string_entrie) {
		                        System.out.println(i.getKey() + " " + i.getValue());
                            }
		                    timer.getElapsedTime();
                    	}
                    	else if (ordenar==2) {
	                    	timer.start();
	                        QuickSort.sort(big_string_entrie, ordemDeOrdenacao);
	                        timer.stop();
	                        for (Element i : big_string_entrie) {
	                            System.out.println(i.getKey() + " " + i.getValue());
                            }
	                        timer.getElapsedTime();
                    	}
                    	else if (ordenar==3) {
	                    	timer.start();
	                        MergeSort.sort(big_string_entrie, ordemDeOrdenacao);
	                        timer.stop();
	                        for (Element i : big_string_entrie) {
	                            System.out.println(i.getKey() + " " + i.getValue());
                            }
	                        timer.getElapsedTime();
                    	}
                    	else if (ordenar==4) {
	                    	timer.start();
	                        HeapSort.sort(big_string_entrie, ordemDeOrdenacao);
	                        timer.stop();
	                        for (Element i : big_string_entrie) {
	                            System.out.println(i.getKey() + " " + i.getValue());
                            }
	                        timer.getElapsedTime();
                    	}
                    	else if (ordenar==5) {
	                    	timer.start();
	                        IntroSort.sort(big_string_entrie, ordemDeOrdenacao);
	                        timer.stop();
	                        for (Element i : big_string_entrie) {
	                            System.out.println(i.getKey() + " " + i.getValue());
                            }
	                        timer.getElapsedTime();
                    	}
                    	else if (ordenar==6) {
	                    	timer.start();
	                        TreeSort.sort(big_string_entrie, ordemDeOrdenacao);
	                        timer.stop();
	                        for (Element i : big_string_entrie) {
	                            System.out.println(i.getKey() + " " + i.getValue());
                            }
	                        timer.getElapsedTime();
                    	}
                    	else {
                    	    System.out.println("Informe Um Valor Válido!");
                    	    main(args);
                    	}
                     }
                    else {
                    	System.out.println("Informe Um Valor Válido!");
                	    main(args);
                    }
                	break;
                
                case 4:
                    System.out.println("PROGRAMA ENCERRADO!");
                    contador = 2;
                    break;
                default:
                    System.out.println("INFORME UM VALOR VÁLIDO");
            }
        }
    }
}
