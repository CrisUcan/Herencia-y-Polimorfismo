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
public class Sistemas extends Carrera {
      public double azulclaro;
    @Override
    public double getColor(){
        return azulclaro;
    }
    public Sistemas (double azulclaro){
        this.azulclaro=azulclaro;
        
    }
    
    
}
