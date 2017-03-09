/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isc.isma4.figuras;

/**
 *
 * @author Alejandro del Carmen
 */
public class Trapecio extends Figura{
    public double basemayor;
    public double basemenor;
    public double altura;
    
    @Override
    public double getArea(){
        return (basemayor * basemenor) /2 * altura;
        
    }
    public Trapecio  (double basemayor, double basemenor, double altura){
        this.basemayor=basemayor;
        this.basemenor=basemenor;
        this.altura=altura;
    }
}
