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
public class Test {

    /**
     * @param args the command line arguments
     */
    
public static void main(String[] args) {

  /*
    Figure2D [] tab = { new Carre (0,0,10),
                       new Cercle (15,10,10)        
                      };
*/
  
  Figure2D[] tab = new Figure2D [2];
  tab[0]= new Carre (0, 0, 10);
  tab[1]= new Cercle (15, 10, 10);
   
  double surfTotale=0;
  
  for (int i=0 ; i<tab.length ; i++) {
      surfTotale += tab[i].calcSurface(); 
              }
   System.out.printf ("Surface totale : %5.2f\n", surfTotale);
}
}
