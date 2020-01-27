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
public class MiniMax3Reels {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    Scanner reader = new Scanner(System.in); 
   
    double un, deux, trois ;
    
    System.out.print("Entrez un réel :")   ;
    un = reader.nextDouble();
    
    System.out.print("Entrez un réel :")   ;
    deux = reader.nextDouble();
    
    System.out.print("Entrez un réel :")   ;
    trois = reader.nextDouble();
    
    System.out.println("Le plus petit réel est :" +min (un, deux, trois));
    System.out.println("Le plus grand réel est :" +max (un, deux, trois));
     }
    
    public static double min (double a, double b, double c) {
        // TODO code application logic here
    
    double min;
    
    min=a;
    if (b < min) {
    min=b;
    }
    if (c < min){ 
    min=c;
    }
    return min ;
    }
            
    public static double max (double a, double b, double c) {
        // TODO code application logic here
    
    double max ;

    max=a;
    if (b > max) {
    max=b;
}
    if (c > max) {
    max=c;
    }
    return max ;
    
}
}



