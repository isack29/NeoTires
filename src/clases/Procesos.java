package clases;

import javax.swing.JOptionPane;

public class Procesos {

    //Creacion vector (set y get)
    //Llenar arreglo de instancias nulas
    //Mostrar neumatica.
    //Metodo agreegar (Parametro Neumatico, (If verificar id))
    Neumatico neumaticos[] = new Neumatico[1000];

    int contl = 0;

    public void llenarListaNeumaticos() {

        for (int i = 0; i < neumaticos.length; i++) {

            Neumatico n = new Neumatico();

            neumaticos[i] = n;

        }
    }

    public void setListaNeumaticos(int pos, String marca, int tamRing, char velMax, int perfilCarga, int anchoNominal) {

        Neumatico n = new Neumatico();

        n.setMarca(marca);
        n.setTamRing(tamRing);
        n.setVelMax(velMax);
        n.setPerfilCarga(perfilCarga);
        n.setAnchoNominal(anchoNominal);

        neumaticos[pos] = n;

    }

    public Neumatico getNeumatico(int pos) {

        return neumaticos[pos];
    }

    public String mostrarListaNeumaticos() {

        String mensaje = "Marca\tTamaño de Ring\tVelocidad Max\tPerfil de Carga\tAncho Nominal\n";

        for (int i = 0; i < neumaticos.length; i++) {

            mensaje += getNeumatico(i).getMarca() + "\t" + getNeumatico(i).getTamRing() + "\t" + getNeumatico(i).getVelMax() + "\t" + getNeumatico(i).getPerfilCarga() + "\n" + getNeumatico(i).getAnchoNominal();

        }

        return mensaje;

    }

    public String mostrarNeumatico(int pos) {

        String mensaje = "Marca: " + getNeumatico(pos).getMarca() + " Tamaño de Ring: " + getNeumatico(pos).getTamRing() + " Velocidad Max: " + getNeumatico(pos).getVelMax() + "Perfil de Carga: " + getNeumatico(pos).getPerfilCarga() + " Ancho Nominal: " + getNeumatico(pos).getAnchoNominal();

        return mensaje;
    }

    public void agregarNeumatico(int pos, String marca, int tamRing, char velMax, int perfilCarga, int anchoNominal) {

        if (contl < neumaticos.length) {

            setListaNeumaticos(pos, marca, tamRing, velMax, perfilCarga, anchoNominal);
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
