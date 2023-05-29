/*
 * descrição: Recebe um valor e mostra se é impar ou par
 * autor:Fernanda
 * data:24/05
 */
 //importa a classe Scanner
import java.util.Scanner;
 public class xyt5{
     // metodo que sera executa primeiro
     public static void main(String[]args){
        // instancia um objeto "leitor"
        Scanner ler = new Scanner (System.in);
        // cria e inicializa as variaveis
        int n1 = 0;
        // 
        System.out.println("Digite um numero");
        n1 = ler.nextInt();
        
        /*excecuta o codigo e logo em seguida mostra o resultado para o usuario */
       if (( (n1 % 2)== 0 )){
           System.out.println("É PAR");
            
       } else System.out.println("É IMPAR");
        
     }
 } 
