/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_02;

import java.util.Scanner;

/**
 *
 * @author formation_gep
 */
public class Moyenne_1Boucle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   Scanner reader = new Scanner(System.in);    
    final int N=10;
    int [] Notes ;
    Notes = new int [N] ;
    int i, somme =0 ;
    double moyenne;
    
    for (i=0 ; i<N ; i++) {
    System.out.print("Entrez une note :")   ;
    Notes [i] = reader.nextInt();
   somme = somme + Notes [i];
    }
     
    moyenne = (double)somme / N;
    
    System.out.println("La moyenne vaut : " + moyenne);
    }
}   
   
