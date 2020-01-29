
package poo;

import java.util.Calendar;

public class Personne {

    private String nom ;
    private int anneeNaissance ;
    private int salaire ;
            
    
    public Personne() {
    }

    public Personne(String nom, int anneeNaissance, int salaire) {
        this.nom = nom;
        this.anneeNaissance = anneeNaissance;
        this.salaire = salaire;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the anneeNaissance
     */
    public int getAnneeNaissance() {
        return anneeNaissance;
    }

    /**
     * @param anneeNaissance the anneeNaissance to set
     */
    public void setAnneeNaissance(int anneeNaissance) {
        this.anneeNaissance = anneeNaissance;
    }

    /**
     * @return the salaire
     */
    public int getSalaire() {
        return salaire;
    }

    /**
     * @param salaire the salaire to set
     */
    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }
            
    public int calculAge(){   
 
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        return year - getAnneeNaissance();
    }
    
    public static void main (String [] args) {
        
    Personne p1 = new Personne ("JOE", 1990, 12000);
    Personne p2 = new Personne ("JOE", 1990, 12000);
     
        if (p1.equals(p2)){
         
         System.out.println("Ce sont les mêmes persones");
    }
        else {
         System.out.println ("Ce sont des personnes différentes");
    }
    }
    public void affiche (){
        
       System.out.printf ("%s agée de %d ans\n", getNom(), calculAge()); 
    }
}    