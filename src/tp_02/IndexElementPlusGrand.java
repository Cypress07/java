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
public class IndexElementPlusGrand {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner reader = new Scanner(System.in);    
    final int N=10;
    int [] tab ; 
    tab = new int [N] ;
    int i, indmax;
  
    for (i=0 ; i<N ; i++) {
    System.out.print("Entrez une valeur :")   ;
    tab [i] = reader.nextInt();
    }
    
    indmax=0 ;
    
    for (i=1 ; i<N; i++) {
     if (tab[i]>tab[indmax]) {
            indmax=i;   
    }
    }
    System.out.println("L'index de l'élément le + grand est :" +indmax) ;     
    }
}

