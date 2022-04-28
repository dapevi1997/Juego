package Forms;

import Clases.BaseDeDatos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaInicial extends JFrame {


    private JPanel pnlBienv;
    private JTextField txtNombre;
    private JButton btnSalir;
    private JButton btbComenzar;
    private JLabel lblBienv;
    private JLabel lblNombre;


    private String nomJugador;


    public VentanaInicial() {

        this.setSize(400, 400);
        this.setTitle("Registro");
        this.setVisible(true);
        this.setContentPane(pnlBienv);

        btnSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        btbComenzar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (txtNombre.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Por favor, ingrese nombre válido");
                } else {
                    nomJugador = txtNombre.getText();
                    VentanaJuego ventanaJuego = new VentanaJuego();
                    ventanaJuego.setNomJugador(nomJugador);
                    ventanaJuego.setVisible(true);
                    CerrarVentanaInicio();
                }
            }
        });
    }

    private void CerrarVentanaInicio() {
        this.setVisible(false);
    }
}
