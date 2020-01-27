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
public class CalculPartieEntiere {
  
   
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner reader = new Scanner(System.in);    
                   
    System.out.print ("Ecrivez un réel:");
    double r = reader.nextDouble();    
    
    System.out.println ("La partie entière du réel:" + PartieEntiere (r)) ;
    }
    
public static int PartieEntiere (double x) {

    int resultat=0;

    while (resultat < x) {
    resultat++;
}
    return resultat - 1 ;
} 
 }           
       
