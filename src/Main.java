import java.util.Scanner;
import java.util.Random;
import java.util.Timer;

public class Main {
    public static void main(String[] args) {
        Sort<Double> sortDouble = new Sort<Double>();
        Sort<Double> sortDoubleMedio = new Sort<Double>();
        Sort<Double> sortDoubleGrande = new Sort<Double>();
        SortDecrescente<Double> sortDecrescenteDouble = new SortDecrescente<Double>();
        Sort<Integer> sortInteger = new Sort<Integer>();
        Sort<String> sortS = new Sort<String>();

      
        Scanner entrada = new Scanner(System.in);
        Random gerador = new Random();
      
        int contador=1, ordem, tamanho;
        Timer timer1 = new Timer();
        
        while(contador==1){
          
          System.out.println("\n1-Teste Pequeno (Mil Elementos)");
          System.out.println("2-Teste Médio (Cem Mil Elementos)");
          System.out.println("3-Teste Grande (Um Milhão de Elementos)");
          System.out.println("4-Ordenar Vetor Próprio");
          System.out.println("5-Encerrar Execução do Programa");
          
          int variavel = entrada.nextInt();
          
          System.out.print("\nPressione Um para Ordenar em Ordem Crescente ou Dois para Decrescente:");
          
          ordem = entrada.nextInt();
          sortDouble.setOrdem(ordem);
          
          switch(variavel){
            case 1:
              
              Double[] vectorDouble= new Double[1000];
              
              for(int i = 0;i<vectorDouble.length;i++){
                vectorDouble[i]=gerador.nextDouble(100);
              }
                          
              vectorDouble = sortDouble.selectionSort(vectorDouble);
              
              for (int i = 0; i < vectorDouble.length; i++) {
                  System.out.println(vectorDouble[i]);
              }
      
              break;
            case 2:
              
              Double[] vectorDoubleMedio= new Double[100000];
              
              for(int i = 0;i<vectorDoubleMedio.length;i++){
                vectorDoubleMedio[i]=gerador.nextDouble(100);
              }

              vectorDoubleMedio = sortDouble.selectionSort(vectorDoubleMedio);
              
              for (int i = 0; i < vectorDoubleMedio.length; i++) {
                  System.out.println(vectorDoubleMedio[i]);
              }
              break;
            case 3:
              
              Double[] vectorDoubleGrande= new Double[1000000];
              
              for(int i = 0;i<vectorDoubleGrande.length;i++){
                vectorDoubleGrande[i]=gerador.nextDouble(100);
              }

              vectorDoubleGrande = sortDouble.selectionSort(vectorDoubleGrande);
              
              for (int i = 0; i < vectorDoubleGrande.length; i++) {
                  System.out.println(vectorDoubleGrande[i]);
              }
              break;
            case 4:
              
              System.out.println("Informe o Número de Elementos que o Vetor Possui:");
              tamanho = entrada.nextInt();
              Double[] vectorDoublePessoal= new Double[tamanho];
              
              for(int i = 0;i<tamanho;i++){
                System.out.println("Informe o Elemento "+ (i+1)+" do Vetor:");
                vectorDoublePessoal[i]=entrada.nextDouble();
              }
              
              //sort selection com double
              vectorDoublePessoal = sortDouble.selectionSort(vectorDoublePessoal);         
                
              for (int i = 0; i < vectorDoublePessoal.length; i++) {
                  System.out.println(vectorDoublePessoal[i]);
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
