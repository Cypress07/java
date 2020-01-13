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
public class InverserEntiers2Tableaux {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        Scanner reader = new Scanner(System.in);    
   final int n=10;
    int [] tab1 ;
    int [] tab2;
    tab1 = new int [n] ;
    tab2 = new int [n];
    int i;
 
    for (i=0 ; i<n ; i++) {
    System.out.print("Entrez une valeur :");
    tab1[i] = reader.nextInt();    
    }       
        for (i =0 ; i<n ; i++){
        tab2[i]=tab1[n-i-1];
        }
        for (i=0 ; i<n ; i++){
 
      System.out.print(tab2[i] + " ");
    
    }
}
}