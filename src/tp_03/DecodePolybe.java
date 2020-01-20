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
   
    for (i=0; i<N ; i++) {
    System.out.println();
    for (j=0; j<N ;j++){
    System.out.print (tab [i][j] + " ");
        }
    }
    }

    public static String Polybe (String mot) {
    
    int i, j, k=0,c;
    char lettre;
    string mot;     
    final int N=5 ;
    char [][] tab= new char[][]{
        {'A','B','C','D','E'},
        {'F','G','H','I','J'},
        {'K','L','M','N','O'},
        {'P','Q','R','S','T'},
        {'U','V','X','Y','Z'},
        } ;
    mot [k]= lettre;
    while (k < mot.length) { 
        for (i=0; i<N; i++){
        for (j=0; j<N; j++){
            if lettre = (T[i][j]);
            add i to c ;
            add j t c ;
    } 
    }
    k=k+1;
}
    return c;
    }
}
