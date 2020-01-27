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
public class PgcdEuclide {

     public static void main(String[] args) {
        // TODO code application logic here
    Scanner reader = new Scanner(System.in);    
   
    System.out.print ("Ecrivez un entier:");
    int a = reader.nextInt();    
    
    System.out.print ("Ecrivez un entier:");
    int b = reader.nextInt();
    
    System.out.println("Le pgcd de "+a +" et "+b+" est : " + pgcd (a,b));
  }
    
    public static int pgcd (int a, int b) {

        while ( a != b ) {
	if ( a < b )
	  b = b - a;
	else
	  a = a - b;
        }
        return a;

}
}
       