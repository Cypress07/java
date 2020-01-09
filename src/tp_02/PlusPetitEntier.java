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
public class PlusPetitEntier {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner reader = new Scanner(System.in);    
    final int nl=5, nc=2;  
    int [][] tab ;
    tab = new int [nl] [nc];
    int i,j, min;
  
    for (i=0 ; i<nl ; i++) {
        for (j=0; j<nc; j++){
    System.out.print("Entrez une valeur :")   ;
    tab [i][j] = reader.nextInt();
    }
    }
    min=tab [0][0];
    
    for (i=0 ; i<nl; i++)  {
        for(j=0 ; j<nc ; j++) {
        if (tab [i][j] < min) {
        min=tab [i][j] ;
        }
    }
    }
    System.out.println("La valeur la plus petite est : " + min);
   
}
}
