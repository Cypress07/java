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
public class SuiteFibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner reader = new Scanner(System.in);    
    //VARIABLES 
    int ad, d, n , somme,i ;
    
    System.out.print("Entrez un nombre entier :") ;
    n = reader.nextInt();
    
         switch (n) {
            case 1:
            case 2:
                System.out.println("le résultat est égal à 1");
                break;
            default : ad=1;
                      d=1 ;
        for (i=3 ; i<=n ; i++) {       
        somme = d+ad ;
        ad=d;
        d=somme;
        
    
        System.out.println("La résulat est : " + d);   
        }
        }
        }
}



