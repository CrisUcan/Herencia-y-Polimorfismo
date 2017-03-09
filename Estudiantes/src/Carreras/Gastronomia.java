/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Carreras;

/**
 *
 * @author Alejandro del Carmen
 */
public class Gastronomia extends Carrera {
      public double blanco;
    @Override
    public double getColor(){
        return blanco;
    }
    public Gastronomia (double blanco){
        this.blanco=blanco;
        
    }
    
    
}