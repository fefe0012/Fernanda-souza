/*
 * descrição:descobre 15% de um valor
 * autor:Fernanda Souza
 * data:21/05
 */
 //importa a classe Scanner
 import java.util.Scanner;
 // classe principal
 public class x{
 // metodo que sera executa primeiro
    public static void main(String[]args){
        // instancia um objeto "leitor"
        Scanner ler = new Scanner (System.in);
        double valorO, res= 0.0;
        double valorD= 15.0;
        System.out.println("insira o valor do produto");
        valorO = ler.nextDouble();
      /*excecuta o codigo e logo em seguida mostra o resultado para o usuario */
        res=(15*valorO)/100;
        System.out.println(res);
    }
 } 
