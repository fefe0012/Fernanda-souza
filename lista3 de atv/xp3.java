/*
 * descrição: recebe 500 numeros soma-os e mostra a media
 * autor:Fernanda Souza 
 * data:30/05
 */
import java.util.Scanner;

public class xp3{
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);

        int somadora = 0;
        int j = 0 ;

         for( int contador = 0; contador< 10; contador++){
            System.out.println("insira um valor: ");
            somadora = ler.nextInt();
            j += somadora;
         }
         double  media = 0.0;
         media = j /10;

         System.out.println("a media é : " + media );

    }
}