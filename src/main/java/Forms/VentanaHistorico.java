package Forms;

import Clases.BaseDeDatos;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ComponentAdapter;
import java.sql.ResultSet;

public class VentanaHistorico extends JFrame {
    private JLabel lblDatosHist;
    private JPanel pnlDatosHist;
    private JButton btnFinJuego;
    private JScrollPane jpnlVentanaHist;
    private JTable tbDatosHist;

    public VentanaHistorico() {
        this.setSize(430, 400);
        this.setTitle("Datos históricos");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setContentPane(pnlDatosHist);

        mostrar();

        btnFinJuego.addActionListener(e -> System.exit(0));
        tbDatosHist.addComponentListener(new ComponentAdapter() {
        });
    }

    public void mostrar() {
        DefaultTableModel modelo = new DefaultTableModel();
        ResultSet rs = BaseDeDatos.obtDatos("select nombre,puntaje from jugadores");
        modelo.setColumnIdentifiers(new Object[]{"Nombre", "Puntaje"});
        try {
            while (rs.next()) {
                modelo.addRow(new Object[]{rs.getString("nombre"), rs.getString("puntaje")});
            }
            tbDatosHist.setModel(modelo);
        } catch (Exception e) {
        }
    }


}