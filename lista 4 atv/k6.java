/*
 * descrição:soma todos os numeros cujo quadrado é divisível por 4.
 * autor:Fernanda Souza
 * data:30/05
 */

public class k1{
    public static void main(String[]args){
       
        //incializa as variaveis 
        int nt = 10; 
        double soma= 0;
        for(int cont = 1; cont <= nt; cont ++){
            // acha o quadrado do valor 
             double quad = Math.pow(cont,2);
            if( quad % 4 ==0){
               soma = soma + cont ;
               System.out.println(" o  valor do quadrado de "+ cont "é: "+ quad)
              System.out.println(" o valor da soma é: " +soma );
            } 

            //aqui o codigo é instruído a mostrar o resultado  
        }
    }
}
