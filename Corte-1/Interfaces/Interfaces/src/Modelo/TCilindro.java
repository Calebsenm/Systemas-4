/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author wever
 */
public class TCilindro implements ISolido {

    private float Radio;
    private float Altura;

    public TCilindro() {
        Radio = 0;
        Altura = 0;
    }

    public float getRadio() {
        return Radio;
    }

    public void setRadio(float R) {
        if (R >= 0) {
            Radio = R;
        }
    }

    public float getAltura() {
        return Altura;
    }

    public void setAltura(float A) {
        if (A >= 0) {
            Altura = A;
        }
    }

    @Override
    public double AreaTotal() {
        double res = 2 * Math.PI * getRadio() * (getAltura() + getRadio());
        return res;
    }

    @Override
    public double Volumen() {
        double res = Math.PI * Math.pow(getRadio(), 2) * getAltura();
        return res;
    }

}
