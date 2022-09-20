package clases;

import javax.swing.JOptionPane;

public class Procesos {

    //Creacion vector (set y get)
    //Llenar arreglo de instancias nulas
    //Mostrar neumatica.
    //Metodo agreegar (Parametro Neumatico, (If verificar id))
    Neumatico neumaticos[] = new Neumatico[100];

    int contl = 0;

    public Procesos() {
        llenarListaNeumaticos();
    }

    public void llenarListaNeumaticos() {

        for (int i = 0; i < neumaticos.length; i++) {

            Neumatico n = new Neumatico();

            neumaticos[i] = n;

        }
    }

    public Neumatico getNeumatico(int pos) {

        return neumaticos[pos];
    }

    public void setNeumatico(int pos, Neumatico nuevNeumatico) {

        neumaticos[pos] = nuevNeumatico;
    }

    public String mostrarListaNeumaticos() {

        String mensaje = "Marca\tTamaño de Ring\tVelocidad Max\tPerfil de Carga\tAncho Nominal\n";

        for (int i = 0; i < neumaticos.length; i++) {
            if (!getNeumatico(i).getMarca().equals("")) {

                mensaje += getNeumatico(i).getMarca() + "\t"
                        + getNeumatico(i).getTamRing() + "\t"
                        + getNeumatico(i).getVelMax() + "\t"
                        + getNeumatico(i).getPerfilCarga() + "\t"
                        + getNeumatico(i).getAnchoNominal() + "\n";
            }
        }

        return mensaje;

    }

    public String mostrarNeumatico(int pos) {

        String mensaje = "Marca: " + getNeumatico(pos).getMarca() + " Tamaño de Ring: " + getNeumatico(pos).getTamRing() + " Velocidad Max: " + getNeumatico(pos).getVelMax() + "Perfil de Carga: " + getNeumatico(pos).getPerfilCarga() + " Ancho Nominal: " + getNeumatico(pos).getAnchoNominal();

        return mensaje;
    }

    public void nuevoNeumatico(Neumatico nuevoNeumatico) {
        if (contl < neumaticos.length) {
            setNeumatico(contl, nuevoNeumatico);
            contl++;

        } else {
            JOptionPane.showMessageDialog(null, "Capacidad de la memoria llena, no se pueden ingresar más neumaticos");
        }
    }

    public boolean verificarPerfildeCarga(int perfildeCarga) {

        boolean find = false;
        for (int i = 0; i < neumaticos.length; i++) {

            if (perfildeCarga == getNeumatico(i).getPerfilCarga()) {

                find = true;

            }

        }

        return find;

    }

}
