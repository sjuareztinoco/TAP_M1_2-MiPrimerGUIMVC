package controlador;

import modelo.ModeloEspecialidad;
import vista.VistaEspecialidad;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorEspecialidad implements ActionListener {
    private ModeloEspecialidad modeloEspecialidad;
    private VistaEspecialidad vistaEspecialidad;


    public ControladorEspecialidad(
            ModeloEspecialidad modeloEspecialidad,
            VistaEspecialidad vistaEspecialidad
    ) {
        this.modeloEspecialidad = modeloEspecialidad;
        this.vistaEspecialidad  = vistaEspecialidad;

        this.vistaEspecialidad.btnNuevo.addActionListener(this);
        this.vistaEspecialidad.btnGuardar.addActionListener(this);
        this.vistaEspecialidad.btnSalir.addActionListener(this);

    }

    public void iniciarVistaEspecialidad() {
        vistaEspecialidad.setTitle("Catalogo de Especialidades");
        vistaEspecialidad.pack();
        vistaEspecialidad.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vistaEspecialidad.setLocationRelativeTo(null);
        vistaEspecialidad.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if(vistaEspecialidad.btnNuevo == evento.getSource()) {
            clear();
        }
        else if(vistaEspecialidad.btnGuardar == evento.getSource()) {
            System.out.println("Clave:"+
                    Integer.parseInt(vistaEspecialidad.jtxClave.getText())+
                    " Nombre:"+
                    vistaEspecialidad.jtxNombre.getText());
            JOptionPane.showMessageDialog(
                    null,
                    "Registro Guardado!",
                    "AVISO",
                    JOptionPane.INFORMATION_MESSAGE
            );
            clear();
        }
        else if(vistaEspecialidad.btnSalir == evento.getSource()){
            Salir();
        }

    }

    public void clear(){
        vistaEspecialidad.jtxClave.setText("");
        vistaEspecialidad.jtxNombre.setText("");
    }

    public void Salir(){
        System.exit(0);
    }

}
