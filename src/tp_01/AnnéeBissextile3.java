/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_01;

import java.util.Scanner;

/**
 *
 * @author formation_gep
 */
public class AnnéeBissextile3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // TODO code application logic here
    Scanner reader = new Scanner(System.in);    

    int année ;
    
    do {
    System.out.print("Entrez une année comprise en 1900 et 2100:");
    année=reader.nextInt();
    
    } while(année <1900 || année > 2100) ;
 
    if (année % 400 == 0 || année % 100 != 0 && année % 4 == 0 ){
         System.out.println("L'année est bissextile");
    }  
    else {
         System.out.println("L'année n'est pas bissextile");
    }
}
}