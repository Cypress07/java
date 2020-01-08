/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_01;

import java.util.Scanner;

/**
 *
 * @author formation_gep
 */
public class ConversionCelsiusFarenheit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    //CONSTANTES
        //final double PI ;
    
        //VARIABLES
        double temperature, resultat;
        Scanner reader = new Scanner(System.in);
    
        System.out.print("Entrez la valeur de la temperature en degré Celsius :");
        temperature = reader.nextDouble();
        resultat = (temperature*9/5) + 32;
        System.out.println("La valeur de la temperature en Farenheit est: " + resultat);
    }
    
}
