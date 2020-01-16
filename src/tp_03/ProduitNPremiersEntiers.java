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
public class ProduitNPremiersEntiers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner reader = new Scanner(System.in);
    int n;
    
    System.out.print ("Donnez la valeur de n :");
    n=reader.nextInt();
    
    System.out.println ("Le produit est:" +ProduitNEntiers (n));
    }
 public static int ProduitNEntiers (int i, int prod) { 
        prod=1;
        for (int i=1; i<=n; i++){
        prod=prod*i;  
    }
        return prod;
}
}
