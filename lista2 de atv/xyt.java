/*
 * descrição:calcula a area de um triangulo
 * autor:Fernanda Souza
 * data:21/05
 */
 //importa a classe Scanner
 import java.util.Scanner;
 // classe principal
 public class xyt {
    // metodo que sera executa primeiro
    public static void main(String[]args){
         // instancia um objeto "leitor"
         Scanner ler = new Scanner (System.in);
         //cria as variaveis
         double b,a,res;
         // inicializa as variaveis 
         b =0.0;
         a =  0.0;
         res = 0.0;
         // instrução para o usuario 
         System.out.println("insira o valor da base");
         b = ler.nextDouble();
         System.out.println("insira o valor da altura");
         a = ler.nextDouble();
         // canculando a area conforme o valor inserido pelo usuario 
         res=(b*a)/2;
        System.out.println(res);

    }
 }