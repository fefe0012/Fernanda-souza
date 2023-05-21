/*
 * descrição:recebe 3 numeros e descobre qual é o maior 
 * autor:Fernanda Souza
 * data:21/05
 */
//importa a classe Scanner
import java.util.Scanner;
// classe principal
public class xy{
    // metodo que sera executa primeiro
    public static void main(String[]args){
         // instancia um objeto "leitor"
         Scanner ler = new Scanner (System.in);
         //cria as variaveis
         double n1,n2,n3,res;
         //inicializa as variaveis
         res =n1 = n2 = n3 = 0.0;
         System.out.println("digite 3 numero diferentes");
         // le os numeros
         n1 = ler.nextDouble();
         n2 = ler.nextDouble();
         n3 = ler.nextDouble();
         /* executa o codigo usando se se não, e mostra ao usuario qual numero que inserio é maior */ 
         if(n1>n2 & n1>n3){
            System.out.println( " O primeiro numero que você digitou é maior que os demais");
             } else if (n2>n1 & n2>n3){
                 System.out.println ("O segundo numero que você  digitou é maior que os demais");

                 } else {
                  System.out.println("O treceiro numero que você digitou  é maior que os demais");
                 }


    }
}