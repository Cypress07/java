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
public class Carre extends Figure2D {
      
    private double cote;
    
    public Carre (){}
    
    public Carre (double x, double y, double cote){
        super (x, y);
        this.cote=cote;
    }

    @Override
    public double calcSurface (){

        return cote*cote;
        
    }
}