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
public class ProduitNPremiersEntiersfor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner reader = new Scanner(System.in);    
    //VARIABLES 
    int i, n ;
    long produit ;
    
    System.out.print("Entrez un nombre entier :") ;
    n = reader.nextInt();
    produit = 1;
    
    for (i=2 ; i<=n ; i++) {
        produit = produit * i ; 
    }   
    System.out.println("Voila le produit des entiers vaut : " + produit);
        }    
}


