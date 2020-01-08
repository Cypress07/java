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
public class Moyenne_tableau2Boucles5x2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   Scanner reader = new Scanner(System.in);    
    final int nl=5, nc=2;  
    int [][] tab ;
    tab = new int [nl] [nc];
    int i,j, somme =0 ;
    double moyenne;
    
    for (i = 0; i <nl; i++) {
        for (j = 0; j < nc; j++) {
    System.out.print("Entrez une note :")   ; 
    tab [i][j] = reader.nextInt();
    }
    }
    for (i=0 ; i<nl ; i++){
        for (j=0 ; j<nc ; j++){
    somme = somme + tab[i][j];
    }
    }
    moyenne = (double)somme / (nl*nc) ;
    
    System.out.println("La moyenne vaut : " + moyenne);
    }
}

   
