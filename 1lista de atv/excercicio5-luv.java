/*
calcula um perímetro a partir de um r inserido pelo usuario
Fernanda Souza 
7/05
*/
// importa a classe scanner
import java.util.Scanner;
public class luv{
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
// cria a variavel
        int raio;
        System.out.print("insira um numero para o raio do circulo:");
        raio = ler.nextInt();
        System.out.print("\nO perímetro do raio inserido é\n");
        System.out.print(6.28*raio);
 // mostra o resultado
    }
}
