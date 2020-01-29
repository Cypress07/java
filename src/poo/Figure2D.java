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
public abstract class Figure2D {
   
    private double x;
    private double y;
   
    public Figure2D() {}
    
    public Figure2D (double x, double y) {
    
        this.x=x;
        this.y=y;
    }
   
    public abstract double calcSurface () ;    
 
 }    
