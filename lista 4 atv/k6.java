/*
 * descrição:soma todos os numeros cujo quadrado é divisível por 4.
 * autor:Fernanda Souza
 * data:30/05
 */
 import java.util.Scanner;
  public class k6{
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
     int quant = 1;
     int soma = 0;
     int valor = 0;
     while (quant <= 4){
         System.out.println("Digite o valor" );
         valor = ler.nextInt();
         quant ++;
         if ( valor > 0){
            soma += valor;
            System.out.println("a soma dos valores inseridos é: " + soma );
         }
     }
    double raiz = Math.sqrt(soma);
    System.out.println( " a raiz é: " + raiz);
    }
  }
