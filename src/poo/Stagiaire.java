package poo;


public class Stagiaire {
    
 private String nom ;
 private String prenom ;

public Stagiaire (){
    
} 
 
public Stagiaire(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;        
}
 
 public String getNom() {
        return nom;
    }

   
    public void setNom(String nom) {
        this.nom = nom;
    }

     public String getPrenom() {
        return prenom;
    }

   
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }



@Override
public boolean equals(Object obj) {

    if (obj instanceof Stagiaire)  {
       Stagiaire s = (Stagiaire) obj;
      return s.getNom().equalsIgnoreCase(this.getNom()) &&
              s.getPrenom().equalsIgnoreCase (this.getPrenom());
}
    else{
        return super.equals (obj);
    }
}

}
 