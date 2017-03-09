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
public class Rectangulo extends Figura {

    public double base;
    public double altura;

    @Override
    public double getArea() {
        return base * altura;
    }

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.altura = altura;
        this.base = base;

    }

}
