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
public class Rana extends Animal {
      public String berec;
    @Override
    public String getSonido(){
        return berec;
    }
    public Rana  (String berec){
        this.berec=berec;
        
    }
    
    
}