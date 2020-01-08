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
public class PerimetreCarre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //CONSTANTES
        final int NB_COTES = 4;
    
        //VARIABLES
        double longueur, resultat;
        Scanner reader = new Scanner(System.in);
    
        System.out.print("Entrez la valeur longueur du coté :");
        longueur = reader.nextDouble();
        resultat = longueur * NB_COTES;
        System.out.println("Perimetre: " + resultat);
    }
    
}
