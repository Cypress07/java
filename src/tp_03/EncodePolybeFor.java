/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_03;
 import java.util.Scanner;
/**
 *
 * @author mika
 */
public class EncodePolybeFor {
    
   public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);    
        String message = new String ();
         
        System.out.print("Entrez votre message : \n\t");
        message = reader.nextLine();
         
        //test de la fonction :
        System.out.print(" "+polybe(message));
    }
   public static String polybe(String message) {
          
        String messageCrypte = "";
        final int N=5;
        char [][] tab = new char[][] {
         
            {'a','b','c','d','e'},  
            {'f','g','h','i','j'},
            {'k','l','m','n','o'},
            {'p','q','r','s','t'},
            {'u','v','x','y','z'},
            
        };
 
            message=message.toLowerCase();
            message=message.replace('w','v');
            message=message.replace('ç','c');
            message=message.replace('é','e');
            message=message.replace('è','e');
            message=message.replace('à','a');
            message=message.replace('ù','u');
             
            //cryptage du message :
            for (int k = 0; k<message.length(); k++)
                for(int i = 0; i<N; i++)
                    for(int j = 0; j<N; j++)
                        if((message.charAt(k))==(tab[i][j]))
                        {
                            messageCrypte+=(i);
                            messageCrypte+=(j);
                            messageCrypte+=' ';
                        }
 
            return messageCrypte;
        }
 
    }