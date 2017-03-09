/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Carreras;

/**
 *
 * @author alejandro del Carmen
 */
public class Industrias extends Carrera {
      public double azuloscuro;
    @Override
    public double getColor(){
        return azuloscuro;
    }
    public Industrias (double azuloscuro){
        this.azuloscuro=azuloscuro;
        
    }
    
    
}