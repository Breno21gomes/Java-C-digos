/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testejavaaula06;

/**
 *
 * @author brend
 */
public class Testejavaaula06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /* int idade = 30;
        String valor = Integer.toString(idade);
        System.out.println(valor);
        */
       String valor = "30.5";
       float idade = Float.parseFloat(valor);
        System.out.printf("%.2f\n",idade);
    }
    
}
