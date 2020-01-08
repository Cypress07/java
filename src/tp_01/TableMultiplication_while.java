/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_01;

import java.util.Scanner;

/**
 *
 * @author mika
 */
public class TableMultiplication_while {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner reader = new Scanner(System.in);    
    //VARIABLES 
       int i, n  ;
    System.out.print("Entrez un nombre entier :") ;
    n = reader.nextInt();

        i = 0;
        while(i <= 99){
        i++;
        
        System.out.printf("%d * %d = %d \n", n, i, n * i);

            
        }
    }
}

