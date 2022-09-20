package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import vista.Vista;

public class Controlador implements ActionListener {

    Vista vista;

    public Controlador() {
        vista = new Vista();

        vista.getBtn_agregar().addActionListener(this);

        vista.getBtn_ordenar().addActionListener(this);

        vista.getBtn_buscar().addActionListener(this);

    }

    public void Run() {
        vista.setTitle("NeoTires / Gestion de inventario");
        vista.setSize(600, 470);
        vista.setResizable(false);
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == vista.getBtn_agregar()) {
            agregar();
        }

        if (e.getSource() == vista.getBtn_ordenar()) {
            ordenar();
        }

        if (e.getSource() == vista.getBtn_buscar()) {
            buscar();
        }

    }

    public void agregar() {
        if (!vista.getTxt_agregar_marca().getText().equals("")) {

            String marca = vista.getTxt_agregar_marca().getText();
            int tamRing = Integer.parseInt(vista.getSpinner_agregar_tamaño_rin().getValue().toString());
            char velMax = vista.getCb_agregar_velocidad_maxima().getSelectedItem().toString().charAt(0);
            mensaje("Se agrego correctamente");
        } else {
            mensaje("No puedes dejar la marca vacia");
        }
    }

    public void ordenar() {
    }

    public void buscar() {
    }

    public void mensaje(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }

}
