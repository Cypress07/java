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
public class Comparaison_2entiers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner reader = new Scanner(System.in);    
    int n1,n2 ;
    
  System.out.print("Entrez un nombre entier :");
      n1=reader.nextInt();
      
  System.out.print("Entrez un nombre entier :");
      n2=reader.nextInt();
    
    if (n1<n2){
        System.out.println("1er entier est plus petit que le second entier");}
    else if (n2<n1) {
        System.out.println("1er entier est plus grand que le second entier");} 
        
    else {
           System.out.println("1er entier est identique au second entier");} 
    
    }
    
}