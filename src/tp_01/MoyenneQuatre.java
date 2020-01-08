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
public class MoyenneQuatre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    Scanner reader = new Scanner(System.in);    
    int n1,n2,n3,n4;
    double moyenne;
    
    
     
    System.out.print("Entrez la valeur du premier nombre :");
        n1 = reader.nextInt();
    System.out.print("Entrez la valeur du deuxieme nombre :");
        n2 = reader.nextInt();
    System.out.print("Entrez la valeur du troisieme nombre :");
        n3 = reader.nextInt(); 
    System.out.print("Entrez la valeur du quatrieme nombre :");
        n4 = reader.nextInt();   
        //Calcul de la moyene
        moyenne = (n1 + n2 + n3 + n4) / 4.0;
        //Affichage du résultat
        System.out.println("La moyenne vaut : " + moyenne);   
            
            
                }
    
    
}
