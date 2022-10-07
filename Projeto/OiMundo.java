import java.util.Scanner;

public class OiMundo {
  public static void main(String[] args){
    Scanner entrada = new Scanner (System.in);
    int raio;
    raio = entrada.nextInt();
    
    System.out.print("O valor do diametro é: "+(raio*2));
  }
}