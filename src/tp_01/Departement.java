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
public class Departement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner reader = new Scanner(System.in);    
    int dept ;
    
     System.out.print("Entrez votre numéro de département :");
      dept = reader.nextInt();
      
        switch (dept) {
            case 13:
                System.out.println("Votre département est les Bouches-du-Rhone");
                break;
            case 83:
                System.out.println("Votre départment est le Var");
                break;
            case 84:
                System.out.println("Votre départment est le Vaucluse");
                break;
            default :
                System.out.println("Saisie non valide");
        }
        } 
  }
