
/* 
*descrição: recebe 4 valores e soma-os
*autor: Fernanda Souza
*data:05/05/2023
*/
import java.util.Scanner;
public class fernanda.java {
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in)
        double n1, n2, n3, n4, res;
        System.out.print(insira um numero );
        n1 = ler.nextDouble();
        System.out.print(insira outro valor);
        n2 = ler.nextDouble();
        System.out.print(insira um outro valor);
        n3 = ler.nextDouble();
        System.out.print(insira um outro numero);
        n4 = ler.nextDouble();
        System.out.print("\nResultado:\n");
        System.out.print(n1+n2+n3+n4);
    }
}
