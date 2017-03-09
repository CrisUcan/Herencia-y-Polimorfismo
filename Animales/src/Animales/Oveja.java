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
public class Oveja extends Animal {
      public String meee;
    @Override
    public String getSonido(){
        return meee;
    }
    public Oveja (String meee){
        this.meee =meee;
        
    }
    
    
}