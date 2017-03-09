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
public class Hexagono extends Figura {

    public double lado, apotema, perimetro;

    @Override
    public double getArea() {
        return (perimetro * apotema) / 2;

    }

    public double getPerimetro() {
        return lado * 6;
    }

    public Hexagono(double lado, double apotema, double perimetro) {
        this.lado = lado;
        this.apotema = apotema;
        this.perimetro = perimetro;

    }

}