package clases;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Procesos {

    //Creacion vector (set y get)
    //Llenar arreglo de instancias nulas
    //Mostrar neumatica.
    //Metodo agreegar (Parametro Neumatico, (If verificar id))
    Neumatico neumaticos[] = new Neumatico[1000];

    metodosOrdenamiento mO;

    List<Neumatico> listNeumaticos = new ArrayList<>();

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

        for (int i = 0; i < 1000; i++) {

            if (getNeumatico(i).getTamRing() == 0) {
                continue;

            }
            mensaje += getNeumatico(i).getMarca() + "\t" + getNeumatico(i).getTamRing() + "\t" + getNeumatico(i).getVelMax() + "\t" + getNeumatico(i).getPerfilCarga() + "\n" + getNeumatico(i).getAnchoNominal();

        }
        return mensaje;

    }

    public String mostrarNeumatico(int pos) {

        String mensaje = "Marca: " + getNeumatico(pos).getMarca() + " Tamaño de Ring: " + getNeumatico(pos).getTamRing() + " Velocidad Max: " + getNeumatico(pos).getVelMax() + "Perfil de Carga: " + getNeumatico(pos).getPerfilCarga() + " Ancho Nominal: " + getNeumatico(pos).getAnchoNominal();

        return mensaje;
    }

    public void agregarNeumatico(String marca, int tamRing, char velMax, int perfilCarga, int anchoNominal) {

        if (contl < 1000) {

            if (verificarPerfildeCarga(perfilCarga) == false) {

                listNeumaticos.add(new Neumatico(marca, tamRing, velMax, perfilCarga, anchoNominal));
                setListaNeumaticos(contl, marca, tamRing, velMax, perfilCarga, anchoNominal);
                //mO.setNE(contl, marca, tamRing, velMax, perfilCarga, anchoNominal);
                System.out.println(contl);

                contl++;

            } else {

                JOptionPane.showMessageDialog(null, "El perfil de carga ya existe");
            }

        } else {

            JOptionPane.showMessageDialog(null, "Capacidad de la memoria llena, no se pueden ingresar más neumaticos");
        }
    }

    public boolean verificarPerfildeCarga(int perfildeCarga) {

        boolean find = false;
        for (int i = 0; i < neumaticos.length; i++) {

            if (getNeumatico(i) == null) {
                continue;
            }

            if (perfildeCarga == getNeumatico(i).getPerfilCarga()) {
                find = true;
                break;

            }

        }

        return find;

    }

    public String busquedadLineal(int perfilDeCarga) {
        metodosBusqueda mB = new metodosBusqueda();
        String ms = "";

        ms = mB.buscarPorPerfildeCarga(perfilDeCarga, neumaticos);

        return ms;

    }

    public Neumatico[] metodosOrdenamiento(String metodo) {
        
        
        mO = new metodosOrdenamiento(neumaticos);
        if (metodo.equals("Burbuja")) {
            neumaticos = mO.ordenarBurbuja();
            System.out.println(mO.mostrarListaNeumaticos());
        } else if (metodo.equalsIgnoreCase("intercambio")) {
            neumaticos = mO.ordenarIntercambio();

        } else if (metodo.equalsIgnoreCase("Quicksort")) {
            neumaticos = mO.ordenarQuicksort(0, neumaticos.length - 1);

        } else if (metodo.equalsIgnoreCase("Compare to")) {

        } else if (metodo.equalsIgnoreCase("Comparable")) {

        }
        return neumaticos;
    }

}
