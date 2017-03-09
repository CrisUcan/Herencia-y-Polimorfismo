/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isc.isma4.figuras;



/**
 *
 * @author lindsay
 */
public class Circulo extends Figura {

    public double radio;

    @Override
    public double getArea() {
        return Math.PI * radio * radio;

    }

    public Circulo(double radio) {
        this.radio = radio;
    }

}
