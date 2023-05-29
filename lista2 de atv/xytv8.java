/* descrição: um aplicativo que visa tirar dinheiro de alguem com problemas piscologico 
 * autor:Fernanda Souza
 * data:29/05
 */
import java.util.Scanner;

public class xytv8{

public static void main(String[] args){
 
Scanner ler= new Scanner (System.in );

int k2= 0;
char n1;
double tz=1.50;
double tv=0.0;
String k9;

// interage com o usuário 

System.out.println ("Olá,seu dia foi bom?");
System.out.println ("se sim digite S");
System.out.println("se não digite N");
// ler resposta do usuário 
 n1 = ler.nextLine().charAt(0); 
if (n1== 's') { 
      System.out.println ("que bom");
        } else  {
                   System.out.println ("poxa");
                   System.out.println ( "digite o pq…");
                   k9= ler.nextLine ();
                 }



System.out.println ( "de 1 a 10 digite o quanto lê ajudou a desabafar sobre");

k2=ler.nextInt();

System.out.println ( "sua nota é " + k2 + " para nosso app.");

/* valor da promoção tem em base a nota que o cliente da para o app 
ou seja quanto maior a nota mais caro fica já que o cliente ta satisfeito com o app 
então ele se contentará com o preço mais salgado, porém visando a aproximação do cliente insatisfeito ele
pagará mais barato por questões de querer aproxima esse cliente do app */

tv= tz*k2;
System.out.println("PROMOÇÃO");

System.out.println ("pagando " + tv + " vc tem direito a consultas com um psicólogo online");

 }
}
