/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodo.lagrange;

/**
 *
 * @author Nanci Uicab
 */
public class Punto2 {
    private int i2; //Posición
    private double x2; //valor de la v.i
    private double y2; // valor de la función v.d

    public int getI2() {
        return i2;
    }

    public void setI2(int i2) {
        this.i2 = i2;
    }

    
    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    @Override
    public String toString() {
        return "Punto2{" + "i=" + i2 + ", x2=" + x2 + ", y2=" + y2 + '}';
    }
    
    
}
