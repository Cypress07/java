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
public class NombrePremier {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner reader = new Scanner(System.in);        
    int n;
    
    System.out.print ("Ecrire un entier :");
    n = reader.nextInt();
    if (Premier (n))
    {
        System.out.println ("Le nombre "+n+" est un nombre premier ");
    }
    else {
        System.out.println ("Le nombre "+n+" n'est pas un nombre premier ");
    }
    //OPERATEUR TERNAIRE
    //System.out;println (Premier (n)) ? "Est Premier": "N'est pas premier";
    
    
    //TP8A
    System.out.println ("Liste des nombres premiers [3,n]");
    System.out.println ("Choix de la valeur de n:");
    int n2=reader.nextInt ();
    AfficheNP (n2);
    
    //TP08B Nombres Premiers Jumeaux
    System.out.println ("Choix de la valeur de n:");
    int n3=reader.nextInt ();
    AfficheNPJ (n3);
    }
    
    public static boolean Premier(int n) { 
    
    int div=3  ;
    
    if (n==1){
        return false;
    }
    if (n==2){
            return true;
    }
    if (n%2==0){
        return false;
    }
    while (div * div <= n && n % div >0 ){
        div=div+2 ;
    }
    
    return div*div >n ;
}
public static void AfficheNP(int n2) {
    
    System.out.println ("Liste des nombres de l'intervalle de [3, n]:");
   
    for (int i=3; i<=n2; i++){
        if (Premier (i)){
            System.out.print (i+ " ");
        }
    }
System.out.println ("\nFin de la liste");
}

public static void AfficheNPJ(int n3) {
   
    System.out.println ("Liste des nombres de l'intervalle de [3, n]:");
    int ad, d=2 ;
        
    for (int i=3 ; i<=n3 ; i++) {       
       if (Premier (i)){
        ad = d ;
        d=i;
        if (d==ad+2)     
            System.out.printf ("Premiers jumeaux : %d %d\n", ad ,d );
    }
}    
}
}
