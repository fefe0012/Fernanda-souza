/*
classifica um pessoa pela idade
Fernanda Souza
07/05
*/
import java.util.Scanner;
public class javtst{
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        int idade;
        System.out.print("insira sua idade");
        idade = ler.nextInt();
        if (idade > 60){
            System.out.print("Você é idoso");
        }    else if (idade>19){
              System.out.print("Você é adulto");
        }      else if (idade>12){
                System.out.print("Você é adolecente");
        }        else 
                  System.out.print("Você é um mini querido(criança)");
    }
}
