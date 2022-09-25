package controlador;

import clases.Neumatico;
import clases.Procesos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
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
            listarInventario();
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
                
            } catch (NumberFormatException e) {
                mensaje("Ops ha ocurrido un error:\n" + e);
            }
        } else {
            mensaje("No puedes dejar la marca vacia");
        }
    }
    
    public void ordenar() {
        String ordenarPor = vista.getCb_ordenamiento().getSelectedItem().toString();
        String metodo = vista.getCb_metodo_ordenamiento().getSelectedItem().toString();
        if (!ordenarPor.equals("Seleccione->") && !metodo.equals("Seleccione->")) {
            procesos.metodosOrdenamiento(metodo);
        } else {
            mensaje("Por favor seleccione un metodo de ordenamiento");
        }
    }
    
    public void buscar() {
        String metodo = vista.getCb_metodo_busqueda().getSelectedItem().toString();
        if (!metodo.equals("Seleccione->")) {
            int perfilCarga = Integer.parseInt(vista.getSpinner_busquedas_perfil_carga().getValue().toString());
            
            String resultadoBusqueda = procesos.buscarPorPerfilCarga(metodo, perfilCarga);
            
            if (!resultadoBusqueda.equals("")) {
                vista.getTxt_resultado_busqueda().setText(resultadoBusqueda);
            } else {
                mensaje("Neumatico inexistente");
            }
        } else {
            mensaje("Por favor seleccione un metodo de busqueda");
        }
    }
    
    public void listarInventario() {
        DefaultTableModel tabla_inventario = new DefaultTableModel(procesos.datosTablaModel().toArray(new Object[][]{}),
                new String[]{"Marca", "Tamaño del rin", "Velocidad maxima", "Perfil de carga", "Ancho nominal"});
        
        vista.getTabla_inventario().setModel(tabla_inventario);
    }
    
    public void mensaje(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }
}