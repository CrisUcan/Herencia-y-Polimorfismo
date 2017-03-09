/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animales;

/**
 *
 * @author Alejandro del Carmen
 */
public class Pollito extends Animal {
      public String pio;
    @Override
    public String getSonido(){
        return pio;
    }
    public Pollito (String pio){
        this.pio=pio;
        
    }
    
    
}