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
public class TabledeMultiplication {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    Scanner reader = new Scanner(System.in);
    
    System.out.print ("Entrez un nombre entier :") ;
    int n = reader.nextInt();
    
    TM(n);
}
 public static void TM(int x) {
   
   for(int i = 1; i <=10; ++i) {
      System.out.printf ("%d *%d = %d\n", i, x, x*i) ;
  
}
}
}
