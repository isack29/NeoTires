package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.Vista;

public class Controlador implements ActionListener {
    
    Vista vista;
    
    public Controlador() {
        vista = new Vista();
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
        
    }
    
}
