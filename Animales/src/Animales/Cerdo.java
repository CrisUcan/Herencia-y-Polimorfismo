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
public class Cerdo extends Animal {
      public String oink;
    @Override
    public String getSonido(){
        return oink;
    }
    public Cerdo (String oink){
        this.oink=oink;
        
    }
    
    
}
