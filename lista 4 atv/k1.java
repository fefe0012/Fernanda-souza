/*
 * descrição:soma todos os numeros cujo quadrado é divisível por 4.
 * autor:Fernanda Souza
 * data:30/05
 */
import java.util.Scanner;
public class k1{
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        //incializa as variaveis 
        int cont =0;

        System.out.println("digite um numero");

        cont= ler.nextInt();

        for(int soma = 0; soma = cont * cont;){
            if((cont*2)% 4 ==0){
                System.out.println(+cont" é divisivel por 4");

            } else System.out.println(+cont" não é divisivel por 4");

            //aqui o codigo é instruído a mostrar o resultado  
        }
    }
}