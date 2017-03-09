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
public class Energias extends Carrera {
      public double negro;
    @Override
    public double getColor(){
        return negro;
    }
    public Energias (double negro){
        this.negro=negro;
        
    }
    
    
}