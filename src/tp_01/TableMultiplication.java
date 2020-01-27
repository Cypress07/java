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
public class TableMultiplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner reader = new Scanner(System.in);    
    //VARIABLES 
    int i, n, multiplication ;
    System.out.print("Entrez un nombre entier :") ;
    n = reader.nextInt();
    
       int num = n;
       for(i = 1; i <= 100; ++i)
        {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
        
 
    }
}
    }
    

