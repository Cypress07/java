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
public class Cercle extends Figure2D {
    
    private double rayon;
    
 public Cercle (){}
    
    public Cercle (double x, double y, double rayon){
        super (x, y);
        this.rayon=rayon;
    }
    
    @Override
    public double calcSurface (){

        return rayon*rayon*Math.PI;
        
    }
}