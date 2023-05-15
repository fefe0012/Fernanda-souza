/*
converte um valor em real para dolar
Fernanda Souza 
07/05  
*/
import java.util.Scanner;
public class javtext{
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        double valorr, valord;
        System.out.print("digite em valor em real");
        valorr = ler.nextDouble();
        System.out.print("\nO valor em dolar é\n");
        System.out.print(valorr/4.95);

    }
}
