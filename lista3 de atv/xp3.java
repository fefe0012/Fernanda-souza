/*
 * descrição: recebe 500 numeros soma-os e mostra a media
 * autor:Fernanda Souza 
 * data:30/05
 */
//importa a classe scanner
import java.util.Scanner;

public class xp3{
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
// cria as variaveis
        int somadora = 0;
        int j = 0 ;
//inicializa o metodo for 
         for( int contador = 0; contador< 10; contador++){
            System.out.println("insira um valor: ");
            somadora = ler.nextInt();
            j += somadora;
         }
        // conclui a soma e começa a excutar a media 
         double  media = 0.0;
         media = j /10;
 // mostra o resultado
         System.out.println("a media é : " + media );

    }
}
