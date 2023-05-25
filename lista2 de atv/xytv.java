/*
 * descrição: troca de valores 
 * autor: Fernanda Soza
 * data:21/05
 */
 //importa a classe Scanner
 import java.util.Scanner;
 // classe principal
 public class xytv{
    // metodo que sera executa primeiro
    public static void main(String[]args){
           // instancia um objeto "leitor"
           Scanner ler = new Scanner (System.in);
           //cria as variaveis
           int n1 = 0;
           int n2 = 0;
           int n3 = 0; 
           int n4 = 0;
           //inicio das variaveis 
           
           System.out.println("insira um valor");
           n1 = ler.nextInt();
           System.out.println("insira outro valor");
           n2 = ler.nextInt();
          n3 = n1;
          n1 = n2; 
      /*excecuta o codigo (troca de valores) e logo em seguida mostra o resultado para o usuario */
          System.out.println("o valor de " + n1 + " é "  + n2);
          n4 = n2;
          n4 = n3;
           
           
          
           System.out.println("o valor de " + n4 +  " é "  + n3);
    }
 }
