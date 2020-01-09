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
public class InverséEntiersTableau {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        Scanner reader = new Scanner(System.in);    
    final int n=10;
    int [] tab ;
    tab = new int [n] ;
    int i;
 
    for (i=0 ; i<n ; i++) {
    System.out.print("Entrez une valeur :")   ;
    tab [i] = reader.nextInt(); 
    }
      for (i = n-1 ; i >=0  ; i--){
 
      System.out.println (tab[i]);
}
    }
    }