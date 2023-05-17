/*
*descrição:calcula a media de 500 numeros inseridos
*autor:Fernanda Souza
*data:16/05
*/ 
// importa a class scanner
import java.util.Scanner;
public class xp{
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        // criação de variaveis 
        double somadora = 0.0;
        double media = 0.0;
        int contador;
        /* soma os valores inseridos e calcula a sua media*/
        for( contador = 0; contador < 10; contador++){
            System.out.println("Insira um valor: ");

            somadora += ler.nextDouble();
            
        }
        
        // mostra os valores
        System.out.println(" A media é ");
         System.out.println( somadora / contador);
    }
}