/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isc.isma4.figuras;



/**
 *
 * @author lindsay
 */
public class Cuadrado extends Rectangulo{
    public double lado;
    
    @Override 
    public double getArea(){
        return lado*lado;
                
    }
    
    public Cuadrado(double lado){
        this.lado = lado;

  
    }
    
}
