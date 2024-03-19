package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import Modelo.*;
import Vista.*;

public class Controlador implements ActionListener {

    Interfaz vista;
    TCilindro modeloCilindro;
    TCono modeloCono;
    TCubo modeloCubo;
    TEsfera modeloEsfera;

    public Controlador() {
        vista = new Interfaz();
        CambiarTitulo();
        vista.getComboSolido().addActionListener(this);
        vista.getBCalcular().addActionListener(this);

    }

    public void Run() {

        vista.setResizable(false);
        vista.setLocationRelativeTo(null);
        vista.setTitle("INICIO");
        vista.setVisible(true);
        //vista.getResultado().setText("Prueba");

    }

    private TEsfera CrarEsfera() {
        TEsfera Esf = new TEsfera();
        Esf.setRadio(Float.parseFloat(vista.getCTLado().getText()));
        return Esf;
    }

    private TCubo CrearCubo() {
        TCubo Cub = new TCubo();
        Cub.setLado(Float.parseFloat(vista.getCTLado().getText()));
        return Cub;

    }

    private TCilindro CrearCilindro() {
        TCilindro Cil = new TCilindro();
        Cil.setRadio(Float.parseFloat(vista.getCTLado().getText()));
        Cil.setAltura(Float.parseFloat(vista.getCTRadio().getText()));
        return Cil;

    }

    private TCono CrearCono() {
        TCono Con = new TCono();
        Con.setRadio(Float.parseFloat(vista.getCTLado().getText()));
        Con.setAltura(Float.parseFloat(vista.getCTRadio().getText()));
        return Con;

    }

    private void Mostrar(ISolido Sol) {
        vista.getCTArea().setText(String.format("%.3f", Sol.AreaTotal()));
        vista.getCTVolumen().setText(String.format("%.3f", Sol.Volumen()));

    }

    public void CambiarTitulo() {
        vista.getjLabel2().setText("");
        vista.getjLabel3().setText("");
        switch (vista.getComboSolido().getSelectedIndex()) {
            case 0:
                vista.getjLabel2().setText("Lado");
                break;
            case 1:
                vista.getjLabel2().setText("Radio");
            case 2:
            case 3:
                vista.getjLabel2().setText("Radio");
                vista.getjLabel3().setText("Altura");
                break;

        }
        if (vista.getComboSolido().getSelectedIndex() < 2) {
            vista.getjLabel3().setText("");
            vista.getCTRadio().setVisible(false);

        } else {
            vista.getCTRadio().setVisible(true);
        }

    }

    public void Calcular() {
        ISolido Sol;
        switch (vista.getComboSolido().getSelectedIndex()) {
            case 0:
                Sol = CrearCubo();
                break;
            case 1:
                Sol = CrarEsfera();
                break;
            case 2:
                Sol = CrearCilindro();
                break;
            case 3:
                Sol = CrearCono();
                break;
            default:
                Sol = null;

        }
        Mostrar(Sol);
    }

    @Override

    public void actionPerformed(ActionEvent e) {
        modeloCilindro = new Modelo.TCilindro();
        if (e.getSource() == vista.getComboSolido()) {
            CambiarTitulo();
        }
        if (e.getSource() == vista.getBCalcular()) {
            Calcular();
        }      

    }
}
