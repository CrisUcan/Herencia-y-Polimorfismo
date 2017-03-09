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
public class Turismo extends Carrera {
      public double amarillo;
    @Override
    public double getColor(){
        return amarillo;
    }
    public Turismo (double amarillo){
        this.amarillo=amarillo;
        
    }
    
    
}