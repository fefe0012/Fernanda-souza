/*
 * descrição:recebe um texto e ve se a quantidade de caracter é maior que 
 * 10 mostra que a pessoa digitou um palavrão, e se menor que 10 digitou uma palavrinha.
 * autor:fernanda souza
 * data:30/05
 */
import java.util.Scanner;
public class k4{
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        
        int n1;
        System.out.println("digite um texto ou letras aleatorias.");
        n1 = ler.nextLine().length();
        if(n1 >= 10 ){
             System.out.println(" vc digitou um palavrão!");
            
        }      else {
          
                 System.out.println(" vc digitou uma palavrinha");
        }
                      
    }
}
