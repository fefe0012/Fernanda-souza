
/* 
*descrição: recebe 4 valores e soma-os
*autor: Fernanda Souza
*data:05/05/2023
*/
// importa a classe scanner
import java.util.Scanner;
public class Exercicio01.java {
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in)
//cria as variaveis tipo real
        double n1, n2, n3, n4, res;
// inicializa as variaveis
        n1 = n2 = n3 = n4 =0;
        System.out.print(insira um numero );
        n1 = ler.nextDoubleln();
        System.out.print(insira outro valor);
        n2 = ler.nextDoubleln();
        System.out.print(insira um outro valor);
        n3 = ler.nextDoubleln();
        System.out.print(insira um outro numero);
        n4 = ler.nextDoubleln();
        System.out.print("\nResultado:\n");
        System.out.print(n1+n2+n3+n4);
 //mostra o resultado ao usuario
        
    }
}
