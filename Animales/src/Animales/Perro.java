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
public class Perro extends Animal {
      public String guau;
    @Override
    public String getSonido(){
        return guau;
    }
    public Perro (String guau){
        this.guau=guau;
        
    }
     
    
}
