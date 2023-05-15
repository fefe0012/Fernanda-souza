/*
calcula um perímetro a partir de um r inserido pelo usuario
Fernanda Souza 
7/05
*/
import java.util.Scanner;
public class luv{
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        int raio;
        System.out.print("insira um numero para o raio do circulo:");
        raio = ler.nextInt();
        System.out.print("\nO perímetro do raio inserido é\n");
        System.out.print(6.28*raio);
    }
}
