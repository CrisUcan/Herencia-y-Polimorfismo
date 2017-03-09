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
public class Administracion extends Carrera {
      public double rojo;
    @Override
    public double getColor(){
        return rojo;
    }
    public Administracion (double rojo){
        this.rojo=rojo;
        
    }
    
    
}
