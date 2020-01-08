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
public class SommeEntierspairs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   Scanner reader = new Scanner(System.in);    
    //VARIABLES 
    int i, n, somme;
    
    System.out.print("Entrez un nombre entier :") ;
    n = reader.nextInt();
    somme=0;
 
    for (i=1 ; i<=n ; i++) {
    somme = somme + 2*i;
}
    
System.out.println("Voila la somme des nombres pairs vaut : " + somme);
        }    
}