import java.util.Scanner;
import java.util.Random;
import java.util.Timer;

public class Main {
    public static void main(String[] args) {
        Sort<Double> sortDouble = new Sort<Double>();
        Sort<Integer> sortInteger = new Sort<Integer>();
        Sort<String> sortString = new Sort<String>();
      
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
          int formato;
          
          System.out.print("\nPressione Um para Ordenar em Ordem Crescente ou Dois para Decrescente:");
            
          ordem = entrada.nextInt();
            
          System.out.println("\nPressione um para Double dois para Integer ou três para String:");
          
          formato = entrada.nextInt();
            
          if(formato==1){
            sortDouble.setOrdem(ordem);
          }
          if(formato==2){
            sortInteger.setOrdem(ordem);
          }
          if(formato==3){
            sortString.setOrdem(ordem);  
          }            
          
          switch(variavel){
            case 1:           
              if (formato==1){
                
                Double[] vectorDouble= new Double[1000];
                
                for(int i = 0;i<vectorDouble.length;i++){
                  vectorDouble[i]=gerador.nextDouble(100);
                  while(vectorDouble[i]<10){
                    vectorDouble[i]=gerador.nextDouble(100);
                  }
                }
                            
                vectorDouble = sortDouble.selectionSort(vectorDouble);
                
                for (int i = 0; i < vectorDouble.length; i++) {
                    System.out.println(vectorDouble[i]);
                }
              }
                
            else if (formato==2){
                Integer[] vectorInteger = new Integer[1000];
                
                for(int i = 0;i<vectorInteger.length;i++){
                  vectorInteger[i]=gerador.nextInt(100);
                  while(vectorInteger[i]<10){
                    vectorInteger[i]=gerador.nextInt(100);
                  }
                }
                            
                vectorInteger = sortInteger.selectionSort(vectorInteger);
                
                for (int i = 0; i < vectorInteger.length; i++) {
                    System.out.println(vectorInteger[i]);
                }
              }
              
            else if (formato==3){
                String[] vectorString= new String[1000];
                int leftLimit = 48; // numeral '0'
                int rightLimit = 122; // letra 'z'
                int targetStringLength = 10;
                Random random = new Random();
            
                
                for(int i = 0;i<vectorString.length;i++){
                  String generatedString = random.ints(leftLimit, rightLimit + 1)
                  .filter(j -> (j <= 57 || j >= 65) && (j <= 90 || j >= 97))
                  .limit(targetStringLength)
                  .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                  .toString();
                  vectorString[i]=generatedString;
                }
                            
                vectorString = sortString.selectionSort(vectorString);
                
                for (int i = 0; i < vectorString.length; i++) {
                    System.out.println(vectorString[i]);
                }
              }

            else{
              System.out.println("INFORME UM VALOR VÁLIDO!");
            }
              
              break;
            case 2:
              
              if (formato==1){
                
                Double[] vectorDouble= new Double[100000];
                
                for(int i = 0;i<vectorDouble.length;i++){
                  vectorDouble[i]=gerador.nextDouble(100);
                  while(vectorDouble[i]<10){
                    vectorDouble[i]=gerador.nextDouble(100);
                  }
                }
                            
                vectorDouble = sortDouble.selectionSort(vectorDouble);
                
                for (int i = 0; i < vectorDouble.length; i++) {
                    System.out.println(vectorDouble[i]);
                }
              }
                
            else if (formato==2){
                Integer[] vectorInteger = new Integer[100000];
                
                for(int i = 0;i<vectorInteger.length;i++){
                  vectorInteger[i]=gerador.nextInt(100);
                  while(vectorInteger[i]<10){
                    vectorInteger[i]=gerador.nextInt(100);
                  }
                }
                            
                vectorInteger = sortInteger.selectionSort(vectorInteger);
                
                for (int i = 0; i < vectorInteger.length; i++) {
                    System.out.println(vectorInteger[i]);
                }
              }
              
            else if (formato==3){
                String[] vectorString= new String[100000];
                int leftLimit = 48; // numeral '0'
                int rightLimit = 122; // letra 'z'
                int targetStringLength = 10;
                Random random = new Random();
            
                
                for(int i = 0;i<vectorString.length;i++){
                  String generatedString = random.ints(leftLimit, rightLimit + 1)
                  .filter(j -> (j <= 57 || j >= 65) && (j <= 90 || j >= 97))
                  .limit(targetStringLength)
                  .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                  .toString();
                  vectorString[i]=generatedString;
                }
                            
                vectorString = sortString.selectionSort(vectorString);
                
                for (int i = 0; i < vectorString.length; i++) {
                    System.out.println(vectorString[i]);
                }
              }
            else{
              System.out.println("INFORME UM VALOR VÁLIDO!");
            }
              break;
            case 3:
              
              if (formato==1){
                
                Double[] vectorDouble= new Double[1000000];
                
                for(int i = 0;i<vectorDouble.length;i++){
                  vectorDouble[i]=gerador.nextDouble(100);
                  while(vectorDouble[i]<10){
                    vectorDouble[i]=gerador.nextDouble(100);
                  }
                }
                            
                vectorDouble = sortDouble.selectionSort(vectorDouble);
                
                for (int i = 0; i < vectorDouble.length; i++) {
                    System.out.println(vectorDouble[i]);
                }
              }
                
            else if (formato==2){
                Integer[] vectorInteger = new Integer[1000000];
                
                for(int i = 0;i<vectorInteger.length;i++){
                  vectorInteger[i]=gerador.nextInt(100);
                  while(vectorInteger[i]<10){
                    vectorInteger[i]=gerador.nextInt(100);
                  }
                }
                            
                vectorInteger = sortInteger.selectionSort(vectorInteger);
                
                for (int i = 0; i < vectorInteger.length; i++) {
                    System.out.println(vectorInteger[i]);
                }
              }
              
            else if (formato==3){
                String[] vectorString= new String[1000000];
                int leftLimit = 48; // numeral '0'
                int rightLimit = 122; // letra 'z'
                int targetStringLength = 10;
                Random random = new Random();
            
                
                for(int i = 0;i<vectorString.length;i++){
                  String generatedString = random.ints(leftLimit, rightLimit + 1)
                  .filter(j -> (j <= 57 || j >= 65) && (j <= 90 || j >= 97))
                  .limit(targetStringLength)
                  .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                  .toString();
                  vectorString[i]=generatedString;
                }
                            
                vectorString = sortString.selectionSort(vectorString);
                
                for (int i = 0; i < vectorString.length; i++) {
                    System.out.println(vectorString[i]);
                }
              }
            else{
              System.out.println("INFORME UM VALOR VÁLIDO!");
            }
              break;
            case 4:
              
              System.out.println("Informe o Número de Elementos que o Vetor Possui:");
              tamanho = entrada.nextInt();
              if(formato==1){
                Double[] vectorDoublePessoal= new Double[tamanho];
                for(int i = 0;i<tamanho;i++){
                  int k=i;
                  System.out.println("Informe o Elemento "+ (k+1)+" do Vetor:");
                  vectorDoublePessoal[i]=entrada.nextDouble();
                }
                
                //sort selection com double
                vectorDoublePessoal = sortDouble.selectionSort(vectorDoublePessoal); 
                for (int i = 0; i < vectorDoublePessoal.length; i++) {
                  System.out.println(vectorDoublePessoal[i]);
              }
              }
              if(formato==2){
                Integer[] vectorIntegerPessoal= new Integer[tamanho];
                for(int i = 0;i<tamanho;i++){
                  int k=i;
                  System.out.println("Informe o Elemento "+ (k+1)+" do Vetor:");
                  vectorIntegerPessoal[i]=entrada.nextInt();
                }
                
                vectorIntegerPessoal = sortInteger.selectionSort(vectorIntegerPessoal); 

                for (int i = 0; i < vectorIntegerPessoal.length; i++) {
                  System.out.println(vectorIntegerPessoal[i]);
              }
              }
              if(formato==3){
                String[] vectorStringPessoal= new String[tamanho];
                for(int i = 0;i<tamanho;i++){
                  int k=i;
                  System.out.println("Informe o Elemento "+ (k+1)+" do Vetor:");
                  vectorStringPessoal[i]=entrada.nextLine();
                }
                
                vectorStringPessoal = sortString.selectionSort(vectorStringPessoal); 

                for (int i = 0; i < vectorStringPessoal.length; i++) {
                  System.out.println(vectorStringPessoal[i]);
              }
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
