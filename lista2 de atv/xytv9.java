/*
 * descrição: Recebe 2 numeros e fala se são iguais e qualo maior
 * autor:Fernanda Souza
 * data:24/05
 */
 //importa a classe Scanner
 import java.util.Scanner;
 public class xyt5{
     // metodo que sera executa primeiro
     public static void main(String[]args){
        // instancia um objeto "leitor"
        Scanner ler = new Scanner (System.in);
       
        // cria as variaveis
     
        // inicializa as variaveis
        int n1 = 0;
        int n2 = 0;
        // 
        System.out.println("Digite 2 numero");
        n1 = ler.nextInt();
        n2 = ler.nextInt();
        /*excecuta o codigo e logo em seguida mostra o resultado para o usuario */
       if (n1==n2){
           System.out.println("são iguais");
           
             } else if (n1>n2){
                System.out.println(""+n1+" é maior que "+n2);
             }
                     else System.out.println(""+n2+" é maior que "+n1);
        
     }
 } 