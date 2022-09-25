package clases;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class Procesos {

    Neumatico[] neumaticos;
    int contl;

    metodosBusqueda busquedas;
    metodosOrdenamiento metodosOrdenamiento;

    public Procesos() {
        neumaticos = new Neumatico[100];
        contl = 0;

        busquedas = new metodosBusqueda();
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

    public String mostrarNeumatico(int pos) {
        String mensaje = "Marca: " + getNeumatico(pos).getMarca() + "\n Tamaño de Ring: " + getNeumatico(pos).getTamRing() + "\n Velocidad Max: " + getNeumatico(pos).getVelMax() + "\n Perfil de Carga: " + getNeumatico(pos).getPerfilCarga() + "\n Ancho Nominal: " + getNeumatico(pos).getAnchoNominal();
        return mensaje;
    }

    public void nuevoNeumatico(Neumatico nuevoNeumatico) {
        if (contl < neumaticos.length) {
            if (!verificarPerfildeCarga(nuevoNeumatico.getPerfilCarga())) {
                setNeumatico(contl, nuevoNeumatico);
                contl++;
                JOptionPane.showMessageDialog(null, "Se agrego correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "Ya hay un un neumatico con este perfil de carga");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Capacidad de la memoria llena, no se pueden ingresar más neumaticos");
        }
    }

    public String buscarPorPerfilCarga(String metodo, int perfilCarga) {
        String respuesta = "";
        if (metodo.equals("Lineal")) {
            respuesta = busquedas.buscarPorPerfildeCargaLineal(perfilCarga, neumaticos);
        }

        if (metodo.equals("Binaria")) {
            respuesta = busquedas.buscarPorPerfildeCargaBinaria(perfilCarga, neumaticos);
        }
        return respuesta;
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

    //Metodos de ordenamiento
    public void metodosOrdenamiento(String metodo) {

        metodosOrdenamiento = new metodosOrdenamiento(neumaticos);

        if (metodo.equals("Burbuja")) {
            neumaticos = copyNeumaticos(metodosOrdenamiento.ordenarBurbuja());

        } else if (metodo.equalsIgnoreCase("intercambio")) {
            neumaticos = copyNeumaticos(metodosOrdenamiento.ordenarIntercambio());

        } else if (metodo.equalsIgnoreCase("Quicksort")) {
            neumaticos = copyNeumaticos(metodosOrdenamiento.ordenarQuicksort(0, neumaticos.length - 1));

        } else if (metodo.equalsIgnoreCase("Comparator")) {

            Arrays.sort(neumaticos, new OrdenarMarca());

        } else if (metodo.equalsIgnoreCase("Comparable")) {
            Arrays.sort(neumaticos);
        }

    }

    public Neumatico[] copyNeumaticos(Neumatico[] Array) {
        return Arrays.copyOf(Array, Array.length);
    }

    //Model para la tabla
    public ArrayList<Object[]> datosTablaModel() {
        ArrayList<Object[]> list = new ArrayList();
        for (Neumatico n : neumaticos) {
            if (!n.getMarca().equals("")) {
                list.add(new Object[]{
                    n.getMarca(),
                    n.getTamRing(),
                    n.getVelMax(),
                    n.getPerfilCarga(),
                    n.getAnchoNominal()
                });
            }
        }
        return list;
    }

}
