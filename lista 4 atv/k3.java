/*
*descrição: gera 50 numeros inteiro e soma eles em uma variavel, e gera 50 numeros reias aleatorios
*autor:Fernanda Souza
*data:30/05
*/ 
//importa a classe scanner 
import java.util.Scanner;
 import java.util.Random;
 public class k3{
    public  static void main(String[]args){

        Scanner ler = new Scanner(System.in);
// impota a class random
        Random gerador = new Random();
     // cria as variaveis 
        int w = 0; 
        int o = 0;
        for( int p = 0 ; p < 50; p++) {
            
            o = gerador.nextInt(50);
            
            System.out.println("ja  gerei um numero ate 50: " + o);
            
            w += o;
            System.out.println(" soma dos numeros inteiros são "+ w);
        } 
        double a = 0.0; 
        double r = 0.0;
        for( double f = 0.0 ; f < 50.0; f++) {
            r = gerador.nextDouble(50.0);
            
            System.out.println("ja  gerei um numero ate 50.0: " + r);
            
            a += r;
            System.out.println(" soma dos numeros inteiros são "+ a);
        }
          if (w > a){
              System.out.println( w + " é maior.");
          } else {
              System.out.println( a + " é maior.");
          }
    }
 }
