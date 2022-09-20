package controlador;

import clases.Neumatico;
import clases.Procesos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import vista.Vista;

public class Controlador implements ActionListener {

    Vista vista;
    Procesos procesos;

    public Controlador() {
        vista = new Vista();
        procesos = new Procesos();

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
            listarInventario();
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

            try {
                String marca = vista.getTxt_agregar_marca().getText();
                int tamRing = Integer.parseInt(vista.getSpinner_agregar_tamaño_rin().getValue().toString());
                char velMax = vista.getCb_agregar_velocidad_maxima().getSelectedItem().toString().charAt(0);
                int perfilCarga = Integer.parseInt(vista.getSpinner_agregar_perfil_carga().getValue().toString());
                int anchoNominal = Integer.parseInt(vista.getSpinner_agregar_ancho_nominal().getValue().toString());

                Neumatico nuevoNeumatico = new Neumatico(marca, tamRing, velMax, perfilCarga, anchoNominal);
                procesos.nuevoNeumatico(nuevoNeumatico);

                mensaje("Se agrego correctamente");
            } catch (NumberFormatException e) {
                mensaje("Ops ha ocurrido un error:\n" + e);
            }
        } else {
            mensaje("No puedes dejar la marca vacia");
        }
    }

    public void ordenar() {
    }

    public void buscar() {
    }

    public void listarInventario() {
        vista.getTxt_inventario().setText("");
        vista.getTxt_inventario().setText(procesos.mostrarListaNeumaticos());
    }

    public void mensaje(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }

}
