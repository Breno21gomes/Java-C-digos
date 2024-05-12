/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comparacaostring;

/**
 *
 * @author brend
 */
public class ComparacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nom1 = "Brendon";
        String nom2 = "Brendon";
        String nom3 = new String("Brendon");
        String res;
        res = (nom1.equals(nom3))?"igual":"diferente";
        System.out.println(res);
    }
    
}
