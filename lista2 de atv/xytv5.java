/*
 * descrição: descobre o sucessor e antecessor de um numero
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
        int n1 = 0;
        int res = 0;
        int res2 = 0;
        System.out.println("Digite um numero");
        n1 = ler.nextInt();
        res=(n1+1);
        res2=(n1-1);
        System.out.println(" o seu sucessor é " +res+ " e o antecessor será " +res2);
     }
 } 