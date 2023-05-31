/*
 * descrição:soma todos os numeros cujo quadrado é divisível por 4.
 * autor:Fernanda Souza
 * data:30/05
 */
// importa a class scanner
 import java.util.Scanner;
  public class k6{
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
     // cria as variaveis 
     int quant = 1;
     int soma = 0;
     int valor = 0;
     // inicializa o metodo while 
     while (quant <= 4){
         System.out.println("Digite o valor" );
         valor = ler.nextInt();
         quant ++;
         if ( valor > 0){
            soma += valor;
            System.out.println("a soma dos valores inseridos é: " + soma );
         }
     }
     // depois de somar tudo com o laço while ele vem e mostra a raiz do numero divisivel por 4
    double raiz = Math.sqrt(soma);
    System.out.println( " a raiz é: " + raiz);
    }
  }
