package Forms;

import Clases.*;

import javax.swing.*;


public class VentanaJuego extends JFrame {
    private JRadioButton rb1;
    private JRadioButton rb2;
    private JRadioButton rb3;
    private JRadioButton rb4;
    private JButton btnValidar;
    private JButton btnRetirarse;
    private JPanel pnlVentanaJuego;


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

        this.setSize(430, 400);
        this.setTitle("Jugando");
        this.configCampos(1);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setContentPane(pnlVentanaJuego);

        final ButtonGroup btg;
        btg = new ButtonGroup();
        btg.add(rb1);
        btg.add(rb2);
        btg.add(rb3);
        btg.add(rb4);

        btnRetirarse.addActionListener(e -> {
            BaseDeDatos.insert(nomJugador, puntaje);
            JOptionPane.showMessageDialog(null, nomJugador + " su puntaje final es: " + puntaje);
            VentanaHistorico ventanaHistorico = new VentanaHistorico();
            ventanaHistorico.setVisible(true);
            ocultarVentanaJuego();
        });
        btnValidar.addActionListener(e -> {
            int selUsuario = 0;
            if (lblRonda.getText().equals("Primera ronda")) {
                if (rb1.isSelected()) {
                    selUsuario = 1;
                } else if (rb2.isSelected()) {
                    selUsuario = 2;

                } else if (rb3.isSelected()) {
                    selUsuario = 3;

                } else if (rb4.isSelected()) {
                    selUsuario = 4;
                }

                if (selUsuario == ResCorr) {
                    puntaje = 10;
                    JOptionPane.showMessageDialog(null, "Respuesta Correcta \n Su puntaje es: " + puntaje);
                    configCampos(2);
                } else {
                    JOptionPane.showMessageDialog(null, "Respuesta incorrecta \n Su puntaje final es: " + puntaje);
                    BaseDeDatos.insert(nomJugador, puntaje);
                    VentanaHistorico ventanaHistorico = new VentanaHistorico();
                    ventanaHistorico.setVisible(true);
                    ocultarVentanaJuego();
                }

            } else if (lblRonda.getText().equals("Segunda ronda")) {
                if (rb1.isSelected()) {
                    selUsuario = 1;
                } else if (rb2.isSelected()) {
                    selUsuario = 2;

                } else if (rb3.isSelected()) {
                    selUsuario = 3;

                } else if (rb4.isSelected()) {
                    selUsuario = 4;
                }

                if (selUsuario == ResCorr) {
                    puntaje += 10;
                    JOptionPane.showMessageDialog(null, "Respuesta Correcta \n Su puntaje es: " + puntaje);
                    configCampos(3);

                } else {
                    JOptionPane.showMessageDialog(null, "Respuesta incorrecta \n Su puntaje final es: " + puntaje);
                    BaseDeDatos.insert(nomJugador, puntaje);
                    VentanaHistorico ventanaHistorico = new VentanaHistorico();
                    ventanaHistorico.setVisible(true);
                    ocultarVentanaJuego();
                }

            } else if (lblRonda.getText().equals("Tercera ronda")) {
                if (rb1.isSelected()) {
                    selUsuario = 1;
                } else if (rb2.isSelected()) {
                    selUsuario = 2;

                } else if (rb3.isSelected()) {
                    selUsuario = 3;

                } else if (rb4.isSelected()) {
                    selUsuario = 4;
                }

                if (selUsuario == ResCorr) {
                    puntaje += 10;
                    JOptionPane.showMessageDialog(null, "Respuesta Correcta \n Su puntaje es: " + puntaje);
                    configCampos(4);

                } else {
                    JOptionPane.showMessageDialog(null, "Respuesta incorrecta \n Su puntaje final es: " + puntaje);
                    BaseDeDatos.insert(nomJugador, puntaje);
                    VentanaHistorico ventanaHistorico = new VentanaHistorico();
                    ventanaHistorico.setVisible(true);
                    ocultarVentanaJuego();
                }

            } else if (lblRonda.getText().equals("Cuarta ronda")) {
                if (rb1.isSelected()) {
                    selUsuario = 1;
                } else if (rb2.isSelected()) {
                    selUsuario = 2;

                } else if (rb3.isSelected()) {
                    selUsuario = 3;

                } else if (rb4.isSelected()) {
                    selUsuario = 4;
                }

                if (selUsuario == ResCorr) {
                    puntaje += 10;
                    JOptionPane.showMessageDialog(null, "Respuesta Correcta \n Su puntaje es: " + puntaje);
                    configCampos(5);

                } else {
                    JOptionPane.showMessageDialog(null, "Respuesta incorrecta \n Su puntaje final es: " + puntaje);
                    BaseDeDatos.insert(nomJugador, puntaje);
                    VentanaHistorico ventanaHistorico = new VentanaHistorico();
                    ventanaHistorico.setVisible(true);
                    ocultarVentanaJuego();
                }

            } else if (lblRonda.getText().equals("Ronda final")) {
                if (rb1.isSelected()) {
                    selUsuario = 1;
                } else if (rb2.isSelected()) {
                    selUsuario = 2;

                } else if (rb3.isSelected()) {
                    selUsuario = 3;

                } else if (rb4.isSelected()) {
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
                    BaseDeDatos.insert(nomJugador, puntaje);
                    VentanaHistorico ventanaHistorico = new VentanaHistorico();
                    ventanaHistorico.setVisible(true);
                    ocultarVentanaJuego();
                }
            }
        });
    }

    private void configCampos(int numRonda) {
        int n;
        n = numRonda;
        Ronda ron = null;
        if (n == 1) {
            ron = new Ronda1();
        } else if (n == 2) {
            ron = new Ronda2();
        } else if (n == 3) {
            ron = new Ronda3();
        } else if (n == 4) {
            ron = new Ronda4();
        } else if (n == 5) {
            ron = new RondaFinal();
        }

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
