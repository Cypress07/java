/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author formation_gep
 */
public class TestStagiaire {

    /**
     * @param args the command line arguments
     */
      public static void main(String[] args) {
    
        Stagiaire s1 = new Stagiaire ("TOTO", "WORLD");
        Stagiaire s2 = new Stagiaire ("toto", "WorlD");
        Stagiaire s3 = new Stagiaire ("Jean-Paul", "PICHON");
        System.out.println (s1.equals(s2));
        System.out.println (s1.equals(s3));

        System.out.println (s1);
    }
}
