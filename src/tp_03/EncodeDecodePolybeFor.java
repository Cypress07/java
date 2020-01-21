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
public class EncodeDecodePolybeFor {
    
   public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);    
        
        int i, j;
        final int N = 5;
        char [][] tab = new char[][] {
         
            {'a','b','c','d','e'},  
            {'f','g','h','i','j'},
            {'k','l','m','n','o'},
            {'p','q','r','s','t'},
            {'u','v','x','y','z'},
            
        };
         
        for (i = 0; i<N; i++){
            System.out.println();
            for (j = 0; j<N; j++){
                System.out.print (tab[i][j]+ " ") ;
        } 
        }
        
        System.out.print("Entrez votre message :");
        String message = reader.nextLine();
         
        System.out.println ("\nCRYPTAGE");
        int [] message_crypte = code_polybe(message);
        for (i = 0 ; i<message_crypte.length; i++){
            System.out.print (message_crypte [i] +" ");
        }
     //Décodage de message
        System.out.println ("\nDECRYPTAGE");
        System.out.println(" "+decode_polybe (message_crypte));
    }
   public static int [] code_polybe(String message) {
          
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
            
       char lettre ;
       int pos = 0 ;
       int [] c = new int [message.length()*2];
       
            for (int k = 0 ; k < message.length(); k++){
                lettre = message.charAt(k);
                for (int i = 0 ; i<N ; i++)
                    for (int j = 0 ; j<N ; j++)
                        if (lettre == tab[i][j]){
                            c[pos++]=i;
                            c[pos++]=j;
                        }
        }
        return c;
    }
public static String decode_polybe(int [] messagecrypte) {
        
   String message = " ";
        int i=0, j=0, k;
        final int N=5;
        char [][] tab = new char[][] {
         
            {'a','b','c','d','e'},  
            {'f','g','h','i','j'},
            {'k','l','m','n','o'},
            {'p','q','r','s','t'},
            {'u','v','x','y','z'},
            
        };
         
            
            for (k = 0 ; k < messagecrypte.length ; k=k+2){
                i = messagecrypte [k];
                j = messagecrypte [k+1];
                
                if (tab[i][j] == 'V') {
                    message = message + "V/W";
                }
                    else
                message = message + tab[i][j];
                }
            
            return message;
 }
}
