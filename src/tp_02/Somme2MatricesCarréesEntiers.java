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
public class Somme2MatricesCarréesEntiers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner reader = new Scanner(System.in);
   System.out.println("Taille de la matrice :") ;
   int n = reader.nextInt();
   final int[][] matrice1 = new int[n][n];
   final int[][] matrice2 = new int[n][n];
  
    int i,j ;
    
    for (i=0 ; i<n ; i++) {
         for (j=0 ; j<n ; j++) {
    System.out.printf("Entrez matrice1 [%d][%d] :",i,j);
    matrice1[i][j] = reader.nextInt(); 
    }
    }
   for (i=0 ; i<n ; i++) {
         for (j=0 ; j<n ; j++) {
    System.out.printf("Entrez matrice2[%d][%d] :",i,j);
    matrice2[i][j] = reader.nextInt(); 
    }
   }
   int[][] matrice3 = new int[n][n];
    for (i=0; i<n; i++){
        for (j=0; j<n; j++){
    matrice3[i][j]=matrice1[i][j]+matrice2[i][j];
        }
    }
    for (i=0; i<n;i++){
        System.out.println();
        for (j=0;j<n;j++){
            System.out.print (matrice3[i][j]+ "\t");
        }
    }
   }
    }
    
    
    

