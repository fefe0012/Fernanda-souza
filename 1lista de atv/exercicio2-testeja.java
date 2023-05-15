/*
recebe 4 numeros e calcula o quadrado de cada e soma-os
Fernanda Souza
07/05/23
*/
import java.util.Scanner;
public class testeja{
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
// cria as variaveis 
        int n1,n2,n3,n4;
        System.out.print("digite um numero");
        n1 = ler.nextInt();
        System.out.print("digite outro numero");
        n2 = ler.nextInt();
        System.out.print("digite outro numero");
        n3 = ler.nextInt();
        System.out.print("digite outro numero");
        n4 = ler.nextInt();
        System.out.print("\nResultado:\n");
        System.out.print((n1^2)+(n2^2)+(n3^2)+(n4^2));
// mostra o resultado 
    }
}
