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
public class AnnéeBissextile1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // TODO code application logic here
    Scanner reader = new Scanner(System.in);    

    int année;
            
    System.out.print("Entrez une année :");
    année=reader.nextInt();
    
    if (année % 400 == 0) {
        System.out.println("L'année est bissextile");
    }
    else if (année % 100 == 0) {
        System.out.println("L'année n'est pas bissextile");
        }
    else if (année % 4 == 0) {
        System.out.println("L'année est bissextile");
    }  
    else {
         System.out.println("L'année n'est pas bissextile");
    }
}

}