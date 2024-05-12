/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadoresaritimeticos;

/**
 *
 * @author brend
 */
public class OperadoresAritimeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*int n1 = 3;
        int n2 = 5;
        float m = (n1 + n2)/2;
        System.out.println("A média é igual a " + m);*/
        
       //pré decremento/incremento e pós decremento/incremento
       /* int numero = 10;
        int valor = 5 + --numero; 
        System.out.println(valor);
        System.out.println(numero);*/
       
       //Incrementa +1 ou decrementa +1
      /* int x = 4;
       x -= 2; //x = x - 2
        System.out.println(x);*/
      
      //Arredondamentos
     /* float v = 8.4f;
      int ar = (int) Math.round(v);
        System.out.println(ar);*/
     
     //Gerador de Números (Aleatórios)
     double ale = Math.random();
     int n = (int)(15 + ale * (30-15));
        System.out.println(n);
    }
    
}
