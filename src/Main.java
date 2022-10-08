import java.util.Scanner;
import java.util.Random;
import java.util.Timer;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Sort<Double> sortDouble = new Sort<Double>();
        Sort<Integer> sortInteger = new Sort<Integer>();
        Sort<String> sortString = new Sort<String>();

        Scanner entrada = new Scanner(System.in);
        Random gerador = new Random();

        int contador = 1, ordem, tamanho;
        Timer timer1 = new Timer();

        while (contador == 1) {

            System.out.println("\n1-Teste Pequeno (Mil Elementos)");
            System.out.println("2-Teste Médio (Cem Mil Elementos)");
            System.out.println("3-Teste Grande (Um Milhão de Elementos)");
            System.out.println("4-Ordenar Vetor Próprio");
            System.out.println("5-Encerrar Execução do Programa");

            int variavel = entrada.nextInt();
            int formato, ordenar;

            System.out.print("\nPressione Um para Ordenar em Ordem Crescente ou Dois para Decrescente:");

            if (entrada.nextInt() == 2) {
                sortDouble.setAscending(false);
                sortInteger.setAscending(false);
                sortString.setAscending(false);
            }

            System.out.println("\nPressione um para Double dois para Integer ou três para String:");

            formato = entrada.nextInt();

            System.out.println("\n1-Selection Sort\n2-Quick Sort\n3-Merge Sort\n4-Heap Sort");

            ordenar = entrada.nextInt();

            switch (variavel) {
                case 1:
                    if (formato == 1) {
                        long comecoDaContagem = System.nanoTime();

                        Double[] vectorDouble = new Double[1000];

                        for (int i = 0; i < vectorDouble.length; i++) {
                            //verificar se a função nextDouble() continua funcionando após tirar os parâmetros
                            vectorDouble[i] = gerador.nextDouble();
                            while (vectorDouble[i] < 10) {
                                vectorDouble[i] = gerador.nextDouble(100);
                            }
                        }
                      if(ordenar==1){
                        vectorDouble = sortDouble.selectionSort(vectorDouble);
                      }
                      if(ordenar==2){
                        vectorDouble = sortDouble.quickSort(vectorDouble, 0, vectorDouble.length-1);
                      }

                        for (int i = 0; i < vectorDouble.length; i++) {
                            System.out.println(vectorDouble[i]);
                        }
                        long tempoFinal = System.nanoTime();
                        long tempoDecorrido = tempoFinal - comecoDaContagem;
                        System.out.println("Tempo de execução em milesegundos: " + (tempoDecorrido) / 1000000);
                    } else if (formato == 2) {
                        long comecoDaContagem = System.nanoTime();

                        Integer[] vectorInteger = new Integer[1000];

                        for (int i = 0; i < vectorInteger.length; i++) {
                            vectorInteger[i] = gerador.nextInt(100);
                            while (vectorInteger[i] < 10) {
                                vectorInteger[i] = gerador.nextInt(100);
                            }
                        }

                        if(ordenar==1){
                          vectorInteger = sortInteger.selectionSort(vectorInteger);
                        }
                        if(ordenar==2){
                          vectorInteger = sortInteger.quickSort(vectorInteger, 0, vectorInteger.length-1);
                        }

                        for (int i = 0; i < vectorInteger.length; i++) {
                            System.out.println(vectorInteger[i]);
                        }
                        long tempoFinal = System.nanoTime();
                        long tempoDecorrido = tempoFinal - comecoDaContagem;
                        System.out.println("Tempo de execução em milesegundos: " + (tempoDecorrido) / 1000000);
                    } else if (formato == 3) {
                        long comecoDaContagem = System.nanoTime();

                        String[] vectorString = new String[1000];
                        int leftLimit = 48; // numeral '0'
                        int rightLimit = 122; // letra 'z'
                        int targetStringLength = 10;
                        Random random = new Random();


                        for (int i = 0; i < vectorString.length; i++) {
                            String generatedString = random.ints(leftLimit, rightLimit + 1)
                                    .filter(j -> (j <= 57 || j >= 65) && (j <= 90 || j >= 97))
                                    .limit(targetStringLength)
                                    .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                                    .toString();
                            vectorString[i] = generatedString;
                        }

                        if(ordenar==1){
                          vectorString = sortString.selectionSort(vectorString);
                        }
                        if(ordenar==2){
                          vectorString = sortString.quickSort(vectorString, 0, vectorString.length-1);
                        }

                        for (int i = 0; i < vectorString.length; i++) {
                            System.out.println(vectorString[i]);
                        }
                        long tempoFinal = System.nanoTime();
                        long tempoDecorrido = tempoFinal - comecoDaContagem;
                        System.out.println("Tempo de execução em milesegundos: " + (tempoDecorrido) / 1000000);
                    } else {
                        System.out.println("INFORME UM VALOR VÁLIDO!");
                    }

                    break;
                case 2:

                    if (formato == 1) {
                        long comecoDaContagem = System.nanoTime();

                        Double[] vectorDouble = new Double[100000];

                        for (int i = 0; i < vectorDouble.length; i++) {
                            vectorDouble[i] = gerador.nextDouble();
                            while (vectorDouble[i] < 10) {
                                vectorDouble[i] = gerador.nextDouble(100);
                            }
                        }

                        if(ordenar==1){
                          vectorDouble = sortDouble.selectionSort(vectorDouble);
                        }
                        if(ordenar==2){
                          vectorDouble = sortDouble.quickSort(vectorDouble, 0, vectorDouble.length-1);
                        }

                        for (int i = 0; i < vectorDouble.length; i++) {
                            System.out.println(vectorDouble[i]);
                        }
                        long tempoFinal = System.nanoTime();
                        long tempoDecorrido = tempoFinal - comecoDaContagem;
                        System.out.println("Tempo de execução em milesegundos: " + (tempoDecorrido) / 1000000);
                    } else if (formato == 2) {
                        long comecoDaContagem = System.nanoTime();

                        Integer[] vectorInteger = new Integer[100000];

                        for (int i = 0; i < vectorInteger.length; i++) {
                            vectorInteger[i] = gerador.nextInt(100);
                            while (vectorInteger[i] < 10) {
                                vectorInteger[i] = gerador.nextInt(100);
                            }
                        }

                        if(ordenar==1){
                          vectorInteger = sortInteger.selectionSort(vectorInteger);
                        }
                        if(ordenar==2){
                          vectorInteger = sortInteger.quickSort(vectorInteger, 0, vectorInteger.length-1);
                        }

                        for (int i = 0; i < vectorInteger.length; i++) {
                            System.out.println(vectorInteger[i]);
                        }
                        long tempoFinal = System.nanoTime();
                        long tempoDecorrido = tempoFinal - comecoDaContagem;
                        System.out.println("Tempo de execução em milesegundos: " + (tempoDecorrido) / 1000000);
                    } else if (formato == 3) {
                        long comecoDaContagem = System.nanoTime();

                        String[] vectorString = new String[100000];
                        int leftLimit = 48; // numeral '0'
                        int rightLimit = 122; // letra 'z'
                        int targetStringLength = 10;
                        Random random = new Random();


                        for (int i = 0; i < vectorString.length; i++) {
                            String generatedString = random.ints(leftLimit, rightLimit + 1)
                                    .filter(j -> (j <= 57 || j >= 65) && (j <= 90 || j >= 97))
                                    .limit(targetStringLength)
                                    .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                                    .toString();
                            vectorString[i] = generatedString;
                        }

                        if(ordenar==1){
                          vectorString = sortString.selectionSort(vectorString);
                        }
                        if(ordenar==2){
                          vectorString = sortString.quickSort(vectorString, 0, vectorString.length-1);
                        }


                        for (int i = 0; i < vectorString.length; i++) {
                            System.out.println(vectorString[i]);
                        }
                        long tempoFinal = System.nanoTime();
                        long tempoDecorrido = tempoFinal - comecoDaContagem;
                        System.out.println("Tempo de execução em milesegundos: " + (tempoDecorrido) / 1000000);
                    } else {
                        System.out.println("INFORME UM VALOR VÁLIDO!");
                    }
                    break;
                case 3:

                    if (formato == 1) {
                        long comecoDaContagem = System.nanoTime();

                        Double[] vectorDouble = new Double[1000000];

                        for (int i = 0; i < vectorDouble.length; i++) {
                            vectorDouble[i] = gerador.nextDouble();
                            while (vectorDouble[i] < 10) {
                                vectorDouble[i] = gerador.nextDouble(100);
                            }
                        }

                        if(ordenar==1){
                          vectorDouble = sortDouble.selectionSort(vectorDouble);
                        }
                        if(ordenar==2){
                          vectorDouble = sortDouble.quickSort(vectorDouble, 0, vectorDouble.length-1);
                        }

                        for (int i = 0; i < vectorDouble.length; i++) {
                            System.out.println(vectorDouble[i]);
                        }
                        long tempoFinal = System.nanoTime();
                        long tempoDecorrido = tempoFinal - comecoDaContagem;
                        System.out.println("Tempo de execução em milesegundos: " + (tempoDecorrido) / 1000000);
                    } else if (formato == 2) {
                        long comecoDaContagem = System.nanoTime();

                        Integer[] vectorInteger = new Integer[1000000];

                        for (int i = 0; i < vectorInteger.length; i++) {
                            vectorInteger[i] = gerador.nextInt(100);
                            while (vectorInteger[i] < 10) {
                                vectorInteger[i] = gerador.nextInt(100);
                            }
                        }

                        if(ordenar==1){
                          vectorInteger = sortInteger.selectionSort(vectorInteger);
                        }
                        if(ordenar==2){
                          vectorInteger = sortInteger.quickSort(vectorInteger, 0, vectorInteger.length-1);
                        }

                        for (int i = 0; i < vectorInteger.length; i++) {
                            System.out.println(vectorInteger[i]);
                        }
                        long tempoFinal = System.nanoTime();
                        long tempoDecorrido = tempoFinal - comecoDaContagem;
                        System.out.println("Tempo de execução em milesegundos: " + (tempoDecorrido) / 1000000);
                    } else if (formato == 3) {
                        long comecoDaContagem = System.nanoTime();

                        String[] vectorString = new String[1000000];
                        int leftLimit = 48; // numeral '0'
                        int rightLimit = 122; // letra 'z'
                        int targetStringLength = 10;
                        Random random = new Random();


                        for (int i = 0; i < vectorString.length; i++) {
                            String generatedString = random.ints(leftLimit, rightLimit + 1)
                                    .filter(j -> (j <= 57 || j >= 65) && (j <= 90 || j >= 97))
                                    .limit(targetStringLength)
                                    .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                                    .toString();
                            vectorString[i] = generatedString;
                        }

                        if(ordenar==1){
                          vectorString = sortString.selectionSort(vectorString);
                        }
                        if(ordenar==2){
                          vectorString = sortString.quickSort(vectorString, 0, vectorString.length-1);
                        }

                        for (int i = 0; i < vectorString.length; i++) {
                            System.out.println(vectorString[i]);
                        }
                        long tempoFinal = System.nanoTime();
                        long tempoDecorrido = tempoFinal - comecoDaContagem;
                        System.out.println("Tempo de execução em milesegundos: " + (tempoDecorrido) / 1000000);
                    } else {
                        System.out.println("INFORME UM VALOR VÁLIDO!");
                    }
                    break;
                case 4:

                    System.out.println("Informe o Número de Elementos que o Vetor Possui:");
                    tamanho = entrada.nextInt();
                    if (formato == 1) {

                        Double[] vectorDouble = new Double[tamanho];
                        for (int i = 0; i < tamanho; i++) {
                            int k = i;
                            System.out.println("Informe o Elemento " + (k + 1) + " do Vetor:");
                            vectorDouble[i] = entrada.nextDouble();
                        }
                        long comecoDaContagem = System.nanoTime();

                        //sort selection com double
                        if(ordenar==1){
                            vectorDouble = sortDouble.selectionSort(vectorDouble);
                          }
                          if(ordenar==2){
                            vectorDouble = sortDouble.quickSort(vectorDouble, 0, vectorDouble.length-1);
                          }
                        for (int i = 0; i < vectorDouble.length; i++) {
                            System.out.println(vectorDouble[i]);
                        }
                        long tempoFinal = System.nanoTime();
                        long tempoDecorrido = tempoFinal - comecoDaContagem;
                        System.out.println("Tempo de execução em milesegundos: " + (tempoDecorrido) / 1000000);
                    }
                    if (formato == 2) {

                        Integer[] vectorInteger = new Integer[tamanho];
                        for (int i = 0; i < tamanho; i++) {
                            int k = i;
                            System.out.println("Informe o Elemento " + (k + 1) + " do Vetor:");
                            vectorInteger[i] = entrada.nextInt();
                        }
                        long comecoDaContagem = System.nanoTime();

                        if(ordenar==1){
                          vectorInteger = sortInteger.selectionSort(vectorInteger);
                        }
                        if(ordenar==2){
                          vectorInteger = sortInteger.quickSort(vectorInteger, 0, vectorInteger.length-1);
                        }

                        for (int i = 0; i < vectorInteger.length; i++) {
                            System.out.println(vectorInteger[i]);
                        }
                        long tempoFinal = System.nanoTime();
                        long tempoDecorrido = tempoFinal - comecoDaContagem;
                        System.out.println("Tempo de execução em milesegundos: " + (tempoDecorrido) / 1000000);
                    }
                    if (formato == 3) {

                        String[] vectorString = new String[tamanho];
                        for (int i = 0; i < tamanho; i++) {
                            int k = i;
                            System.out.println("Informe o Elemento " + (k + 1) + " do Vetor:");
                            vectorString[i] = entrada.nextLine();
                        }
                        long comecoDaContagem = System.nanoTime();

                        vectorString = sortString.selectionSort(vectorString);
                        if(ordenar==1){
                          vectorString = sortString.selectionSort(vectorString);
                        }
                        if(ordenar==2){
                          vectorString = sortString.quickSort(vectorString, 0, vectorString.length-1);
                        }


                        for (int i = 0; i < vectorStringPessoal.length; i++) {
                            System.out.println(vectorStringPessoal[i]);
                        }
                        long tempoFinal = System.nanoTime();
                        long tempoDecorrido = tempoFinal - comecoDaContagem;
                        System.out.println("Tempo de execução em milesegundos: " + (tempoDecorrido) / 1000000);
                    }

                    break;
                case 5:
                    System.out.println("PROGRAMA ENCERRADO!");
                    contador = 2;
                    break;
                default:
                    System.out.println("INFORME UM VALOR VÁLIDO");
            }
        }
    }
}
