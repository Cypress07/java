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
public class Nombres_consécutifs_ordonnés {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner reader = new Scanner(System.in);    
    int n1,n2 ;
    
     System.out.print("Entrez la valeur du premier nombre :");
        n1 = reader.nextInt();
     System.out.print("Entrez la valeur du deuxieme nombre :");
        n2 = reader.nextInt();
        //Calcul ordonnés consécutifs
        if (n1+1==n2) {
            System.out.println("Les nombres sont consécutifs ordonnés");
        }
    else {
            System.out.println("Les nombres ne sont pas consécutifs ordonnés");
        }
    
}
    }

