/*
 * descrição: ler dois valores e mostra os numeros entre eles
 * autor:
 * data:
 */
 // importa a class scanner
  import java.util.Scanner;
  public class atv2{
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        int n1,n2;
        System.out.println("insria um numero");
        n1 = ler.nextInt();
        System.out.println("insria um numero");
        n2 = ler.nextInt();
        while( n1 <= n2 ){
            System.out.println(n1);
            n1++;

        }
    }

  }