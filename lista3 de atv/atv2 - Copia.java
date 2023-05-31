/*
 * descrição: ler dois valores e mostra os numeros entre eles
 * autor:Fernanda Souza
 * data:16/05
 */
 // importa a class scanner
  import java.util.Scanner;
  public class atv2{
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
     //cria as variaveis 
        int n1,n2;
     // faz uma interação com o usuario 
        System.out.println("insria um numero");
        n1 = ler.nextInt();
        System.out.println("insria um numero");
     // termina de ler o que o usuario inseriu 
        n2 = ler.nextInt();
        System.out.println();
     // excuta e mostra o resultado 
        while( n1 < n2 ){
            n1++;
            n2--;
            System.out.println(n1);
            
        }
    }

  }
