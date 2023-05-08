/*
descrição: soma 4 notas e mostra a media
autor: Fernanda Souza
data:08/05
*/
//importa a classe Scanner
import java.util.Scanner;
// classe principal
public class lxp{
// metodo que sera executa primeiro
    public static void main(String[]args){

     // instancia um objeto "leitor"
        Scanner ler = new Scanner (System.in)

     //cria as variaveis que receberão as notas  
      double n1,n2,n3,n4,media;

     //inicializa as variaveis   

     media = n1 = n2 = n3 = n4 = 0;
     System.out.println("insira 4 notas: ");

     // le as notas
     n1 = nextDouble();
     n2 = nextDouble();
     n3 = nextDouble();
     n4 = nextDouble();
      
     // calcula a media
     media = (n1+n2+n3+n4)/4;

     // mostra se o aluno: passou, reprovou ou está de recuperação
     if(media>=6){
        System.out.println("voce passou!");
     }else if(media>=4 && media<=6){
        System.out.println("está de recuperação");
     }else{
        System.out.println("reprovou.");
     }
     // mostra a media
     System.out.println("A media é:" + media );
    }
}
