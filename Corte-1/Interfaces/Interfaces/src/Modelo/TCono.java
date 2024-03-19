/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author wever
 */
public class TCono implements ISolido {

    private double Radio;
    private double Altura;

    public TCono() {
        Radio = 0;
        Altura = 0;

    }

    public double getRadio() {
        return Radio;
    }

    public void setRadio(double R) {
        if (R >= 0) {
            Radio = R;
        }
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double A) {
        if (A >= 0) {
            Altura = A;
        }
    }

    public double Generatriz() {
        double res = Math.sqrt(Math.pow(getRadio(), 2) + Math.pow(getAltura(), 2));
        return res;
    }

    @Override
    public double AreaTotal() {
        double res = Math.PI * getRadio() * (getRadio() + Generatriz());
        return res;

    }

    @Override
    public double Volumen() {
        double res= Math.PI*getAltura()*Math.pow(getRadio(), 2)/3;
        return res;
    }

}
