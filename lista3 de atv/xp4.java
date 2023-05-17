/*
 * descrição:mostra todos os numeros impares de 0 a 1000
 * autor:Fernanda Souza
 * data:16/05
 */
public class  xp4{
    public static void main(String[]args){
        //incializa as variaveis 
        int x = 0;
        // o codigo é instruido a mostrar somente os numeros impares 
        do{ 
            x++; 
            if(x % 2!=0)
            
            System.out.println(x);
        } while ( x <1000);
        
    }

}