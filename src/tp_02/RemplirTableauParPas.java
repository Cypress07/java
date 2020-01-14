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
public class RemplirTableauParPas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        Scanner reader = new Scanner(System.in);    
    final int NL=10, NC=2;
    int [][] tab ;
    tab = new int [NL][NC] ;
    int i,j, val, valDepart, pas;
 
    System.out.print("Entrez une valeur de départ :");
    valDepart = reader.nextInt(); 
    
    System.out.print("Entrzs un pas :");
    pas = reader.nextInt();
   
    val=valDepart;
    
    for (i=0 ; i<NL; i++){
        for (j=0; j<NC; j++){
        //CALCUL
        //tab [i][j] = val;
        //val = val + pas;
       
        //CALCUL SIMPLIFIE
        tab[i][j]=(2*i + j) * pas +valDepart;
    }
    }
        //AFFICHAGE DU TABLEAU
        for (i=0; i<NL; i++){
        System.out.println();
        for (j=0; j<NC; j++){
            System.out.print (tab[i][j]+ "\t");
        }
}
    }
}