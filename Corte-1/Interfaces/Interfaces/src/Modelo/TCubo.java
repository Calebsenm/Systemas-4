/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author wever
 */
public class TCubo implements ISolido {

    private float lado;

    public TCubo() {
        lado = 0;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float la) {
        if (la >= 0) {
            lado = la;
        }
    }

    @Override
    public double AreaTotal() {
        double res = 6 * Math.pow(getLado(), 2);
        return res;

    }

    @Override
    public double Volumen() {
        double res = Math.pow(getLado(), 3);
        return res;
    }

}
