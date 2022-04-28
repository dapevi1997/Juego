package Forms;

import Clases.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaJuego extends JFrame {
    private JRadioButton rb1;
    private JRadioButton rb2;
    private JRadioButton rb3;
    private JRadioButton rb4;
    private JButton btnValidar;
    private JButton btnRetirarse;
    private JPanel pnlVentanaJuego;
    private ButtonGroup btg;


    private JLabel lblRonda;
    private JLabel lblPregunta;
    private int ResCorr;
    private int puntaje;

    public void setNomJugador(String nomJugador) {
        this.nomJugador = nomJugador;
    }

    private String nomJugador;


    public VentanaJuego() {
        puntaje = 0;

        this.setSize(400, 400);
        this.setTitle("Jugando");
        this.configurarcamposR1();
        this.setContentPane(pnlVentanaJuego);

        btg = new ButtonGroup();
        btg.add(rb1);
        btg.add(rb2);
        btg.add(rb3);
        btg.add(rb4);

        btnRetirarse.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BaseDeDatos baseDeDatos = new BaseDeDatos();
                baseDeDatos.insert(nomJugador, puntaje);
                JOptionPane.showMessageDialog(null, nomJugador + " su puntaje final es: " + puntaje);
                VentanaHistorico ventanaHistorico = new VentanaHistorico();
                ventanaHistorico.setVisible(true);
                ocultarVentanaJuego();
            }
        });
        btnValidar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Ronda ron1 = new Ronda1();
                int selUsuario = 0;
                if (lblRonda.getText() == "Primera ronda") {
                    if (rb1.isSelected() == true) {
                        selUsuario = 1;
                    } else if (rb2.isSelected() == true) {
                        selUsuario = 2;

                    } else if (rb3.isSelected() == true) {
                        selUsuario = 3;

                    } else if (rb4.isSelected() == true) {
                        selUsuario = 4;
                    }

                    if (selUsuario == ResCorr) {
                        puntaje = 10;
                        JOptionPane.showMessageDialog(null, "Respuesta Correcta \n Su puntaje es: " + puntaje);
                        configurarcamposR2();
                    } else {
                        JOptionPane.showMessageDialog(null, "Respuesta incorrecta \n Su puntaje final es: " + puntaje);
                        BaseDeDatos baseDeDatos = new BaseDeDatos();
                        baseDeDatos.insert(nomJugador, puntaje);
                        VentanaHistorico ventanaHistorico = new VentanaHistorico();
                        ventanaHistorico.setVisible(true);
                        ocultarVentanaJuego();
                    }

                } else if (lblRonda.getText() == "Segunda ronda") {
                    if (rb1.isSelected() == true) {
                        selUsuario = 1;
                    } else if (rb2.isSelected() == true) {
                        selUsuario = 2;

                    } else if (rb3.isSelected() == true) {
                        selUsuario = 3;

                    } else if (rb4.isSelected() == true) {
                        selUsuario = 4;
                    }

                    if (selUsuario == ResCorr) {
                        puntaje += 10;
                        JOptionPane.showMessageDialog(null, "Respuesta Correcta \n Su puntaje es: " + puntaje);
                        configurarcamposR3();

                    } else {
                        JOptionPane.showMessageDialog(null, "Respuesta incorrecta \n Su puntaje final es: " + puntaje);
                        BaseDeDatos baseDeDatos = new BaseDeDatos();
                        baseDeDatos.insert(nomJugador, puntaje);
                        VentanaHistorico ventanaHistorico = new VentanaHistorico();
                        ventanaHistorico.setVisible(true);
                        ocultarVentanaJuego();
                    }

                } else if (lblRonda.getText() == "Tercera ronda") {
                    if (rb1.isSelected() == true) {
                        selUsuario = 1;
                    } else if (rb2.isSelected() == true) {
                        selUsuario = 2;

                    } else if (rb3.isSelected() == true) {
                        selUsuario = 3;

                    } else if (rb4.isSelected() == true) {
                        selUsuario = 4;
                    }

                    if (selUsuario == ResCorr) {
                        puntaje += 10;
                        JOptionPane.showMessageDialog(null, "Respuesta Correcta \n Su puntaje es: " + puntaje);
                        configurarcamposR4();

                    } else {
                        JOptionPane.showMessageDialog(null, "Respuesta incorrecta \n Su puntaje final es: " + puntaje);
                        BaseDeDatos baseDeDatos = new BaseDeDatos();
                        baseDeDatos.insert(nomJugador, puntaje);
                        VentanaHistorico ventanaHistorico = new VentanaHistorico();
                        ventanaHistorico.setVisible(true);
                        ocultarVentanaJuego();
                    }

                } else if (lblRonda.getText() == "Cuarta ronda") {
                    if (rb1.isSelected() == true) {
                        selUsuario = 1;
                    } else if (rb2.isSelected() == true) {
                        selUsuario = 2;

                    } else if (rb3.isSelected() == true) {
                        selUsuario = 3;

                    } else if (rb4.isSelected() == true) {
                        selUsuario = 4;
                    }

                    if (selUsuario == ResCorr) {
                        puntaje += 10;
                        JOptionPane.showMessageDialog(null, "Respuesta Correcta \n Su puntaje es: " + puntaje);
                        configurarcamposRFinal();

                    } else {
                        JOptionPane.showMessageDialog(null, "Respuesta incorrecta \n Su puntaje final es: " + puntaje);
                        BaseDeDatos baseDeDatos = new BaseDeDatos();
                        baseDeDatos.insert(nomJugador, puntaje);
                        VentanaHistorico ventanaHistorico = new VentanaHistorico();
                        ventanaHistorico.setVisible(true);
                        ocultarVentanaJuego();
                    }

                } else if (lblRonda.getText() == "Ronda final") {
                    if (rb1.isSelected() == true) {
                        selUsuario = 1;
                    } else if (rb2.isSelected() == true) {
                        selUsuario = 2;

                    } else if (rb3.isSelected() == true) {
                        selUsuario = 3;

                    } else if (rb4.isSelected() == true) {
                        selUsuario = 4;
                    }

                    if (selUsuario == ResCorr) {
                        puntaje += 10;
                        JOptionPane.showMessageDialog(null, "Excelente \n Su puntaje es: " + puntaje);
                        VentanaHistorico ventanaHistorico = new VentanaHistorico();
                        ventanaHistorico.setVisible(true);
                        ocultarVentanaJuego();

                    } else {
                        JOptionPane.showMessageDialog(null, "Respuesta incorrecta \n Su puntaje final es: " + puntaje);
                        BaseDeDatos baseDeDatos = new BaseDeDatos();
                        baseDeDatos.insert(nomJugador, puntaje);
                        VentanaHistorico ventanaHistorico = new VentanaHistorico();
                        ventanaHistorico.setVisible(true);
                        ocultarVentanaJuego();
                    }
                }
            }
        });
    }

    private void configurarcamposR1() {
        Ronda ronda1 = new Ronda1();
        lblRonda.setText(ronda1.nronda());
        lblPregunta.setText(ronda1.pregunta());
        rb1.setText(ronda1.respuesta1());
        rb2.setText(ronda1.respuesta2());
        rb3.setText(ronda1.respuesta3());
        rb4.setText(ronda1.respuesta4());
        ResCorr = ronda1.respuestacorrecta();
    }

    private void configurarcamposR2() {
        Ronda ron = new Ronda2();
        lblRonda.setText(ron.nronda());
        lblPregunta.setText(ron.pregunta());
        rb1.setText(ron.respuesta1());
        rb2.setText(ron.respuesta2());
        rb3.setText(ron.respuesta3());
        rb4.setText(ron.respuesta4());
        ResCorr = ron.respuestacorrecta();

    }

    private void configurarcamposR3() {
        Ronda ron = new Ronda3();
        lblRonda.setText(ron.nronda());
        lblPregunta.setText(ron.pregunta());
        rb1.setText(ron.respuesta1());
        rb2.setText(ron.respuesta2());
        rb3.setText(ron.respuesta3());
        rb4.setText(ron.respuesta4());
        ResCorr = ron.respuestacorrecta();

    }

    private void configurarcamposR4() {
        Ronda ron = new Ronda4();
        lblRonda.setText(ron.nronda());
        lblPregunta.setText(ron.pregunta());
        rb1.setText(ron.respuesta1());
        rb2.setText(ron.respuesta2());
        rb3.setText(ron.respuesta3());
        rb4.setText(ron.respuesta4());
        ResCorr = ron.respuestacorrecta();

    }

    private void configurarcamposRFinal() {
        Ronda ron = new RondaFinal();
        lblRonda.setText(ron.nronda());
        lblPregunta.setText(ron.pregunta());
        rb1.setText(ron.respuesta1());
        rb2.setText(ron.respuesta2());
        rb3.setText(ron.respuesta3());
        rb4.setText(ron.respuesta4());
        ResCorr = ron.respuestacorrecta();

    }

    private void ocultarVentanaJuego() {
        this.setVisible(false);
    }
}
