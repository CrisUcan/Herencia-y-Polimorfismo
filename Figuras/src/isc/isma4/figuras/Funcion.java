/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isc.isma4.figuras;

import java.util.Scanner;
import sun.applet.Main;

/**
 *
 * @author Alejandro del Carmen
 */
public class Funcion extends Figura{

    private double a;
    private double b;
    private double h;
    private double n;
    private double integral;
    private double sumatoria;

    public static void main(String[] args) {
        
    }

    private void aplicacion() {
        Scanner s = new Scanner(System.in);
        
        a = s.nextDouble();
        b = s.nextDouble();
        n = s.nextDouble();

//El siguiente es el método de integración del trapecio 
        h = (b - a) / n;
        for (int j = 1; j <= n - 1; ++j) {
            sumatoria += f(a + j * h);
        }
        integral = (h / 2) * (f(a) + 2 * sumatoria + f(b));

        
    }

    private double f(double x) {
// Función de prueba: f(x) = x² 
        return x * x;
    }

    @Override
    public double getArea() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
