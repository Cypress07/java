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
public class DivisionEuclidienne {

     public static void main(String[] args) {
        // TODO code application logic here
    Scanner reader = new Scanner(System.in);    
    int[] res;
    int dividende, diviseur;
    
    System.out.print("Entrez le dividende:");
    dividende=reader.nextInt();
    
    System.out.print("Entrez le diviseur:");
    diviseur=reader.nextInt ();
  
    res=divEuclidienne (dividende, diviseur);
    
    System.out.println("Quotient de la division:"+res[0]);
    System.out.println("Reste de la division:"+res[1]);
     }
    
    public static int[] divEuclidienne (int dividende, int diviseur) {
        
       int [] resultat = new int [2];
       
       
       resultat[0] = dividende / diviseur ;
       resultat[1] = dividende % diviseur ;
      
        return resultat;

}
}
       