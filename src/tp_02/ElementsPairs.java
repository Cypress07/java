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
public class ElementsPairs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner reader = new Scanner(System.in);    
    final int n=10;
    int [] tab ; 
    tab = new int [n] ;
    boolean touspairs=true;
    int i;
  
    for (i=0 ; i<n ; i++) {
    System.out.print("Entrez une valeur :")   ;
    tab [i] = reader.nextInt();
    }
    i=0 ;
    while (i<n && touspairs ) {
    if (tab[i]%2==1) {
            touspairs=false;
        }
        i++ ;
    }
    System.out.println("tous les nombres sont pairs :" +touspairs) ;     
    
    }
    }

