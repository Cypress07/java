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
public class PlusGrandEntier {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner reader = new Scanner(System.in);    
    final int n=3;
    int [] tab ;
    tab = new int [n] ;
    int i, max;
  
    for (i=0 ; i<n ; i++) {
    System.out.print("Entrez une température :")   ;
    tab [i] = reader.nextInt();
    }
   
    max=tab [0];
    
    for (i=1 ; i<n ; i++)  { 
    if (tab [i] > max) ;
    max=tab [i];
    }
    System.out.println("La température max est : " + max);
   
}
}
