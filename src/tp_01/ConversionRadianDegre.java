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
public class ConversionRadianDegre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    //CONSTANTES
        //final double PI ;
    
        //VARIABLES
        double angle, resultat;
        Scanner reader = new Scanner(System.in);
    
        System.out.print("Entrez la valeur de l'angle en radians :");
        angle = reader.nextDouble();
        resultat = angle*180 / Math.PI;
        System.out.println("La valeur de l'angle en degrés est: " + resultat);
    }
    
}
