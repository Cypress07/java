/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_03;

import java.util.Scanner;

/**
 *
 * @author formation_gep
 */
public class DecodePolybe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner reader = new Scanner(System.in);    

    int i, j ; 
    //matrice d'ordre 5
    final int N=5 ;
    char [][] tab= new char[][]{
        {'A','B','C','D','E'},
        {'F','G','H','I','J'},
        {'K','L','M','N','O'},
        {'P','Q','R','S','T'},
        {'U','V','X','Y','Z'},
        } ;
   //affichage de matrice
   
    for (i=0; i < N ; i++) {
    System.out.println();
    for (j=0; j < N ;j++){
    System.out.print (tab [i][j] + " ");
        }
    System.out.println(+Polybe (i,j));
    }
    }

    public static String Polybe (String mot) {
    
    int i, j, k=0,c;
    char lettre;     
    final int N=5 ;
    char [][] tab= new char[][]{
        {'A','B','C','D','E'},
        {'F','G','H','I','J'},
        {'K','L','M','N','O'},
        {'P','Q','R','S','T'},
        {'U','V','X','Y','Z'},
        } ;
    mot=mot.toLowerCase();
            mot=mot.replace('w','v');
            mot=mot.replace('ç','c');
            mot=mot.replace('é','e');
            mot=mot.replace('è','e');
            mot=mot.replace('à','a');
            mot=mot.replace('ù','u');
            mot=mot.replaceAll("0", "zeros ");
            mot=mot.replaceAll("1", "un ");
            mot=mot.replaceAll("2", "deux ");
            mot=mot.replaceAll("3", "trois ");
            mot=mot.replaceAll("4", "quatre ");
            mot=mot.replaceAll("5", "cinq ");
            mot=mot.replaceAll("6", "six ");
            mot=mot.replaceAll("7", "sept ");
            mot=mot.replaceAll("8", "huit ");
            mot=mot.replaceAll("9", "neuf ");
            mot=mot.replaceAll("@", "at");
            mot=mot.replaceAll("&", "et");
            mot=mot.replaceAll("%", "pourcent ");
    
    lettre == mot [k] ;
    while (k < mot.length()) { 
        for (i=0; i<N; i++){
        for (j=0; j<N; j++){
            if (lettre == (tab[i][j]));
            i += c ;
            j += c ;
    } 
    }
    k=k+1;  
}
    return mot ;
    }
}
