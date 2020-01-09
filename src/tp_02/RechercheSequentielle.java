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
public class RechercheSequentielle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner reader = new Scanner(System.in);    
    final int n=10;
    int [] tab ;
    tab = new int [n] ;
    int i, vr, o=0;
  
    for (i=0 ; i<n ; i++) {
    System.out.print("Entrez une valeur :")   ;
    tab [i] = reader.nextInt();
    }
    System.out.print("Entrez une valeur à rechercher :") ;
    vr = reader.nextInt();
    for (i=0 ; i<n ; i++) {
    if (tab[i]==vr){
    o++;
    }
}
    System.out.println("Le nombre d'occurence de votre valeur est : " + o);

}
}
