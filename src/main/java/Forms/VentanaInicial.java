package Forms;


import javax.swing.*;


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
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setContentPane(pnlBienv);

        btnSalir.addActionListener(e -> System.exit(0));
        btbComenzar.addActionListener(e -> {
            if (txtNombre.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese nombre válido");
            } else {
                nomJugador = txtNombre.getText();
                VentanaJuego ventanaJuego = new VentanaJuego();
                ventanaJuego.setNomJugador(nomJugador);
                ventanaJuego.setVisible(true);
                CerrarVentanaInicio();
            }
        });
    }

    private void CerrarVentanaInicio() {
        this.setVisible(false);
    }
}
