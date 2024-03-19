/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author wever
 */
public class TEsfera implements ISolido {

    private float radio;

    public TEsfera() {
        radio = 0;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float r) {
        if (r >= 0) {
            radio = r;
        }

    }

    @Override
    public double AreaTotal() {
        double res = 4 * Math.PI * Math.pow(getRadio(), 2);
        return res;
    }
    @Override
    public double Volumen(){
    double res=4*Math.PI*Math.pow(getRadio(), 2)/3;
    return res;
    }
}
