/*
 * descrição:soma 3 numeros ate o resultado ser 48 ou 71
 * autor:fernanda souza
 * data:30/05
 */
import java.util.Scanner;
public class k2{
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        // cria as variaveis 
        int n1 = 0;
        int n2 = 0; 
        int n3 = 0;
        int res= 0;
        
        System.out.println("digite 3 numeros ");
        n1 = ler.nextInt();
        n2 = ler.nextInt();
        n3 = ler.nextInt();
        res = n1+ n2+ n3;
        // recebe 3 numeros e se nao for igual o que estar na condição ele executa o metodo while ate o usuario chegar no resultado
         while ( res !=48 && res !=71 ){
            System.out.println("digite 3 numeros ");
              n1 = ler.nextInt();
              n2 = ler.nextInt();
             n3 = ler.nextInt();
            
         }
         System.out.println("FIM!");
    }
}
