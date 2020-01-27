/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package image;

import java.util.Scanner;

/**
 *
 * @author formation_gep
 */
public class Image {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner reader = new Scanner(System.in);    
    
    final int nl=5, nc=6; 
    int [][]matrice = {
        {25, 23, 100, 100, 100, 100},
        {44, 45, 50, 100, 100, 100},
        {65, 65, 50, 20, 100, 100},
        {90, 62, 100, 5, 0, 0},
        {60, 87, 100, 0, 100, 100}    
};
        System.out.print("Entrez votre saturation :");
        int saturation  = reader.nextInt();
        
        //test de la fonction Mystere   
        System.out.println(" " +Mystere (saturation));
        //test de la fonction moyenne :
        System.out.println("La moyenne vaut : " + Moyenne(saturation));
        //DiminutionContraste
          System.out.print("Entrez valeur de contraste :");
           int constraste = reader.nextInt ();
           
            System.out.println("La contraste vaut : " + DimConstraste(contraste));
    }

   public static int Mystere(int matrice) {
       int i,j; 
       final int nl=5, nc=6 ;
       int [][] tab = {
        {25, 23, 100, 100, 100, 100},
        {44, 45, 50, 100, 100, 100},
        {65, 65, 50, 20, 100, 100},
        {90, 62, 100, 5, 0, 0},
        {60, 87, 100, 0, 100, 100}
};
       
            for (i = 0; i <nl; i++){
                for(j = 0; j<nc ; j++)
                    matrice = 100-tab[i][j];
            }
            return matrice ;
        }

 public static int Moyenne(int m) {

 int i, j, somme=0, moyenne;
  final int nl=5, nc=6; 
    int [][]matrice = {
        {25, 23, 100, 100, 100, 100},
        {44, 45, 50, 100, 100, 100},
        {65, 65, 50, 20, 100, 100},
        {90, 62, 100, 5, 0, 0},
        {60, 87, 100, 0, 100, 100}
        
};
   for (i=0 ; i<nl ; i++){
        for (j=0 ; j<nc ; j++){
    somme = somme + matrice[i][j];
    }
    }
    moyenne = somme / (nl*nc) ; 
 return moyenne;
    }
  public static int DimConstraste(int c) {
    
                if ( c > 50 && c <= 75){
                    c = 75 ;
                }
                if ( c > 75){
                c = 100 ;
                }
                else {
                    c = c/2 ;
}
                return c;
  }

}
 
 