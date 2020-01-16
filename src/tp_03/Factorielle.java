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
public class Factorielle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner reader = new Scanner(System.in);
    int n;
    
    System.out.print ("Entrez un entier :");
    n=reader.nextInt();

    System.out.println ("Le factoriel de "+n+" est :" + factorielle (+n));
    }
    
    public static int factorielle (int n) { 
        int fact=1;
        for (int i=1; i<=n; i++){
        fact=fact*i;  
    }
        return fact;
}
}
