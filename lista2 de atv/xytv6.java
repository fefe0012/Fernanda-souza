/*
 * descrição: descobre o valor total da compra de picoles 
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
        int kiwi = 0;
        int laranja = 0;
        int romã = 0;
        double total = 0.0;
        // 
        System.out.println("Digite a quantidade de picoles de kiwi, laranja e romã");
        kiwi = ler.nextInt();
        laranja = ler.nextInt();
        romã = ler.nextInt();
        /*excecuta o codigo e logo em seguida mostra o resultado para o usuario */
        total = (kiwi*3.20) + (laranja*2.39) + (romã*7.99);
        System.out.println(" o valor da venda é R$ " +total);
     }
 } 