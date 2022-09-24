package neotires;

import clases.Neumatico;
import clases.Procesos;
import clases.metodosBusqueda;
import clases.metodosOrdenamiento;

public class NeoTires {

    public static void main(String[] args) {

        Procesos p = new Procesos();

        metodosBusqueda mB = new metodosBusqueda();

        p.llenarListaNeumaticos();
        //mO.llenarListaNeumaticos();

        p.agregarNeumatico("Honda", 105, 'X', 92, 250);
        p.agregarNeumatico("Susuki", 100, 'S', 90, 200);

        System.out.println("SIN ORDENAR");
        System.out.println(p.mostrarListaNeumaticos());
        System.out.println(p.busquedadLineal(92));
        
        System.out.println("Ordenado");
        p.metodosOrdenamiento("burbuja");
        
        
        

    }

}
