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
public class NombrePairImpair {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner reader = new Scanner(System.in);    

         int n;
            
      System.out.print("Entrez un nombre entier :");
      n=reader.nextInt();
    
    if (n % 2 == 0){
        System.out.println("Nombre PAIR");
    }
    else {
        System.out.println("Nombre IMPAIR");
    }
    }
    
}
