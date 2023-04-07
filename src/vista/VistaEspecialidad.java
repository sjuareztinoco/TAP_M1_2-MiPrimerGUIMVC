package vista;

import javax.swing.*;
import java.awt.*;

public class VistaEspecialidad extends JFrame {
    public JButton btnNuevo,btnGuardar,btnSalir;
    private JPanel pnlDatos1, pnlDatos2, pnlBotones;
    public JLabel lblClave,lblNombre;
    public JTextField jtxClave,jtxNombre;

    public VistaEspecialidad() {
        getContentPane().setLayout(new BorderLayout());

        pnlDatos1 = new JPanel();
        pnlDatos1.setLayout(new FlowLayout());
        pnlDatos2 = new JPanel();
        pnlDatos2.setLayout(new FlowLayout());

        pnlBotones = new JPanel();
        pnlBotones.setLayout(new FlowLayout());

        btnNuevo   = new JButton("Nuevo");
        btnGuardar = new JButton("Guardar");
        btnSalir   = new JButton("Salir");

        lblClave  = new JLabel("Clave  :");
        lblNombre = new JLabel("Nombre :");

        jtxClave  = new JTextField(30);
        jtxClave.setText("1");
        jtxNombre = new JTextField(30);
        jtxNombre.setText("Especialidad");

        pnlDatos1.add(lblClave);
        pnlDatos1.add(jtxClave);
        pnlDatos2.add(lblNombre);
        pnlDatos2.add(jtxNombre);

        pnlBotones.add(btnNuevo);
        pnlBotones.add(btnGuardar);
        pnlBotones.add(btnSalir);

        add(pnlDatos1, BorderLayout.NORTH);
        add(pnlDatos2, BorderLayout.CENTER);
        add(pnlBotones, BorderLayout.SOUTH);

    }
}